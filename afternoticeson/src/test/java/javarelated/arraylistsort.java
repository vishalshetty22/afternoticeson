package javarelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraylistsort {
	public static void main(String[] args) {
		List<String> Li=new ArrayList<String>();
		Li.add("z");
		Li.add("y");
		Li.add("x");
		int size = Li.size();
		System.out.println(size);
		Collections.sort(Li);
		for (String data : Li) {
			System.out.println(data);
		}
		
		String[] str= {"z","x","y","v"};
		int len = str.length;
		System.out.println(len);
		List<String> Lis=new ArrayList<String>(Arrays.asList(str));
		System.out.println(Lis.size());
		Collections.sort(Lis);
		for (String data1 : Lis) {
			System.out.println(data1);
		}
	}
	

	

}
