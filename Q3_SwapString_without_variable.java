package second;

public class Q3_SwapString_without_variable {

	public static void main(String[] args) {

		 String a ="bala";
		 String b = "raji";

		 a=a+b;
		 b=a.substring(0,b.length());
		 a=a.substring(b.length());
		 System.out.println(a);
	}

}
