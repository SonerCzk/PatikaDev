import java.util.Scanner;
public class Tet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen Tutarı giriniz: ");
		double tutar = input.nextDouble();
		double kdvTutar;
		kdvTutar = (tutar >= 0 && tutar <=1000) ? 0.18*tutar+tutar : 0.08*tutar+tutar;
		System.out.println("KDV'li tutarınız :"+kdvTutar);
	}

}
