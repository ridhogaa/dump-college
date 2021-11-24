import java.util.Scanner;
public class LimaSoal_1402020069{
	public static void main(String[] args){
		// String dipilih untuk mendeklarasi kata atau kumpulan banyak char, berikut adalah nama variablenya :
		String input1, input6, hurufAkhir;
		// int dipilih untuk mendeklarasi bilangan bulat dan juga merupakan bilangan bulat umum bahasa pemrograman, berikut adalah nama variablenya :
		int input3, input5, angkaPertama, angkaTerakhir,
			pertambahanAngka, panjangNama, tahun;
		// byte dipilih karena cakupan bilangan bulat 1-100, berikut adalah nama variablenya :	
		byte input2, input4, angkaSignifikan;
		// double dipilih untuk mendeklarasi bilangan riil dan juga merupakan bilangan rill terbesar, berikut adalah nama variablenya :
		double input7, panjangNamaDecimal, usiaDecimal, pembulatan, hasilPembulatan;
		// boolean dipilih untuk menghasilkan output true or false, berikut adalah nama variablenya :
		Boolean hasil1, hasil2, hasil3, hasil4, hasil5, seluruhHasil;
		// Scanner untuk memberi input di cmd atau saat program dijalankan
		Scanner in = new Scanner(System.in);
		System.out.println("============== Selamat Datang ^_^ =============="); // Ridho Gymnastiar Al Rasyid
		System.out.println("Program dibuat oleh [Ridho Gymnastiar A. R/1402020069]"); // Teknik Informatika kelas B
		System.out.println("================================================"); // NPM : 1402020069
		System.out.print("Masukan nama: ");
		input1 = in.next();// disini kita akan mencetak nama sesuai dengan input yang kita masukkan
		System.out.print("Masukan usia: ");
		input2 = in.nextByte();// disini kita akan mencetak usia sesuai dengan input yang kita masukkan
		System.out.println("---------------\nSoal:");

		angkaPertama = input1.charAt(0); // proses mencari angka awal dari karakter awal input nama
		angkaTerakhir = input1.charAt(input1.length() - 1); // proses mencari angka akhir dari karakter akhir input nama
		System.out.print("1. Berapa hasil penjumlahan " + angkaPertama +" + "+ angkaTerakhir + "?\n   Jawab : " ); // mencetak angka awal dan angka akhir
		input3 = in.nextInt(); // menginput hasil dari pertambahan angka awal dan angka akhir atau bisa juga dengan mengisi hasil/input lainnya
		System.out.print("2. Berapa panjang nama tersebut?\n   Jawab : ");
		input4 = in.nextByte(); // menginput dan mencetak panjang nama dengan input int atau bilangan bulat
		System.out.print("3. Tahun berapakah orang tersebut lahir?\n   Jawab : ");
		input5 = in.nextInt(); // menginput dan mencetak tahun lahir dengan input int atau bilangan bulat 
		System.out.print("4. Apakah 2 huruf terakhir dari nama tersebut?\n   Jawab : ");
		input6 = in.next(); // menginput dan mencetak 2 huruf terakhir sesuai dengan inputan nama atau bisa juga diubah dengan inputan nama lainnya
		System.out.print("5. Hasil dari panjang nama dibagi usia?\n   Jawab : ");
		input7 = in.nextDouble(); // menginput dan mencetak panjang nama dibagi usia dengan input double atau bilangan rill

		System.out.println("\n\"Jawaban anda sedang diproses\"\n========================================\nStatus Jawaban Anda:");
		pertambahanAngka = angkaPertama + angkaTerakhir; // proses hasil pertambahan angka awal dan angka akhir
		hasil1 = pertambahanAngka == input3;// hasil1 adalah hasil boolean yaitu jika input3 == pertambahanAngka maka true, selain itu false
		System.out.println("1. (true/false) = " + hasil1);// mencetak hasil boolean dari langkah di atas
		
		panjangNama = input1.length();// mencari berapa panjangNama dari input1
		hasil2 = panjangNama == input4;// hasil2 adalah hasil boolean yaitu jika input4 == panjangNama maka true, selain itu false
		System.out.println("2. (true/false) = " + hasil2);// mencetak hasil boolean dari langkah di atas

		tahun = 2020 - input2;// mencari tahun kelahiran dengan cara mengurangkan 2020 dengan input2
		hasil3 = tahun == input5;// hasil3 adalah hasil boolean yaitu jika input5 == tahun makan true, selain itu false
		System.out.println("3. (true/false) = " + hasil3);// mencetak hasil boolean dari langkah di atas

		hurufAkhir = input1.substring(input1.length() - 2);// mencari 2 huruf akhir memakai substring dari input1, panjang input1 dikurangkan 2
		hasil4 = input6.equals(hurufAkhir);// hasil4 adalah hasil boolean yaitu input6 harus sama hasilnya dengan hurufAkhir maka akan true, selain itu false
		System.out.println("4. (true/false) = " + hasil4);// mencetak hasil boolean dari langkah di atas

		panjangNamaDecimal = input1.length(); // mencari panjangNama dan hasilnya decimal memakai double
		usiaDecimal = input2;// mencari usia dan hasilnya decimal memakai double
		panjangNamaDecimal /= usiaDecimal;// membagikan panjangNamaDecimal dengan usiaDecimal dan hasilnya belum dibulatkan
		// Mohon maaf pak, cara di bawah saya cari di google atau stackoverflow, karena saya tidak tahu membulatkan bilangan decimal
		// pertama saya pakai Math.ceil() dan hasilnya berbeda, mohon maaf pak
		angkaSignifikan = 2;// mencari 2 titik koma awal dari decimal
        pembulatan = Math.pow(10, angkaSignifikan);// mempangkatkan 10, angkaSignifikan
        hasilPembulatan = Math.round(panjangNamaDecimal*pembulatan)/pembulatan;// menghasilkan double akhir dari pembulatan angka ke atas
		hasil5 = (double)hasilPembulatan == input7; // hasil5 adalah hasil boolean yaitu input7 == double hasilPembulatan maka akan true, selain itu false
		System.out.println("5. (true/false) = " + hasil5);// mencetak hasil boolean dari langkah di atas

		System.out.println("\"Mari kita lihat seluruh jawaban anda\"\n========================================");
		seluruhHasil = (hasil1 && hasil2 && hasil3 && hasil4 && hasil5);// menggabungkan hasil1 sampai hasil5 dengan operator logika AND(&&)
		System.out.println("Everything is correct? (true/false) = " + seluruhHasil);// mencetak hasil1 sampai hasil5 yang telah digabungkan dengan operator logika AND(&&)
		System.out.println("FEEDBACK :\nJika hasil keseluruhanmu \"true\" Jangan cepat puas, tetap belajarlah supaya engkau bisa mengembangkannya!");
		System.out.println("Jika hasil keseluruhanmu \"false\" Jangan patah semangat, lebih giat lagi di soal berikutnya ya!");
		/*Created by : Ridho Gymnastiar Al Rasyid
		NPM : 1402020069*/
	}
}