package conditionalOperator;

import java.util.HashSet;
import java.util.Set;

public class sumnumber {
public static void main(String[] args) {
	int[] a= {10,3,7,6,7,8,5,8,0,13,0,5,6,8};
	Set<String> h=new HashSet();
	for(int i=0;i<a.length-1;i++) {	
		for(int j=i+1;j<a.length;j++) {
			if(a[i]+a[j]==13) {
				String res=a[i]<a[j]? "("+a[i]+" ,"+a[j]+")" :"("+a[j]+" ,"+a[i]+")";
				h.add(res);
			}
			}
		}
	System.out.println(h);
	}
}