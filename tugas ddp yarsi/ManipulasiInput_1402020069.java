import java.util.*;
/* @author : Ridho Gymnastiar Al Rasyid 
NPM : 1402020069
Program Manipulasi Input
*/
public class ManipulasiInput_1402020069{
	
	// membuat method non void bernama add, tipe data int dan mengisi parameter int[] a
	static int add(int[] a){ // scope awal method non void add
		Arrays.sort(a); // mensorting atau mengurutkan angka dari input yang ingin dimasukkan
		return a[a.length - 1] + a[a.length - 3]; // mengembalikan a[panjang a - 1] + a[panjang a -3]
	} // scope penutup method non void add

	// membuat method non void bernama susun, tipe data string dan mengisi parameter String nama
	static String susun(String nama){ // scope awal method non void susun
		String result = ""; // mengisi string result dengan string kosong
		// proses melooping String nama
		for(int i = 0; i < nama.length(); i++){ // scope awal for
    	result += nama.substring(0, i + 1); // result menjadi nama.substring(0 sampai dengan setiap i + 1)
  		} // scope penutup for
 		return result; // mengembalikan result yang sudah dilooping
	} // scope penutup method non void susun

	public static void main(String[] args){
		// mendeklarasikan Scanner in dan untuk memberi input pada saat program dijalankan 
		Scanner in = new Scanner(System.in);
		// mendeklarasikan byte menu
		byte menu;
		System.out.println("=================================================");
		System.out.println("=============Program Manipulasi Input============");
		System.out.println("Dibuat oleh Ridho Gymnastiar Al Rasyid/1402020069");
		System.out.println("=================================================");
		System.out.println("1. Penjumlahan tertinggi kedua");
		System.out.println("2. Susun nama");
		System.out.print("Pilih menu: ");
		menu = in.nextByte(); // menginput menu dan mencetak menu dengan tipe data byte
		System.out.println("=================================================");
		// switch menu, input pilihan menu
		switch(menu){ // pembukaan scope switch
			case 1: // apabila menu == 1 maka akan mencetak program di bawah:
			// mendeklarasikan int dengan nama variable di bawah:
			int angka, hasil;
			// mendeklarasikan String array dengan nama variable arr dan mengisinya dengan 1 elemen yaitu "Penjumlahan tertinggi kedua"
			String[] arr = {"Penjumlahan tertinggi kedua"};
			System.out.print("Selamat Anda telah memilih\n");
			System.out.println(Arrays.toString(arr)); // mencetak array
			System.out.print("Silakan input banyak angka: ");
			angka = in.nextInt(); // menginput dan mencetak angka dengan tipe data int
			// mendeklarasikan int array dengan nama variable input dan mengisinya dengan new int[angka]
			int [] input = new int[angka];
			System.out.println("Input angka yang ingin dimasukan setiap nomor: ");
			// proses looping nomor dan input yang ingin dimasukkan
			for(int i = 0; i < angka; i++){ // pembukaan scope for
				System.out.print(i + 1 + ". "); // mencetak setiap i + 1 + ". "
				input[i] = in.nextInt(); // array input diisi dengan elemen i
			} // penutupan scope for
			hasil = add(input); // mengisi hasil dengan method non void add dan mengisi parameternya dengan input
			System.out.print("Hasil dari penjumlahan tertinggi kedua: " + hasil + "\n"); // mencetak hasil
			System.out.print("=================================================\n");
			System.out.print("Terima kasih telah menggunakan program ini!");
		break; // perintah untuk memberhentikan program
			case 2: // apabila menu == 2 maka akan mencetak program di bawah:
			// mendeklarasikan String dengan nama variable di bawah:
			String nama, susunNama;
			// mendeklarasikan String array dengan nama variable arr1 dan mengisinya dengan 1 elemen yaitu "Susun nama"
			String[] arr1 = {"Susun Nama"};
			System.out.print("Selamat Anda telah memilih\n");
			System.out.println(Arrays.toString(arr1)); // mencetak array
			System.out.print("Silakan masukan nama: ");
			nama = in.next(); // menginput dan mencetak nama dengan tipe data String
			susunNama = susun(nama); // mengisi susunNama dengan method non void susun dan mengisi parameternya dengan nama
			System.out.print("Hasil dari susun nama: " + susunNama + "\n"); // mencetak hasil susun nama
			System.out.print("=================================================\n");
			System.out.print("Terima kasih telah menggunakan program ini!");
		break; // perintah untuk memberhentikan program
			default: // lainnya jika salah satu program di atas tidak terpenuhi maka akan mencetak program di bawah:
			System.out.println("Masukkan input yang benar!");
			System.out.print("=================================================");
		} // penutupan scope switch
		/*Created by : Ridho Gymnastiar Al Rasyid
		NPM : 1402020069*/
	}
}