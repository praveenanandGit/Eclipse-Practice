package basicPracticeQuestion;

import java.util.Scanner;

public class Basic5 {
	
		
	public static void main(String[] args) {
		
		  Scanner myobj= new Scanner(System.in);
		  System.out.println("Enter 1st number:");
		  int num1=myobj.nextInt();
		  System.out.println("Enter 2nd Number:");
		  int num2=myobj.nextInt();
		  System.out.println("Enter 3rd Number:");
		  int num3=myobj.nextInt();
		  int avg=(num1+num2+num3)/3;
		  System.out.println("Average:"+avg);
	}

}
