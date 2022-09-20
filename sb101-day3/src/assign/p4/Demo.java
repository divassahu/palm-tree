package assign.p4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {
	public static void main(String[] args) {
		Map<String, Map<String, List<String>>> countriesStatesCities = new HashMap<String, Map<String,List<String>>>();
		List <String> cities = new ArrayList<String>();
		cities.add("Surat");
		cities.add("Ahmedabad");
		cities.add("Baroda");

		List <String> cities1= new ArrayList<String>();
		cities1.add("Bhopal");
		cities1.add("Indore");

		Map<String, List<String>> state = new HashMap<String, List<String>>();
		state.put("Gujrat", cities);
		state.put("MadhyaPradesh", cities1);

		countriesStatesCities.put("India", state);

		Iterator<Entry<String, Map<String, List<String>>>> it = countriesStatesCities.entrySet().iterator();
		while (it.hasNext()) {
		Map.Entry pairs = (Map.Entry)it.next();
		System.out.println(pairs.getKey() + " -> " + pairs.getValue());
	}
}
