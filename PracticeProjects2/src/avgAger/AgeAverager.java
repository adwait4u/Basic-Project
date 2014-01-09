package avgAger;
import java.util.Scanner;

public class AgeAverager {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		int ageTotal = 0;
		int age = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the first persons age or -1 to quit");
		
		age = in.nextInt();
		
		while (age != -1){
			ageTotal +=  age;
			num++;
			System.out.println("Please enter the next persons age or -1 to quit");
			age = in.nextInt();
			
		}
		
		
		System.out.println("The number of people entered -> " +num);
		
		System.out.println("The average age of the people is -> " +ageTotal/num);
	}

	
}
