package Latihan;
import java.io.*;

public class LearnJava2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (
				new InputStreamReader (System.in));
		
		int Harga;
		System.out.println("Masukkan total belanja anda = ");
		Harga = Integer.parseInt(br.readLine());
		
		int Diskon;
		int Total = 0;
		
		if(Harga >= 200000) {
			Diskon = Harga * 25/1000;
			Total = Diskon;
		} else if (Harga >= 350000) {
			Diskon = Harga * 5/100;
			Total = Diskon;
		} else {
			System.out.println("");
		}
		System.out.println("Total pembayaran " + Total);

	}

}
