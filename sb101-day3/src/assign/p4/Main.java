package assign.p4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		HashMap<String, List<String>> hm = new HashMap<>();
		
		hm.put("Maharashtra", Arrays.asList("Mumbai","Pune","Thane"));
		hm.put("UP", Arrays.asList("Kanpur","Allahabad","Lucknow"));
		hm.put("MP", Arrays.asList("Indore","Bhopal","Singrauli"));
		hm.put("Rajasthan", Arrays.asList("Alvar","Udaipur","Jaipur"));
		
		 Set<Map.Entry<String,List<String>>> set = map.entrySet();
		 
		 Comparator<Map.Entry<String,List<String>>> hm = (s1,s2)->{
			   return s1.getKey()>s2.getKey()?1:-1;
		   };
		 
		
			
		
	}
}
