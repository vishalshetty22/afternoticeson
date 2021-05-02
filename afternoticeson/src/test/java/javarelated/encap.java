package javarelated;

public class encap {
	public static void main(String[] args) {
		en e=new en();
		e.setK(55);
		System.out.println(e.getK());
		
	}
}
	
	class en{
		 private int k;
		public void setK(int m){
			k=m;
		}
		public int getK() {
			return k;
		}
	}

	
