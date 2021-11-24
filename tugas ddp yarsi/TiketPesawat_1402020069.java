import java.util.Scanner;
public class TiketPesawat_1402020069{
	public static void main(String[] args){
		// mendeklarasikan Scanner in dan untuk memberi input pada saat program dijalankan 
		Scanner in = new Scanner(System.in);
			
		System.out.print("\n\t-------------------------------------------------"); // Program Tiket Pesawat
		System.out.print("\n\t\tProgram Cetak Tiket Pesawat"); // Ridho Gymnastiar Al Rasyid
		System.out.print("\n\tDibuat Oleh Ridho Gymnastiar Al Rasyid/1402020069"); // 1402020069
		System.out.print("\n\t-------------------------------------------------"); // Teknik Informatika kelas B
		System.out.print("\nPilih Maskapai yang ingin Anda gunakan:"); 
		System.out.print("\n1. Garuda Airways\n2. Lion Air");
		System.out.print("\nPilihan Maskapai: ");
		String maskapai = in.nextLine(); // input maskapai tipe data String
				
				// String dipilih untuk mendeklarasikan kata, berikut nama variablenya:
				String tanggal, nama, jenisKelamin, input, jam, kodeTiket3, kodeTiket4, kodeTiket5 ;
				// byte dipilih karna range bilangan bulat 1-100, berikut nama variablenya:
				byte jamBerangkat, pesananTiket;
				// int dipilih karna bilangan bulat umum, berikut nama variablenya:
				int diskon, hargaTiket, tiket, tiket1, tiket2, tiket3, argumen;
				// boolean dipilih untuk menghasilkan output true or false, berikut nama variablenya:
				boolean kelipatanLima;
				// char dipilih untuk mencetak salah satu huruf atau index, berikut nama variablenya:
				char kodeTiket1, kodeTiket2;
				// mengkonversi tipe data int menjadi args[0]
				argumen = Integer.parseInt(args[0]);


		// memilih ekspresi dari input String maskapai dan mebuat switch insensitive case
		switch(maskapai.toUpperCase()){ // scope awal atau pembukaan scope switch
			
			// apabila maskapai == Garuda Airways maka akan mencetak program berikut:
			case "GARUDA AIRWAYS": // karna memakai toUpperCase maka case "GARUDA AIRWAYS" harus besar supaya insensitive case
				maskapai = "garuda airways"; // inisialisasi String maskapai menjadi garuda airways
				System.out.println("\n\tIsi Biodata Maskapai di bawah:");
				System.out.print("Masukkan tanggal keberangkatan yang Anda inginkan: ");
				tanggal = in.nextLine(); // menginput dan mencetak tanggal keberangkatan dengan tipe data String + spasi
				System.out.println("Jam keberangkatan yang tersedia untuk maskapai " + maskapai + " yaitu:"); // mencetak String maskapai
				System.out.println("1. Pagi : 09.00\n2. Siang: 13.40\n3. Malam: 20.25"); // jam keberangkatan == kode input di bawah
				System.out.print("Pilihan jam keberangkatan Anda: ");
				jamBerangkat = in.nextByte(); // menginput dan mencetak jam keberangkatan dengan tipe data byte 

				// mendeklarsikan boolean apabila 2 huruf awal tanggal == kelipatan 5 maka akan true
				kelipatanLima = tanggal.substring(0, 2).equals("05") || tanggal.substring(0, 2).equals("10") 
								|| tanggal.substring(0, 2).equals("15") || tanggal.substring(0, 2).equals("20")
								|| tanggal.substring(0, 2).equals("25") || tanggal.substring(0, 2).equals("30");
				
				jam = ""; // mengisi String jam dengan string kosong atau ""
				diskon = 0; // mengisi int diskon dengan nilai 0
				// Jika jam berangkat == 1 atau == 2 atau == 3, maka program akan menjalankan perintah di bawah:
				if(jamBerangkat == 1 || jamBerangkat == 2 || jamBerangkat == 3){ // pebukaan scope atau awal scope
				// jika jam berangkat == 1 diskon akan ditambah 7, lainnya 0					
					diskon = jamBerangkat == 1 ? diskon + 7 : diskon + 0;
						// jika jam berangkat == 1 String jam akan mencetak "0900"
						if(jamBerangkat == 1)
							jam = "0900";
				// jika jam berangkat == 2 diskon akan ditambah 5, lainnya 0
					diskon = jamBerangkat == 2 ? diskon + 5 : diskon + 0;
						// jika jam berangkat == 2 String jam akan mencetak "1340"
						if(jamBerangkat == 2)
							jam = "1340";
				// jika jam berangkat == 3 diskon akan ditambah 3, lainnya 0
					diskon = jamBerangkat == 3 ? diskon + 3 : diskon + 0;
						// jika jam berangkat == 3 String jam akan mencetak "2025"
						if(jamBerangkat == 3)
							jam = "2025";

				// jika boolean kelipatanLima true maka diskon akan ditambah 10
					if(kelipatanLima)
						diskon += 10;

				System.out.print("Masukan nama Anda: ");
				nama = in.next(); // menginput dan mencetak nama dengan tipe data String

				System.out.print("Masukan jenis kelamin Anda (L/P): ");
				jenisKelamin = in.next(); // menginput dan mencetak jenisKelamin dengan tipe data String

				input = ""; // mengisi input dengan string kosong atau ""
					if(jenisKelamin.equals("P")) // jika jenisKelamin == "P" maka String input akan mengisi "Ny. "
							input = "Ny. " + nama;

					if(jenisKelamin.equals("L")) // jika jenisKelamin == "L" maka String input akan mengisi "Tn. "
							input = "Tn. " + nama;
					
				System.out.print("Berapa jumlah tiket yang Anda pesan? ");
				pesananTiket = in.nextByte(); // menginput dan mencetak pesananTiket dengan tipe data byte
				
				hargaTiket = 800000; // mengisi variable int dengan 800000 atau harga tiket maskapai Garuda Airways
				tiket = (int) hargaTiket * diskon / 100; // proses mencari diskon awal pertiket
				tiket1 = (int) tiket * pesananTiket; // proses perkalian diskon awal pertiket dikali pesananTiket
				tiket2 = (int) hargaTiket * pesananTiket; // proses perkalian hargaTiket dikali pesananTiket
				tiket3 = (int) tiket2 - tiket1; // proses pengurangan hasil tiket2 dengan hasil tiket1

				kodeTiket1 = nama.charAt(0); // mencari index awal dari String nama
				kodeTiket2 = nama.toUpperCase().charAt(nama.length() - 1); // mencari index akhir dari String nama
				kodeTiket3 = tanggal.substring(0,2); // mencari tanggal dengan substring hanya bisa dapat 2 index awal
				kodeTiket4 = tanggal.toUpperCase().substring(3,5); // mengkapitalkan dan mencari bulan tanggal dari index 3 sampai 5
				kodeTiket5 = tanggal.toUpperCase().substring(tanggal.length()-1); // mengkapitalkan dan mencari index akhir dari String tanggal

				// jika nilai argumen lebih kecil dari pesananTiket * hargaTiket maka akan mencetak program di scope awal if sampai penutup scope if
				if(argumen < pesananTiket * hargaTiket){ // pembukaan scope atau scope awal
					System.out.println("======================================================"); // program akan mecetak 
					System.out.println("Maaf uang Anda tidak cukup, Harga pertiket: Rp. 800000"); // kedua keluaran di samping
				} // penutupan scope atau scope akhir

				// lainnya akan mencetak program di scope awal else sampai penutup scope else
				else{ // scope awal else atau pembukaan scope else
					maskapai = "garuda airways"; // inisialisasi String maskapai menjadi garuda airways
					System.out.println("\n==========Tiket Anda sedang diproses==========\n");
					System.out.println("Selamat " + input  + ", Anda berhasil memesan " + pesananTiket + " tiket " + maskapai + ".");
					System.out.println("Uang Anda sebesar: Rp. " + argumen);
					System.out.println("Anda mendapatkan diskon sebesar: "+ diskon +"%");
					System.out.println("Harga tiket Anda menjadi sebesar: Rp. " + tiket3);
					argumen -= tiket3; // proses argumen dikurangkan tiket3
					System.out.println("Sisa kembalian uang Anda sebesar: Rp. " + argumen);
					System.out.println("Kode tiket Anda: "+kodeTiket1+""+kodeTiket2+"-"+kodeTiket3+"-"+kodeTiket4+kodeTiket5+"-"+jam+pesananTiket);
					System.out.println("\n==========Tiket Anda sudah tercetak===========");
					// program di atas mencetak semua input yang sudah kita jelaskan dan masukan di luar scope
				} // scope akhir else atau penutupan scope else
			} // penutupan dari scope if paling atas

			// lainnya jadwal keberangkatan tidak sesuai maka akan mencetak program di bawah:
			else{ // awal scope else
				System.out.println("====================================================");
				System.out.println("Jadwal keberangkatan yang Anda pilih tidak tersedia!");
			} // penutup scope else
					// perintah break untuk menghentikan program di atas
					break;

			// apabila maskapai == Lion Air maka akan mencetak program berikut:
			case "LION AIR": // karna memakai toUpperCase maka case "LION AIR" harus besar supaya insensitive case
				maskapai = "lion air"; // inisialisasi String maskapai menjadi lion air
				System.out.println("\n\tIsi Biodata Maskapai di bawah: ");
				System.out.print("Masukkan tanggal keberangkatan yang Anda inginkan: ");
				tanggal = in.nextLine(); // menginput dan mencetak tanggal keberangkatan dengan tipe data String + spasi
				System.out.println("Jam keberangkatan yang tersedia untuk maskapai " + maskapai + " yaitu:"); // mencetak String maskapai
				System.out.println("1. Pagi : 10.33\n2. Siang: 14.51\n3. Malam: 22.38"); // jam keberangkatan == kode input di bawah
				System.out.print("Pilihan jam keberangkatan Anda: ");
				jamBerangkat = in.nextByte(); // menginput dan mencetak jam keberangkatan dengan tipe data byte

				// mengisi variable boolean apabila 2 huruf awal tanggal == kelipatan 5 maka akan true
				kelipatanLima = tanggal.substring(0, 2).equals("05") || tanggal.substring(0, 2).equals("10") 
								|| tanggal.substring(0, 2).equals("15") || tanggal.substring(0, 2).equals("20")
								|| tanggal.substring(0, 2).equals("25") || tanggal.substring(0, 2).equals("30");
				
				jam = ""; // mengisi String jam dengan string kosong atau ""
				diskon = 0; // mengisi int diskon dengan nilai 0
				// Jika jam berangkat == 1 atau == 2 atau == 3, maka program akan menjalankan perintah di bawah:
				if(jamBerangkat == 1 || jamBerangkat == 2 || jamBerangkat == 3){ // pebukaan scope atau awal scope
				// jika jam berangkat == 1 diskon akan ditambah 5, lainnya 0					
					diskon = jamBerangkat == 1 ? diskon + 5 : diskon + 0;
						// jika jam berangkat == 1 String jam akan mencetak "1033"
						if(jamBerangkat == 1)
							jam = "1033";
				// jika jam berangkat == 2 diskon akan ditambah 3, lainnya 0
					diskon = jamBerangkat == 2 ? diskon + 3 : diskon + 0;
						// jika jam berangkat == 2 String jam akan mencetak "1451"
						if(jamBerangkat == 2)
							jam = "1451";
				// jika jam berangkat == 3 diskon akan ditambah 2, lainnya 0
					diskon = jamBerangkat == 3 ? diskon + 2 : diskon + 0;
						// jika jam berangkat == 3 String jam akan mencetak "2238"
						if(jamBerangkat == 3)
							jam = "2238";

				// jika boolean kelipatanLima true maka diskon akan ditambah 10
					if(kelipatanLima)
						diskon += 10;

				System.out.print("Masukan nama Anda: ");
				nama = in.next(); // menginput dan mencetak nama dengan tipe data String

				System.out.print("Masukan jenis kelamin Anda (L/P): ");
				jenisKelamin = in.next(); // menginput dan mencetak jenisKelamin dengan tipe data String

				input = ""; // mengisi input dengan string kosong atau ""
					if(jenisKelamin.equals("P")) // jika jenisKelamin == "P" maka String input akan mengisi "Ny. "
							input = "Ny. " + nama;

					if(jenisKelamin.equals("L")) // jika jenisKelamin == "L" maka String input akan mengisi "Tn. "
							input = "Tn. " + nama;
				
				System.out.print("Berapa jumlah tiket yang Anda pesan? ");
				pesananTiket = in.nextByte(); // menginput dan mencetak pesananTiket dengan tipe data byte
				
				hargaTiket = 600000; // mengisi variable int dengan 600000 atau harga tiket maskapai Lion Air
				tiket = (int) hargaTiket * diskon / 100; // proses mencari diskon awal pertiket
				tiket1 = (int) tiket * pesananTiket; // proses perkalian diskon awal pertiket dikali pesananTiket
				tiket2 = (int) hargaTiket * pesananTiket; // proses perkalian hargaTiket dikali pesananTiket
				tiket3 = (int) tiket2 - tiket1; // proses pengurangan hasil tiket2 dengan hasil tiket1
 
				kodeTiket1 = nama.charAt(0); // mencari index awal dari String nama
				kodeTiket2 = nama.toUpperCase().charAt(nama.length() - 1); // mencari index akhir dari String nama
				kodeTiket3 = tanggal.substring(0,2); // mencari tanggal dengan substring hanya bisa dapat 2 index awal
				kodeTiket4 = tanggal.toUpperCase().substring(3,5); // mengkapitalkan dan mencari bulan tanggal dari index 3 sampai 5
				kodeTiket5 = tanggal.toUpperCase().substring(tanggal.length()-1); // mengkapitalkan dan mencari index akhir dari String tanggal

				// jika nilai argumen lebih kecil dari pesananTiket * hargaTiket maka akan mencetak program di scope awal if sampai penutup scope if
				if(argumen < pesananTiket * hargaTiket){ // pembukaan scope atau scope awal
					System.out.println("======================================================"); // program akan mecetak
					System.out.println("Maaf uang Anda tidak cukup, harga pertiket: Rp. 600000"); // kedua keluaran di samping
				} // penutupan scope atau scope akhir

				// lainnya akan mencetak program di scope awal else sampai penutup scope else
				else{ // scope awal else atau pembukaan scope else
					maskapai = "lion air"; // inisialisasi String maskapai menjadi lion air
					System.out.println("\n==========Tiket Anda sedang diproses==========\n");
					System.out.println("Selamat " + input + ", Anda berhasil memesan " + pesananTiket + " tiket " + maskapai + ".");
					System.out.println("Uang Anda sebesar: Rp. " + argumen);
					System.out.println("Anda mendapatkan diskon sebesar: "+ diskon +"%");
					System.out.println("Harga tiket Anda menjadi sebesar: Rp. " + tiket3);
					argumen -= tiket3; // proses argumen dikurangkan tiket3
					System.out.println("Sisa kembalian uang Anda sebesar: Rp. " + argumen);
					System.out.println("Kode tiket Anda: "+kodeTiket1+""+kodeTiket2+"-"+kodeTiket3+"-"+kodeTiket4+kodeTiket5+"-"+jam+pesananTiket);
					System.out.println("\n==========Tiket Anda sudah tercetak===========");
					// program di atas mencetak semua input yang sudah kita jelaskan dan masukan di luar scope
				} // scope akhir else atau penutupan scope else	
			} // penutupan dari scope if paling atas
			
			// lainnya jadwal keberangkatan tidak sesuai maka akan mencetak program di bawah:
			else{ // awal scope else
				System.out.println("====================================================");
				System.out.println("Jadwal keberangkatan yang Anda pilih tidak tersedia!");
			} // penutup scope else
				// perintah break untuk menghentikan program di atas
				break;

			// apabila maskapai tidak tersedia atau tidak sesuai dengan 2 case di atas maka default akan mencetak program di bawah:
			default:
				System.out.println("============================================"); // program default
				System.out.println("Maaf, pesawat yang Anda pilih belum tersedia"); // program default
		} // scope akhir atau penutupan scope switch
		/*Created by : Ridho Gymnastiar Al Rasyid
		NPM : 1402020069*/	
	}
} 