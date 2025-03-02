package myPackage;
import java.util.Scanner;
public class Jat_task5_p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anna University Grading System
		//The newly appointed Vice chancellor of Anna University wanted to create an automated grading system
		//for the students to check their grade.When a atudent enters a mark,the grading system displays a corresponding grade
		//write a program to solve the given problem
		//The grades for marks 100 : S ,90-99 : A , 80-89 : B ,70-79 : C , 60-69 : D, 50-59 : E, Less than 50 : F
		//Input Format :The input consists of one integer which corresponds to the marks scored by the student.
		//Output Format: If a student marks greater than 100, print "Invalid Input" ,Otherwise print the grade
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your marks, oh noble student:");
		float marks=s.nextFloat();
		if(marks>100)
		{
			System.out.println("Alas! Your number defies reason. 'Invalid Input!'");
		}else if(marks==100)
		{
			System.out.println("Supreme Scholar! Thou art an 'S' – the Sage of Scores!");
		}else if(marks>=90 && marks<=99)
		{
			System.out.println("Magnificent! Thy wisdom earns thee an 'A' – Almost Divine!");
		}else if(marks>=80 && marks<=89)
		{
			System.out.println("Brilliant! Thou hath secured a 'B' – Beaming with Brilliance!");
		}else if(marks>=70 && marks<=79)
		{
			System.out.println("ommendable! 'C' stands for Consistent Conqueror of Challenges!");
		}else if(marks>=60 && marks<=69)
		{
			System.out.println("Determined! 'D' for Diligence, yet the journey continues!");
		}else if(marks>=50 && marks<=59)
		{
			System.out.println("Enduring! 'E' means Effort is seen, but Excellence awaits!");
		}else if(marks<50)
		{
			System.out.println("Fear not! 'F' is but a Footstep toward a Future of Fortune!");
		}
		
	}

}
