import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	  int sicaklik;
	  System.out.println("Hava sıcaklıgını giriniz");
	  sicaklik=input.nextInt();
	  if(sicaklik<5) {
		  System.out.println("Kayak yapabilirsiniz.");
	  }
	  else if(sicaklik>=5 && sicaklik<=15) {
		  System.out.println("Sinemaya gidebilirsiniz");
	  }
	  else if(sicaklik>15 && sicaklik <25) {
		  System.out.println("Piknige gidebilirsiniz");
	  }
	  else if(sicaklik>=25) {
		  System.out.println("Yüzmeye gidebilirsiniz");
	  }
		   }
	}


