package mobilePass;

import java.util.*;

public class Mobile {
	public static HashMap<String,ArrayList<String>> mobiles=new HashMap<>();
	public static ArrayList<String> list=new ArrayList<>();
	public static String s;
	public String AddMobile(String company,String model) {
		ArrayList <String> list1=new ArrayList<>();
		
		if(mobiles.containsKey(company)==false) {
			list1.add(model);
			
			mobiles.put(company,list1);
		}else {
			list1=mobiles.get(company);
			list1.add(model);
			mobiles.replace(company, list1);
		}
		
		return "model successfully added";
	}
	

	public static void main(String[] args) {
		Mobile m=new Mobile();
		String str=m.AddMobile("vivo", "m1");
		m.AddMobile("vivo", "m2");
		m.AddMobile("sony", "m1");
		System.out.println(str);
		System.out.println(mobiles);

	}

}
