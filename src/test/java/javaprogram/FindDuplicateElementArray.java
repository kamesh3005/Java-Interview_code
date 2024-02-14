package javaprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementArray {

	public static void main(String[] args) {

		String name[] = { "java", "selenium", "python", "mysql", "oracel", "java", "python" };

		String value = "";
		boolean flage = false;

		for (int i = 0; i < name.length; i++) {

			for (int j = i + 1; j < name.length; j++) {
				if (name[i] == name[j]) {

					System.out.println("Duplicate Element found " + name[i]);
					flage = true;
				}

			}

		}
		if (flage == false) {

			System.out.println("Duplicate Element is not found...");
		}

		// Approach 2
		System.out.println("***********Hash set****************");
		HashSet<String> data = new HashSet<String>();
		for (String nam : name) {

			if (data.add(nam) == false) {

				System.out.println(nam);
			}
		}
		
		//Approach 3
		System.out.println("**************HashMap******************");
		
		HashMap<String, Integer>hmap=new HashMap<String,Integer>();
			for(String nam:name) {
				Integer count = hmap.get(nam);
				if(count==null) {
					
					hmap.put(nam, 1);
				}
				else {
					
					hmap.put(nam, ++count);
				}
				
			}
			Set<Entry<String, Integer>> entrySet = hmap.entrySet();
			
			for(Entry<String, Integer> enter:entrySet) {
				if(enter.getValue()>1) {
					System.out.println(enter.getKey());
					
				}
				
				
			}
	}

}
