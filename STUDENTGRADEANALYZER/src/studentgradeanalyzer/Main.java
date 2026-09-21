package studentgradeanalyzer;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String continueChoice;
		
		System.out.println("Welcome To The Student Grade Analyzer");
		
		// Do While loop: process multiple students
		
		do {
			System.out.println("Enter Name of Student:");
			String Nameofstudent = input.nextLine();
			System.out.println("\nEnter number of subjects:");
			int numberSubjects = input.nextInt();
			
			double total = 0;
			
			// for loop
			for (int i = 1; i<= numberSubjects; i++) {
				double mark;
				
				//while loop: validate the mark
				
				while(true) {
					System.out.println("Enter mark for subject " + i + "(0-100)");
					mark = input.nextDouble();
				
					if (mark >= 0 && mark <= 100) {
						break; //valid mark
						
					}
					System.out.println("invalid mark! Please enter a value between 0 and 100.");
				}
				
				total += mark;
				
			}
			double average = total / numberSubjects;
			
			//Ternary operator for letter grade
			String grade = (average >= 80) ? "A" : (average >= 70) ? "B" : (average >=60) ? "C" : (average >= 50) ? "D" : "F" ;
			
			//Ternary operator for pass/fail
			String result = (average >= 50) ? "PASS" : "FAIL";
				
			
			System.out.println("\n Results");
			System.out.println("Average");
			System.out.println("Grade : " + grade);
			System.out.println("Result : " + result);
			
			System.out.println("\nDo you want to Analyze another student? (y/n): ");
			continueChoice = input.next();
			
		} while (continueChoice.equalsIgnoreCase("y"));
		System.out.println("Thank you for using the Grade Analyzer!");
		input.close();

	}

}
