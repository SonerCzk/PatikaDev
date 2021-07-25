import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	   
	   String Username,Password;
	   System.out.print("Please Enter your username");
	   Username=input.nextLine();
	   System.out.print("Please Enter your password");
	   Password=input.nextLine();
	   if(Username.equals("user1234") && Password.equals("123abc")) {
		   System.out.println("Login Successfull");
	   }
	   else {
		   System.out.println("Username or Password is not correct");
		   String a,newPassword;
		   System.out.println("If you want to reset your password press 1 \nTo quit press any other key");
		   a=input.nextLine();
		   if(a.equals("1")) {
			   System.out.print("Enter your new Password");
			   newPassword=input.nextLine();
			   if(newPassword.equals("123abc")) {
				   System.out.println("Please try a different password");
			   }
			   else {
				   Password=newPassword;
				   System.out.println("New password is avaible");
				   System.out.print("Please Enter your username");
				   Username=input.nextLine();
				   System.out.print("Please Enter your password");
				   Password=input.nextLine();
				   if(Username.equals("user1234") && Password.equals(newPassword)) {
					   System.out.println("Login Successfull");
				   }
				   else {System.out.println("xxx");}
			   }
		   }
		   else {
			   return;
		   }
	   }
	   }
	   
	}


