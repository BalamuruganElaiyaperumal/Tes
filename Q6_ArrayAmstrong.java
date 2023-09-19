package second;

public class Q6_ArrayAmstrong {

	public static void main(String[] args) {
		
		int d1,d2,d3,temp;
	for(int i=100; i<999; i++) {
		temp=i;
	
		d3=temp%10;
		temp=temp/10;
		
		d2=temp%10;
		temp=temp/10;
	 
		d1=temp%10;
			
		
		int r=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
		
		if(i==r) {
			System.out.println(i);
					
			}
			
	}
	}

}
