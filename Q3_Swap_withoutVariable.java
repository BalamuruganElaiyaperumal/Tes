package second;

public class Q3_Swap_withoutVariable {

	public static void main(String[] args) {

		int x=10;
		int y =20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(y);
		System.out.println(x);

	}

}
