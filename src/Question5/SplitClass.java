package Question5;
import java.util.Scanner;

public class SplitClass {

	String name;
	String country;
	String skill;
	
	SplitClass(String n,String c,String s)
	{
		this. name= n;
		this. country= c;
		this. skill=  s;
	}
	void PlayerDetails() 
	{
	
		System.out.println("Player Details");
		System.out.println("Player Name: "+name);
		System.out.println("Country Name: "+country);
		System.out.println("skill: "+skill);
	}
	
	
	
}



