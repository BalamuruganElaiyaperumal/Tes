package second;

public class Q6_Amstrong {
	public static void main(String[]args) {
		
	int number =567;
	int temp=number;
	
	int d1,d2,d3;
	d3=temp%10;
	temp=temp/10;
	
	d2=temp%10; 
	temp=temp/10;
	 
	d1=temp%10;
	
	int c=d1+d2+d3;
	
	System.out.println(c);
			
	int r=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
	
	if(number==r) {
		System.out.println("yes");
				
		}
		else {
			System.out.println("no");
			
		}
	
	}
	

}
