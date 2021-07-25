import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	   int distance;
	   double perKm=2.20,total,startPrice=10;
	   System.out.print("Plese enter the distance of destination:");
	   distance = input.nextInt();
	   
	   total = (perKm*distance) + startPrice;
	   
	   total = (total <20) ? 20:total;
	   
	   System.out.println("Total Price :"+total);
	   
	}

}
