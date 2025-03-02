package myPackage;
import java.util.Scanner;
public class Jat_task5_p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to print the hotel tarrif. The room rent is 20% high during peak seasons.(April- June, November to December
		//Note:Use the switch Construct
		//Input Format:
		//The first Input containing an integer which denotes the number of the month
		//The second input containing the floating point number which denotes the room rent per day
		//The third input containing an integer which denotes the number of days stayed in the hotel
		//Output format:
		//Print the hotel tarrif to be paid in floating point with two decimal places
		//sample input : 3,1500,2
		//sample output: 3000
		
		Scanner s= new Scanner(System.in);
		System.out.println("Welcome to Hotel JavaVerse! Let's calculate your tariff.");
		System.out.println("Enter the number of the month (1-12):");
		int month=s.nextInt();
		System.out.println(" Enter the rent amount per day:");
		float rent=s.nextFloat();
		System.out.println("Enter the number of days you stayed:");
		int days=s.nextInt();
		switch (month)
		{
		 case 4:case 5: case 6: case 11: case 12:
			 rent=rent+rent*0.2f;
			 break;
		}
		float tarrif=rent*days;
		 System.out.printf("Your grand total, fit for royalty ::"+"%.2f%n", tarrif);
		 System.out.println("Whether peak or plain, your stay was not in vain!");
	}

}
