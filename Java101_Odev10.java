import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
	   Scanner input = new Scanner(System.in);
	   int mat,fizik,turkce,kimya,muzik;
	   System.out.println("Matematik notunuzu griniz");
	   mat=input.nextInt();
	   System.out.println("Fizik notunuzu griniz");
	   fizik=input.nextInt();
	   System.out.println("Türkçe notunuzu griniz");
	   turkce=input.nextInt();
	   System.out.println("Kimya notunuzu griniz");
	   kimya=input.nextInt();
	   System.out.println("Müzik notunuzu griniz");
	   muzik=input.nextInt();
	   
	   if(mat<0 || mat >100) mat=0;
	   if(fizik<0 || fizik >100) fizik=0;
	   if(turkce<0 || turkce >100) turkce=0;
	   if(kimya<0 || kimya >100) kimya=0;
	   if(muzik<0 || muzik >100) muzik=0;
	   double ortalama = (mat+fizik+turkce+kimya+muzik)/5;
	   
	   if(ortalama >=55) {
		   System.out.println("Geçtiniz, Tebrikler.");
	   }
	   else{
		   System.out.println("Başarısız oldunuz.");
	   }
		   }
	}


