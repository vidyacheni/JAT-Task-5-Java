package myPackage;
import java.util.Scanner;
public class Jat_task5_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that reads in a string from the user 
		//and uses a loop to reverse the order of the characters in the string. 
		//Then, output the reversed string.
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string.I will reverse it");
		String str= s.nextLine();
		StringBuilder revstr= new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr.append(str.charAt(i));
		}
	   System.out.println("The reversed string is ::" + revstr);
	}
}
