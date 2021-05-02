package javarelated;

public class inter {
//public static void main(String[] args) {
//	latest lat=new latest();
//	lat.m();
//	lat.n();
//	lat.o();
//}
//}
//
//interface int1{
//	public void m();
//}
//interface int2{
//	public void n();
//}
//interface int3 extends int1,int2{
//	public void o();
//}
//
//class latest implements int3{
//	public void m() {
//		System.out.println("m");
//	}
//
//	public void n() {
//		System.out.println("n");
//	}
//
//	public void o() {
//		System.out.println("o");
//	}
	
public static void main(String[] args) {
	man m=new man();
	m.sam("hari");
	int newi = m.sam(6);
	System.out.println(newi);
}	
}

class man{
	String s="amar";
	int k=33;
	public void sam(String s) {
		System.out.println(s);
	}
	public int sam(int k) {
		System.out.println(k);
		return k;
	}
}
class superman extends man{
	public void sam(String s) {
		System.out.println(s);
	}
	public void bam(int k) {
		System.out.println(k);
	}
}
