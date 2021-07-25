import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int a,b,c;
	    double cevre,alan,u;
	    System.out.println("Üçgenin a uzunluğunu giriniz");
	    a = input.nextInt();
	    System.out.println("Üçgenin b uzunluğunu giriniz");
	    b = input.nextInt();
	    System.out.println("Üçgenin c uzunluğunu giriniz");
	    c = input.nextInt();
	    
	    cevre = a+b+c;
	    
	    u=cevre/2;
	    
	    alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
	    
	    System.out.println("Üçgenin Alanı :"+alan +"\nÜçgenin çevresi :"+cevre);
	    
	    
	    
	    
	}

}
