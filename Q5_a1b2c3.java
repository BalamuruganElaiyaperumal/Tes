package second;


public class Q5_a1b2c3 {

	public static void main(String[] args) {
		String a="a1b2c3";
		String[] b=a.split("");
		for(int i=0; i<b.length; i=i+2) {
			int c=Integer.parseInt(b[i+1]);
			for(int j=0; j<c; j++) {
				
				System.out.println(b[i]);
			}
		}

	}

}
