package javarelated;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class patternregexp {

	public static void main(String[] args) {
//		boolean m = Pattern.matches("s", "sampa");
//		System.out.println(m);
		Pattern pat = Pattern.compile("a");
		Matcher mat = pat.matcher("jajaya");
		boolean find = mat.find();
		boolean matches = mat.matches();
		System.out.println(find);
		System.out.println(matches);
		while (mat.find()) {
			System.out.println(mat.group());
			
			System.out.println(mat.start());
			System.out.println(mat.end());
		}

	}
}
