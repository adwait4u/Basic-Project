package hashingPkg;
import java.util.*;

public class FindMaxims {
	
	public static void findMax(){
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			 int max2 = a[i];
			if(a[i] > max && max2 > max){
				max = a[i];
				hm1.put(max, null);
			}else{
				continue;
			}
		  
		}
	}

	
	public static void main(String[] args) {
		findMax();
	}
	
	//variables
	private static Map<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
	private static int[] a = {1,9,4,7,8,3,5};

}
