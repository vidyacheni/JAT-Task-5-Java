package myPackage;
import java.util.Scanner;
public class Jat_task5_p3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Write a program to print the given below pattern.
		//Sample Input:
		//4
		//Sample Output:
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number for the pattern");
		int pnum=s.nextInt();
		int num=1;
		//number of rows= input number (here 4)
		//number of cols= the number (for first row , one col, for second row, two cols, for third row, three cols,for fourth row,four cols)
		//value of the printed number=number = 
		for(int i=1;i<=pnum;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.print(" \n");	
		}
		
			
				
	}

}


