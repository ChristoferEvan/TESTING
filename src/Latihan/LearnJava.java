package Latihan;
import java.io.*;

public class LearnJava {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int Suhu;
		System.out.println("Masukkan suhu anda = ");
		Suhu = Integer.parseInt(br.readLine());
		
		if(Suhu < 0) {
			System.out.println("PADAT");
		} else if(Suhu > 0 && Suhu < 100) {
			System.out.println("Cair");
		} else if(Suhu > 100) {
			System.out.println("Gas");
		} else {
			System.out.println("Tidak ada");
		}

	}

}
