
package second;

public class Q1_StringSort_Revere_loop {

	public static void main(String[] args) {
		String a ="balaji";
        char[] b=a.toCharArray();

        for(int i=0; i<b.length; i++) {
            char temp=b[0];
        	for(int j=i+1; j<b.length; j++) {
        		if(b[i]>b[j]) {//< reverse
        			temp=b[i];
        			b[i]=b[j];
        			b[j]=temp;
        		}
        
        	}
        System.out.println(b[i]);
        }
		
	}

}
