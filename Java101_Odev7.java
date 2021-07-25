import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	   int armutKg,elmaKg,domatesKg,muzKg,patlıcanKg;
	   double tutar;
	   System.out.print("Kaç kilogram armut aldıgınızı giriniz");
	   armutKg= input.nextInt();
	   System.out.print("Kaç kilogram elma aldıgınızı giriniz");
	   elmaKg= input.nextInt();
	   System.out.print("Kaç kilogram domates aldıgınızı giriniz");
	   domatesKg= input.nextInt();
	   System.out.print("Kaç kilogram muz aldıgınızı giriniz");
	   muzKg= input.nextInt();
	   System.out.println("Kaç kilogram patlıcan aldıgınızı giriniz");
	   patlıcanKg= input.nextInt();
	   
	   tutar = ((armutKg*2.14)+(elmaKg*3.67)+(domatesKg*1.11)+(muzKg*0.95)+(patlıcanKg*5));
	   System.out.println("Toplam fiyat: "+tutar);
	   
	}

}
