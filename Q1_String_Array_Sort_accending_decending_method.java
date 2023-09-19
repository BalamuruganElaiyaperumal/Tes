package second;

import java.util.Arrays;
import java.util.Collections;

public class Q1_String_Array_Sort_accending_decending_method {
	public static void main(String[]args) {
		
		String[] a = {"bala","kamal","abi","yash","david"};
		Arrays.sort(a);
        System.out.println(Arrays.toString(a));
     
		Arrays.sort(a,Collections.reverseOrder());
	      System.out.println(Arrays.toString(a));



	

}
}