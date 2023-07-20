package operators;
/*
 1.Write a Java program that prompts the user to enter their age. 
 The program should check if the age is between 18 and 30 (inclusive) and 
 print "Eligible for Job" if true, 
 or "Not Eligible for Job" otherwise.
 */

import java.util.Scanner;
public class EligibilityForJob {

	public static void main(String[] args) {
		

		// input from the user
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter Your age:");
				// input for enter age
				int age=sc.nextInt();
				
				// print eligible if age is between 18&30
				
				
				if(age>=18 && age<=30) {
				System.out.println("eligible for job ");}
				
				// print not eligible if age is not between 18&30	
				else {
				System.out.println("not eligible for job ");}
		sc.close();  

		/*
				// input from the user 
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter Their Age:");
				int age=sc.nextInt();
				
				boolean eligible=age>=18 && age<=30;
				System.out.println("eligible for job " + eligible);
			
				boolean notEligible=age<18 || age>30;
				System.out.println("Not Eligible For Job"+notEligible);
				
				sc.close();*/
			}

		}

