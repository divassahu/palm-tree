package com.prospecta.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.prospecta.model.Entry;
import com.prospecta.model.EntryDB;
import com.prospecta.model.Items;
import com.prospecta.model.Result;
import com.prospecta.respository.EntryRepository;

@RestController
public class ApiController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	EntryRepository entryRepository;
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
	
	@GetMapping("/cat")
	public ResponseEntity<String> getCat(){
		String url = "https://api.publicapis.org/categories";
		RestTemplate template = new RestTemplate();
		String result = template.getForObject(url,String.class);
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	
	@GetMapping("/cat2")
	public ResponseEntity<List<Result>> getCat2(@RequestParam("category") String category){
		String url = "https://api.publicapis.org/entries";
		Items i = restTemplate.getForObject(url,Items.class);
		List<Entry> entries= i.getEntries();
		
		List<Result> list = new ArrayList<>();
		
		for(Entry en:entries) {
			if(en.getCategory().equals(category)) {
				list.add(new Result(en.getApi(),en.getDesciption()));
			}
		}
		
		
		return new ResponseEntity<List<Result>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEntries(@RequestBody Entry entry){
		
//		String url = "https://api.publicapis.org/entries";
//		Items i = restTemplate.getForObject(url,Items.class);
//		List<Entry> entries= i.getEntries();
		
//		entries.add(entry);
		
		EntryDB db = new EntryDB();
		db.setApi(entry.getApi());
		db.setAuth(entry.getAuth());
		db.setCategory(entry.getCategory());
		db.setCors(entry.getCors());
		db.setDesciption(entry.getDesciption());
		db.setHTTPS(entry.isHttps());
		
		
		
		entryRepository.save(db);
//		entryService.addEntry(entry);
		
		return new ResponseEntity<String>("Saved !",HttpStatus.OK);
	}

}
