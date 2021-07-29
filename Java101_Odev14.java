import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	   
	   int i,b,a;
	   System.out.println("Please enter a number for this operation");
	   a=input.nextInt();
	   int total = 0;
	   b=a;
	   int counter = 0;
	   for(i=0;a!=0;i++) {
		   a=a/10;
		   counter++;
		   
	   }
	   for(i=0;i<counter;i++) {
		   total=b%10+total;
		   b=(b-b%10)/10;
	   }
	   System.out.println(total);
		   }
	}


