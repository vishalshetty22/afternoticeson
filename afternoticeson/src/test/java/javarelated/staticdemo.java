package javarelated;

public class staticdemo {

	public static void main(String[] args) {
	  mana m1=new mana();
	  mana m2=new mana();
	
	  m1.show();
	  m2.show();

	}
}


	class mana{
		int eid;
		static String ceo;
		int salary;
		
		public void show() {
		  	System.out.println("Employee id is :"+eid+"salary :"+salary+" ceo is :"+ceo);
		}
		
       public mana() {
    	  eid=7;
    	  salary=4000;
    	  System.out.println("non static");
         }
       
       static{
    	   ceo="haan bhai";
    	   System.out.println("static");
       }
		
	}


