package myPackage;
import java.util.Scanner;
public class Jat_task5_p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to find the largest number among three numbers
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int fnum=s.nextInt();
		int snum=s.nextInt();
		int tnum=s.nextInt();
		if(fnum>snum)
		{
			if(fnum>tnum)
			{
				System.out.println(fnum +" is the largest number");
			}
			else
			{
				System.out.println(tnum +"is the largest number");
			}
		}
		else
		{
			if(snum>tnum)
			{
				System.out.println(snum +"is the largest");
			}
			else
			{
				System.out.println(tnum +" is the largest");
			}
			
		}
		

	}

}
