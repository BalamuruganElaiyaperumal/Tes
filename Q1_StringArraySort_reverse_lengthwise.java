package second;

public class Q1_StringArraySort_reverse_lengthwise {

	public static void main(String[] args) {
		String[] a = {"rajibbn","mani","kaml","yogesh","arun"};

		for(int i=0; i<a.length; i++) {
			String b=a[0];
			for(int j=i+1; j<a.length; j++) {
				if(a[i].length()>a[j].length()) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
					
				}
			
			
			}
		
		System.out.println(a[i]);
			
		}
	}

}
