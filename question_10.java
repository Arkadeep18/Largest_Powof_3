import java.util.*;
public class question_10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int power = 1;
		
		//largest power of 3 less than or equal to n
	
		while(3*power<=n) {
			power= power*3;
		}
		System.out.println(power);
		
		
		
		
		
//		do {
//			power = power*3;
//		}while(3*power<=n);
//		
//		System.out.println(power);
	}
}