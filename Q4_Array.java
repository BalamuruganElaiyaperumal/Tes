package second;

public class Q4_Array {

  public String[] rev(String[] a) {
	  String[] r=new String[a.length];
	  for(int i=0; i<a.length; i++){
		  String x=a[i];
		  String y="";
		  for(int j=x.length()-1; j>=0; j-- ) {
			  y=y+x.charAt(j);
		  }
		  r[i]=y;
				  
	  }
	return r;
		
	}
}
