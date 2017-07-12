package exam;

public class Model {
	public Model(){
		String  s1 = sM1("1");
	   }
	   String s3 = sM1("2");
	   {
	     String s1 = sM1("3");
	   }
	  static{
	      s1 = sM1("b");
	   }
	   static String s1 = sM1("a");
		  
	   static String s2 = sM1("c");
	   String s4 = sM1("4");
	   private static String sM1(String s){
	       System.out.println(s);  return s;
	    }
	

}
