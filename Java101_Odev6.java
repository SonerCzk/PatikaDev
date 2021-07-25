import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	  
	   double height,weight,bmi;
	   System.out.print("Enter your height please:");
	   height= input.nextDouble();
	   System.out.print("Enter your weight please:");
	   weight=input.nextDouble();
	   bmi = weight/(height*height);
	   System.out.println("Your body index :"+bmi);
	  
	}

}
