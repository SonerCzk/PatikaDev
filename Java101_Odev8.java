import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	   int a,b,result,option;
	   System.out.print("Please enter first number");
	   a=input.nextInt();
	   System.out.print("Please enter second number");
	   b=input.nextInt();
	   System.out.print("1-Addition\n2-Subtraction\n3-Multiplication\n4-Dividing");
	   option=input.nextInt();
	   switch(option) {
	   case 1:
		   result=a+b;
		   System.out.println("Result is :"+result);
		   break;
	   case 2:
		   result=a-b;
		   System.out.println("Result is :"+result);
		   break;
	   case 3:
		   result=a*b;
		   System.out.println("Result is :"+result);
		   break;
	   case 4:
		   if(b==0) {
			   System.out.println("A number can not divide by 0");
			   break;
			   }
			   else{
				  result=a/b; 
				  System.out.println("Result is :"+result);
				  break;
			   }
		   default:
			   System.out.println("Please enter a required option");
	   }
	   
	   
	}

}
