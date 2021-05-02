package javarelated;

public class finaltest {
	public static void main(String[] args) {
		meter m=new meter();
		m.k="jan";
		m.son();
		m.man();
	}
}

class meter{	
	 String k="amar";
 void man() {
	 System.out.println("man");
 }
 
 public void son() {
	 System.out.println(k);
 }
}

class seter extends meter{
	public void man() {
		 System.out.println("man");
	 }
	
}