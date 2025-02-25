package myPackage;
import java.util.Scanner;
public class Jat_task5_p1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Write a program to check whether a given string is a palindrome or not using for loop and if-else statement.
		Scanner s= new Scanner(System.in);
		System.out.println("Ener the string, I will check if it is a Palindrome");
		String chkstr= s.nextLine();
		StringBuilder chkstr2= new StringBuilder();
		for (int i=chkstr.length()-1;i>=0;i--)
		{
			chkstr2.append(chkstr.charAt(i));
		}
		
		if(chkstr.equals(chkstr2.toString()))
		{
			System.out.println("The entered string is a palindrome");
		}
		else
			
		{
			System.out.println("The enetered string is not a palindrome");
		}

}

}