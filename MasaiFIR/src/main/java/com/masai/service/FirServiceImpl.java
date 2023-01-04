package com.masai.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.exception.FirException;
import com.masai.model.Fir;
import com.masai.model.FirDTO;
import com.masai.model.User;
import com.masai.repository.FirRepository;
import com.masai.repository.UserRepository;

@Service
public class FirServiceImpl implements FirService{
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private FirRepository firRepo;

	@Override
	public Fir FileAnFire(FirDTO firDTO) throws FirException {
		// TODO Auto-generated method stub
		List<Long> users=firDTO.getUserIds();
		if(users.size()>0) {
			String userName=firDTO.getUserName();
			Optional<User> useropt=userRepo.findByUsername(userName);
			if(useropt.isPresent()) {
				Fir firObj=new Fir();
				User userObj=useropt.get();
				
				firObj.setCrimeDetails(firDTO.getCrimeDetails());
				firObj.setPoliceStation(firDTO.getPoliceStation());
				firObj.setTmeStamp(LocalDateTime.now());
				
				users.forEach((id)->{
					
					Optional<User> user=userRepo.findById(id);
					if(user.isPresent()) {
						firObj.getAgainstUser().add(user.get());
					}
				});
				firObj.setUser(useropt.get());
				
				Fir saved = firRepo.save(firObj);
				userObj.getFir().add(saved);
				userRepo.save(userObj);
				
				return saved;
				
			}else {
				throw new UsernameNotFoundException(userName+" Not Found !");
			}
		}else {
			throw new FirException("Filing FIR Against No User !");
		}
	}


	@Override
	public List<Fir> getAllFirByUser(String userName) throws FirException {
		// TODO Auto-generated method stub
		Optional<User> userOpt=userRepo.findByUsername(userName);
		if(userOpt.isPresent()) {
			List<Fir> filterdList=new ArrayList<>();
			List<Fir> all=firRepo.findAll();
			
			all.forEach((f)->{
				if(f.getUser()==userOpt.get()) {
					filterdList.add(f);
				}
			});
			return filterdList;
		}
		else {
			throw new UsernameNotFoundException(userName+" "+"Not found");
			
		}
	}

	@Override
	public Fir deleteFirByUser(Integer firId) throws FirException {
		// TODO Auto-generated method stub
		
		
		
		Optional<Fir> firOpt=firRepo.findById(firId);
		if(firOpt.isPresent()) {
			
			long hours = ChronoUnit.HOURS.between(firOpt.get().getTmeStamp(), LocalDateTime.now());
			
			if(hours >= 24) {
				firRepo.delete(firOpt.get());
				return firOpt.get();
			}else {
				throw new FirException("You cant Delete FIR in less than 24HRs !");
			}
		}
		else {
			throw new FirException("fir not found");
		}
		
	}

	@Override
	public Fir serchFirByUser(Integer firId) throws FirException {
		// TODO Auto-generated method stub
		Optional<Fir> firOpt=firRepo.findById(firId);
		if(firOpt.isPresent()) {
			return firOpt.get();
		}
		else
		throw new FirException("Fir Not Found");
	}
	
}
