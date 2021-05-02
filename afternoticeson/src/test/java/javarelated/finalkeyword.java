package javarelated;

public class finalkeyword {

	public static void main(String[] args) {
		axe s=new axe();
		s.k=4;
		s.m();
	}
}
	
	class axe{
		int k=3;
		void m() {
			System.out.println(k);
		}
	}
	
	class axem extends axe{
		void m() {
			
		}
	}


