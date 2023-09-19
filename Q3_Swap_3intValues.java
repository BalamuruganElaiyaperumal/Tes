package second;

public class Q3_Swap_3intValues {

	public static void main(String[] args) {

		int a=10;
		int b =20;
		int c=30;
		
		/*a=a+b+c; //10+20+30=60	
		b=a-(b+c); //60-20+30=10
		c=a-(b+c);// 60-10+30=20
		a=a-(b+c);*/
		
		a=a^b^c;
		b=a^b^c;
		c=a^b^c;
		a=a^b^c;

		System.out.println(b);
	}

}
