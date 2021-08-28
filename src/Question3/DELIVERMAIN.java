package Question3;
import java.util.Scanner;

public class DELIVERMAIN {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Over");
		long over = sc.nextLong();
		System.out.println("Enter The Ball");
		long ball = sc.nextLong();
		System.out.println("Enter The Runs");
		long runs = sc.nextLong();
	
		System.out.println("Enter The Bastman Name ");
		String bastman = sc.next();
		System.out.println("Enter The Blower Name ");
		String bolwer = sc.next();
		System.out.println("Enter The NOnStriker Name ");
		String nonStriker = sc.next();
		
		
		
		System.out.println("Over: "+over);
		System.out.println("Ball: "+ball);
		System.out.println("runs: "+runs);
		System.out.println("Bastman: "+bastman);
		System.out.println("Blower: "+bolwer);
		System.out.println("NonStriker: "+nonStriker);
	}

}
