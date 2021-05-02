package javarelated;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class progrelated {
	public static void main(String[] args) {
//		Integer[] k= {1,2,3,2};
//		//1st method
//		HashSet<Integer> LHS=new LinkedHashSet<Integer>();
//		for (Integer data : k) {
//			while (!LHS.add(data)) {
//				System.out.println(data);
//				break;
//			}
//			
//		}
//		System.out.println(LHS);
//		Integer k=1232;
//		String st = Integer.toString(k);
//		char[] ch = st.toCharArray();
//		//Integer[] k= {1,2,3,2};
//		Map<Character,Integer> M=new HashMap<Character,Integer>();
//		for (Character data :ch) {
//			if (M.containsKey(data)) {
//				M.put(data, M.get(data)+1);
//			}else {
//				M.put(data, 1);
//			}
//		}
//
//		Set<Entry<Character, Integer>> ES = M.entrySet();
//		for (Entry<Character, Integer> data1 : ES) {
//			System.out.println(data1.getKey() +"="+ data1.getValue());
//		}

		String str="hi this is 123";
		String[] sp = str.split(" ");
		String m="";
		
		Map<String,Integer> M=new HashMap<String,Integer>();
		for (String data :sp) {
			if (M.containsKey(data)) {
				M.put(data, M.get(data)+1);
			}else {
				M.put(data, 1);
			}
		}

		Set<Entry<String, Integer>> ES = M.entrySet();
		for (Entry<String, Integer> data1 : ES) {
			System.out.println(data1.getKey() +"="+ data1.getValue());
		}
		
	}
}
