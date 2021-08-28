package Question4;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Innings Number ");
		String number = sc.next();
		
		System.out.println("Enter The Bating Team ");
		String battingteam = sc.next();
		
		System.out.println("Enter The No.Of. Runs ");
		String Runs = sc.next();
		
		System.out.println("Innings Details");
		
		System.out.println("Innings Number: "+number);
		System.out.println("Batting Team: "+battingteam);
		System.out.println("Number: "+Runs);
	
	}

}
