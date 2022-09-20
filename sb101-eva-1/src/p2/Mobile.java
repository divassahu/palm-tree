package p2;

import java.util.ArrayList;

public class Mobile {
	
	public String buyMobile(String company, String Model) {
		if(mobileList.containsKey(company)) {
			ArrayList<String> temp=mobileList.get(company);
			if(!temp.isEmpty()) {
				if(temp.contains(Model)) {
					temp.remove(Model);
					mobileList.put(company,temp);
					return "Mobile Added Successfully";
				}
				else {
					return "Item not available";
				}
			}
		}
		return "Item not available";
	}
}
