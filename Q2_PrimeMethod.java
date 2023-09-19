package second;

public class Q2_PrimeMethod {
	
	
	
	public void prime(int[] a) {
		for(int i=0; i<a.length; i++) {
		   boolean b= true;
		   for(int j=2; j<a[i]; j++) {
			   if(a[i]%j==0) {
				   b=false;
			   }
		   }
			if(b==true) {
				System.out.println(a[i]);
			}
		}
	}

}
