import java.util.*;
/*@author : Ridho Gymnastiar Al Rasyid
NPM : 1402020069
Program Cetak Barcode*/
public class CetakBarcode_1402020069{
	public static void main(String[] args){
		// mendeklarasikan tipe data String dengan nama variable namaPegawai dengan mengisi nilai dengan args[0]
		String namaPegawai = new String(args[0]);
		// medeklarasikan Scanner in untuk memberikan input pada saat program dijalankan
		Scanner input = new Scanner(System.in);
		// mendeklarasikan tipe data String dengan nama variable menu
		String menu;
		System.out.print("\n-------------Selamat Datang di Program Barcode ^_^-------------");
		System.out.print("\n---Program dibuat oleh Ridho Gymnastiar Al Rasyid/1402020069---");
		System.out.print("\n---------------------------------------------------------------");
		// mendeklarasikan tipe data String array 2 dimensi dengan nama variable barang, memberi panjang dimensi 1=100 panjang dimensi 2=5
		String[][] barang = new String [100][5]; 
		// mendeklarasikan tipe data byte dengan nama variable data dan i mengisi kedua nilai variable dengan 0 
		byte data = 0, i = 0;
		// mendeklarasikan tipe data int dengan nama variable z dan r mengisi kedua nilai variable dengan 0 
		int z = 0, r = 0;

		// masuk program looping do-while untuk pilih fiture 
		do{ // scope awal looping do-while untuk pilih fiture
			z = 0; // z = 0;
			System.out.print("\nPilihan Fiture:\n");
			System.out.println("1. Cetak Barcode");
			System.out.println("2. Cek Barcode");
			System.out.println("3. History Barcode\n");
			System.out.print("Pilih Fiture: ");
			byte pilihFiture = input.nextByte(); // menginput dan mencetak byte pilihFiture yang ingin dimasukan
			// masuk program switch dengan membandingkan case dengan pilihFiture
			switch(pilihFiture){ // scope awal switch
					// jika pilihFiture == 1 maka akan mencetak program di bawah:
					case 1:
				System.out.print("Jumlah data yang ingin di input: ");
				data = input.nextByte(); // menginput dan mencetak byte data yang ingin dimasukan
				i += data; // mengisi nilai variable i ditambah dengan data (casting)
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				// mendeklarasikan tipe data String array dengan nama variable cetakBarcode dan mengisi nilainya dengan cetak barcode
				String[] cetakBarcode = {"Cetak Barcode"}; 
				System.out.println(Arrays.toString(cetakBarcode)); // print array cetakBarcode
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					// masuk program looping do-while untuk jumlah data
					do{ // scope awal program looping do-while untuk jumlah data
						System.out.print("Nama Barang: ");
						barang[z+i][0] = input.next(); // menginput dan mencetak String barang[z+i][0] untuk input nama barang
						System.out.print("Jenis Barang: ");
						barang[z+i][1] = input.next(); // menginput dan mencetak String barang[z+i][1] untuk unput jenis barang
						System.out.print("Tanggal Input(dd/mm/yyyy): ");
						barang[z+i][2] = input.next(); // menginput dan mencetak String barang[z+i][2] untuk input tanggal
						// mendeklarasikan tipe data int dengan nama variable hari dan mengisi nilainya dengan parsing dari input barang[z+i][2].substring(0,2)
						int hari = Integer.parseInt(barang[z+i][2].substring(0,2));
						// mendeklarasikan tipe data int dengan nama variable bulan dan mengisi nilainya dengan parsing dari input barang[z+i][2].substring(3,5)
						int bulan = Integer.parseInt(barang[z+i][2].substring(3,5));
						// mendeklarasikan tipe data String dengan nama variable tahun dan mengisi nilainya dengan mengambil input barang[z+i][2].substring(6)
						String tahun = barang[z+i][2].substring(6);
						// mendeklarasikan tipe data boolean dengan nama variable hari1 dan mengisi nilai true apabila ((hari >= 1) && (hari <= 32)) 
						boolean hari1 = ((hari >= 1) && (hari <= 31));
						// mendeklarasikan tipe data boolean dengan nama variable bulan1 dan mengisi nilai true apabila ((bulan >= 1) && (bulan <= 12)) 
						boolean bulan1 = ((bulan >= 1) && (bulan <= 12));
						// mendeklarasikan tipe data boolean dengan nama variable tahun1 dan mengisi nilai true apabila tahun.length() == 4 
						boolean tahun1 = (tahun.length() == 4);
							// jika !hari atau !bulan !tahun
							if(!hari1 || !bulan1 || !tahun1){ // scope awal if
								System.out.println("Format Tanggal Yang Anda Input Tidak Valid!");
								System.exit(0); // digunakan untuk perintah program berhenti kerja
							} // scope akhir if
						System.out.print("Harga Barang: Rp. ");
						barang[z+i][3] = input.next(); // menginput dan mencetak String barang[z+i][3] untuk input harga
						// mendeklarasikan tipe data String dengan nama variable kode1 mengisi nilainya dengan mengambil input barang[z+i][0].substring(0,2)
						String kode1 = barang[z+i][0].substring(0,2);
						// mendeklarasikan tipe data char dengan nama variable kode2 mengisi nilainya dengan mengambil input barang[z+i][1].charAt(0)
						char kode2 = barang[z+i][1].charAt(0);
						// mendeklarasikan tipe data char dengan nama variable kode3 mengisi nilainya dengan mengambil input barang[z+i][1].charAt(barang[z+i][1].length()/2)
						char kode3 = barang[z+i][1].charAt(barang[z+i][1].length()/2);
						// mendeklarasikan tipe data char dengan nama variable kode4 mengisi nilainya dengan mengambil input barang[z+i][1].charAt(barang[z+i][1].length()-1)
						char kode4 = barang[z+i][1].charAt(barang[z+i][1].length()-1);
						// mendeklarasikan tipe data char dengan nama variable kode5 mengisi nilainya dengan mengambil input barang[z+i][2].charAt(1)
						char kode5 = barang[z+i][2].charAt(1);
						// mendeklarasikan tipe data char dengan nama variable kode6 mengisi nilainya dengan mengambil input barang[z+i][2].charAt(4)
						char kode6 = barang[z+i][2].charAt(4);
						// mendeklarasikan tipe data char dengan nama variable kode7 mengisi nilainya dengan mengambil input namaPegawai.charAt(namaPegawai.length()/2)
						char kode7 = namaPegawai.charAt(namaPegawai.length()/2);
						// mengisi nilai String barang[z+i][4] dengan (kode1 + kode2 + kode3 + kode4 + kode5 + kode6 + kode7).toUpperCase()
						barang[z+i][4] = (kode1 + kode2 + kode3 + kode4 + kode5 + kode6 + kode7).toUpperCase();
						System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
						System.out.println("Data Berhasil Di Input code Barcode adalah: " + barang[z+i][4]); // print String barang[z+i][4]
						System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					z++; // increment z
				}while(z < data); // terminasi z < data 
					System.out.print("Kembali ke menu awal(Y/T) ? ");
					menu = input.next(); // menginput dan mencetak String menu yang ingin dimasukan
						// jika menu equals T atau t
						if(menu.equalsIgnoreCase("T"))
							System.exit(0);	// digunakan untuk perintah program berhenti kerja
			// perintah break untuk memberhentikan program di atas	
			break;
					// jika pilihFiture == 2 maka akan mencetak program di bawah:
					case 2:
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				// mendeklarasikan tipe data String array dengan nama variable cekBarcode dan mengisi nilainya dengan cek barcode
				String[] cekBarcode = {"Cek Barcode"};
				System.out.println(Arrays.toString(cekBarcode)); // print array cekBarcode
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				// mendeklarasikan tipe data String dengan nama variable nama, jenis, tanggal, harga dan mengisi semua nilainya dengan String kosong ""
				String nama = "", jenis = "", tanggal = "", harga = ""; 
				System.out.print("Masukan kode barcode: ");
				String inputBarcode = input.next(); // menginput dan mencetak String inputBarcode yang ingin dimasukan
				// masuk program looping for, mendeklarasikan a mengisi nilai dengan 0, terminasi a < barang.length, increment a
				for(int a = 0; a < barang.length; a++){ // scope awal for
					// jika inputBarcode equals String barang[a][4]
					if(inputBarcode.equals(barang[a][4])){ // scope awal if
						nama = barang[a][0]; // String nama mengisi String barang[a][0]
						jenis = barang[a][1]; // String jenis mengisi String barang[a][1]
						tanggal = barang[a][2]; // String tanggal mengisi String barang[a][2]
						harga = barang[a][3]; // String harga mengisi String barang[a][3]
					} // scope penutup if
				} // scope penutup for
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");			
				System.out.println("\tDetail Barang: ");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("Nama Barang: " + nama); // print nama barang
				System.out.println("Jenis Barang: " + jenis); // print jenis barang
				System.out.println("Tanggal input: " + tanggal); // print tanggal 
				System.out.println("Harga Barang: Rp. " + harga); // print harga barang
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.print("Kembali ke menu awal(Y/T) ? ");
				menu = input.next(); // menginput dan mencetak String menu yang ingin dimasukan
					// jika menu equals T atau t
					if(menu.equalsIgnoreCase("T"))
						System.exit(0); // digunakan untuk perintah program berhenti kerja
			// perintah break untuk memberhentikan program di atas				
			break;
					// jika pilihFiture == 3 maka akan mencetak program di bawah:
					case 3:
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				// mendeklarasikan tipe data String array dengan nama variable historyBarcode dan mengisi nilainya dengan history barcode
				String[] historyBarcode = {"History Barcode"}; 
				System.out.println(Arrays.toString(historyBarcode)); // print array historyBarcode
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.println("Code Barang\t\t||Tanggal Input");
				rekursif(barang, r); // memanggil method void dengan nama variable rekursif dan mengisi parameter dengan String[][] barang dan int r
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("Kembali ke menu awal(Y/T) ? ");
				menu = input.next(); // menginput dan mencetak String menu yang ingin dimasukan
					// jika menu equals T atau t
					if(menu.equalsIgnoreCase("T"))
						System.exit(0); // digunakan untuk perintah program berhenti kerja
			// perintah break untuk memberhentikan program di atas	
			break;
					// program default mencetak program di bawah:
					default:
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("Angka yang anda masukan tidak terdaftar!"); // print program di samping
				System.exit(0); // digunakan untuk perintah program berhenti kerja
			} // scope penutup switch
		}while(true); // scope penutup looping, while terminasi true
	}

	// masuk ke method void bernama variable rekursif, mengisi parameter method dengan String[][] barang, int r
	static void rekursif(String[][] barang, int r){ // scope awal method rekursif
		// base case rekursif jika r < barang.length maka akan mencetak program di bawah
		if(r < barang.length){
			// jika barang[r][4] == null, maka kosong
			if(barang[r][4] == null){
			}else{ 
				System.out.println(barang[r][4]+"\t\t||"+barang[r][2]); // lainnya mencetak program barang[r][4] dan juga barang[r][2]
			}
		rekursif(barang, ++r); // induksi case rekursif, rekursif(barang, ++r)
		}	
	} // scope penutup method rekursif
}