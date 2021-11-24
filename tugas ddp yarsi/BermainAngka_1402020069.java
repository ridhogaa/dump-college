import java.util.Scanner;
import java.util.Arrays;
/* @author : Ridho Gymnastiar Al Rasyid 
NPM : 1402020069
Program Bermain Angka 
*/
public class BermainAngka_1402020069{
	public static void main(String[] args){
		// mendeklarasikan Scanner in dan untuk memberi input pada saat program dijalankan 
		Scanner in = new Scanner(System.in);

		System.out.print("\n=================================================");
		System.out.print("\n\tProgram Bermain Angka");
		System.out.print("\nDibuat oleh Ridho Gymnastiar Al Rasyid/1402020069");
		System.out.print("\n=================================================\n");
		System.out.print("Masukan List Angka: ");
		String input = in.nextLine(); // menginput dan mencetak input dengan tipe data String 
		System.out.print("=================================================");
		System.out.print("\nList Angka: " + input); // mencetak input yang akan kita masukan di atas
		System.out.print("\n=================================================");
		System.out.print("\n1. Urutkan List Angka");
		System.out.print("\n2. Hilangkan Angka Duplikat\n");
		System.out.print("Pilihan: ");
		byte pilih = in.nextByte(); // menginput dan mencetak pilih dengan tipe data byte
		System.out.print("=================================================\n");
		// mendeklarasikan array dengan tipe data char diberi nama variable dan mengisi nilai dengan mengubah string input menjadi char array
		char[] arrayChar = input.toCharArray();
		// mendeklarasikan int i sebagai counter dan mengisi nilai 0, int dipilih karna tipe bilangan bulat umum bahasa pemrograman
		int i = 0;
		// mendeklarasikan String temp dan mengisi dengan String kosong untuk ditambahkan sebuah isi nanti di dalam while
		String temp = "";

		// jika pilih == 1 maka akan mencetak program di bawah: 
		if(pilih == 1){	// pembukaan scope if 
			System.out.println("Anda telah memilih Urutkan List Angka");
			System.out.print("=================================================\n");
			// pengulangan hanya 1 kali karna i < 1
			while(i < 1){ // pembukaan scope while 
				Arrays.sort(arrayChar); // Array sorting arrayChar untuk mengurutkan bilangan 
				System.out.print("Hasil: ");
				System.out.println(arrayChar); // mencetak arrayChar
				i++; // increment
				} // penutupan scope while
			} // penutupan scope if

		// jika pilih == 2 maka akan mencetak program di bawah: 
		else if(pilih == 2){ // pembukaan scope else if 
			System.out.println("Anda telah memilih Hilangkan Angka Duplikat");
			System.out.print("=================================================\n");
			// pengulangan sampai arrayChar.length yang diberikan di input karna i < arrayChar.length
			while(i < arrayChar.length){ // pembukaan scope while 
				if(temp.indexOf(arrayChar[i]) == -1) // jika String temp indexOf(arrayChar[i]) == -1
					temp += arrayChar[i]; // maka temp += arrayChar[i]
				i++; // increment 
				} // penutupan scope while 
				System.out.print("Hasil: ");
				System.out.println(temp.toCharArray()); // mencetak String temp yang diubah ke dalam bentuk Char Array
			} // penutupan scope else if

			// lainnya jika salah satu program di atas tidak terpenuhi maka akan mencetak program di bawah: 
			else{ // pembukaan scope else
			System.out.println("Maaf pilihan yang Anda pilih belum tersedia"); // mencetak program
			} // penutupan scope else 
			/*Created by : Ridho Gymnastiar Al Rasyid
			NPM : 1402020069*/
		}
	}
