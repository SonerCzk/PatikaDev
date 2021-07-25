import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	  
	   int r,a;
	   double alan,cevre,dilimAlanı,pi=3.14;
	   System.out.print("Dairenin yarı çapını giriniz:");
	   r= input.nextInt();
	   System.out.print("Merkez açı degerinin giriniz:");
	   a=input.nextInt();
	   alan = pi*r*r;
	   cevre = 2*pi*r;
	   dilimAlanı = (pi*(r*r)*a)/360;
	   System.out.println("Dairenin alanı :"+alan+"\nDairenin çevresi :"+cevre+"\n Dilim alanı :"+dilimAlanı);
	  
	}

}
