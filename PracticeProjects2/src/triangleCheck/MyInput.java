package triangleCheck;
import java.util.*;
public class MyInput {

static Scanner in = new Scanner(System.in);
public static void main(String[] args){
		println("Please enter any three numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
			
			if (isTriangle(a,b,c)){
					println("The numbers make a triangle");
				}else{
					println("The numbers do not make a triangle");
					}

	}

	private static void println(String x){
		System.out.println(x);
		}
	private static boolean isTriangle(int x, int y, int z){
		if (x>=y+z || y>=x+z || z>=x+y)
		{
			return false;
		}else{
			return true;
		}
			
	}



}