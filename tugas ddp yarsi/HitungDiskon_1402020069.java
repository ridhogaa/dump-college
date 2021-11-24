public class HitungDiskon_1402020069{
	public static void main(String[] args){
	
	//String dipilih untuk mendeklarasi kata atau kumpulan banyak char
	String strNama, strNamaBarang;
	//int dipilih untuk mendeklarasi bilangan bulat dan juga angka yang mencapai range dari 1 sampai 1,000,000,000 dan juga termasuk tipe data bilangan bulat umum
	int panjangNama, charTengah, hargaBeli, diskon1, hargaDiskon1, hargaDiskon2, hargaTotal, sisaUang; 
	
	strNama = args[0]; //kita buat variable strNama lalu kita kasih input args0 sesuai apa yang kita butuhkan
	strNamaBarang = args[1]; //kita buat variable strNamaBarang lalu kita kasih input args1 sesuai apa yang kita butuhkan
	hargaBeli = Integer.parseInt(args[2]); //kita buat variable hargaBeli lalu kita kasih input args2 sesuai apa yang kita butuhkan
	panjangNama = strNama.length(); //kita buat variable panjangNama karena kita ingin menghitung panjang huruf dari strNama
	charTengah = strNama.charAt(panjangNama/2); //kita buat variable charTengah disini karena kita ingin mengambil char tengah dari setiap strNama yang diminta
	diskon1 = charTengah / 3; //kita buat variable diskon1 disini dan kita bagikan dengan 3 sesuai dengan hints yang diberikan oleh soal
	hargaDiskon1 = hargaBeli - (hargaBeli * diskon1 / 100); //disini kita akan menghitung proses variable hargaDiskon1
	hargaDiskon2 = hargaDiskon1 * panjangNama / 100; //disini kita akan menghitung proses variable hargaDiskon2
	hargaTotal = hargaDiskon1 - hargaDiskon2; //disini kita akan menghitung proses variable hargaTotal
	sisaUang = hargaBeli - hargaTotal; //disini kita akan menghitung proses variable sisaUang 
	
	System.out.println("\t--------------------------------------------------");// Nama : Ridho Gymnastiar Al Rasyid
	System.out.println("\t	Program DISKON");
	System.out.println("\tDibuat oleh Ridho Gymnastiar/1402020069");
	System.out.println("\t--------------------------------------------------");// NPM : 1402020069
	System.out.println("Nama\t\t: " + strNama); //disinikita akan mencetak strNama
	System.out.println("Acak Nama\t: " + strNama.substring(panjangNama / 2) + strNama.substring(0, panjangNama/2)); //disini kita akan mencetak acak nama yang telah dibagi 2 dan juga acak nama yang dimulai dari index 0 diakhiri dengan panjangNama/2
	System.out.println("Jumlah Karakter\t: " + panjangNama); //disini kita akan mencetak panjangNama atau panjang karakter dari strNama
	System.out.println("--------------------------------------------------");
	System.out.println(strNama + " ingin membeli " + strNamaBarang + " dengan harga " + hargaBeli + ", Beruntungnya Hari ini ada\nDiskon besar-besaran."); //disini akan mencetak strNama, strNamaBarangm dan hargaBeli
	System.out.println("Untuk produk yang ingin dibeli " + strNama + " mendapatkan potongan sebesar " + diskon1 + "% + " + panjangNama + "%."); //disini akan mencetak strNama, diskon1, dan panjangNama
	System.out.println("Jadi Total yang harus dibayarkan adalah : Rp." + hargaTotal); //disini akan mencetak hargaTotal
	System.out.println("Sisa Uang Kini Rp." + sisaUang); //disini akan mencetak sisaUang
		/*
		Created by	:	Ridho Gymnastiar Al Rasyid
		NPM			:	1402020069 
		*/
	}
}