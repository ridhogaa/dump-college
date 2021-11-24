import java.util.Scanner;

public class DaftarBeasiswa_1402020069{
	public static void main(String[] args){
		// String dipilih untuk mendeklarasi kata atau kumpulan banyak char, berikut adalah nama variablenya :
		String nama, ipk, penghasilan, npm, mencariKode, mencariAngkatan; 
		// int dipilih untuk mendeklarasi bilangan bulat dan juga merupakan bilangan bulat umum bahasa pemrograman, berikut adalah nama variablenya :
		int lomba, saudara, konversiKode, kodeAkhir ;
		// char dipilih untuk mendeklarasi satu huruf atau satu karakter dari String, berikut adalah nama variablenya :
		char kodeAwal, kodeTengah;
		// boolean dipilih untuk menghasilkan output true or false, berikut adalah nama variablenya :
		boolean angkatan, mahasiswaBerprestasi, mahasiswaKurangMampu, layakMendapatkanBeasiswa, beasiswaMahasiswaBerprestasi,beasiswaMahasiswaKurangMampu;
		// Scanner untuk memberi input di cmd atau saat program dijalankan
		Scanner input = new Scanner(System.in);	

		// disini kita akan mencetak nama program, nama dan npm pembuat program
		System.out.println("==========================="); // Nama : Ridho Gymnastiar Al Rasyid
		System.out.println("Program Daftar Beasiswa\nDibuat oleh Ridho Gymnastiar Al Rasyid/1402020069"); // Teknik Informatika kelas B
		System.out.println("==========================="); // NPM  : 1402020069

		// disini kita akan mencetak nama sesuai dengan input yang kita masukkan
		System.out.print("Siapa nama kamu? ");
		nama = input.nextLine();
		// disini kita akan mencetak jawaban dari ipk sesuai dengan input yang kita masukkan
		System.out.print("Apakah ipk kamu diatas 3,50 (Iya/Tidak)? ");
		ipk = input.next();
		// disini kita akan mencetak berapa banyak lomba sesuai dengan input yang kita masukkan
		System.out.print("Berapa banyak lomba yang telah kamu ikuti? ");
		lomba = input.nextInt();
		// disini kita akan mencetak jawaban dari penghasilan keluarga sesuai dengan input yang kita masukkan
		System.out.print("Apakah penghasilan keluarga kamu kurang dari Rp.4.000.000 (Iya/Tidak)? ");
		penghasilan = input.next();
		// disini kita akan mencetak berapa banyak saudara sesuai dengan input yang kita masukkan
		System.out.print("Berapa banyak saudara kandung kamu? ");
		saudara = input.nextInt();

		npm = args[0]; // disini kita akan membuat npm sesuai dengan args0 yang ingin kita masukkan
		kodeAwal = nama.charAt(nama.length()/2); // disini kita akan mencari 1 huruf/char nama tengah dari input nama 
		kodeTengah = nama.charAt(0); // disini kita akan mencari 1 huruf/char nama depan dari input nama
		mencariKode = npm.substring(npm.length() - 2); // disini kita akan mencari 2 angka terakhir sesuai dengan input npm
		konversiKode = Integer.parseInt(mencariKode); // disini kita akan mengkonversi tipe data dari String ke dalam int
		kodeAkhir = (konversiKode + 1) % 3; /* disini kita akan mencari akhir kode dari kode pendaftaran sesuai dengan hints
		yaitu mengambil 2 angka terakhir dari npm lalu ditambah dengan 1, habis itu dimodulo dengan 3*/

		mencariAngkatan = args[0].substring(3, 7); /* disini kita akan mencari angkatan 
		atau mengambil index 3 sampai 7 dari args0 yang kita masukkan*/
		angkatan = mencariAngkatan.equals("2018") || mencariAngkatan.equals("2019") || mencariAngkatan.equals("2020"); 
		// disini kita akan menyesuaikan hanya angkatan 2018 sampai 2020 lah yang akan mendapatkan beasiswa dengan cara equals atau sama dengan

		mahasiswaBerprestasi = ipk.equals("Iya") && lomba > 3;
		/*disini kita ingin mencari beasiswa mahasiwa berprestasi sesuai dengan hints yang diminta yaitu 
		ipk harus diatas 3.5 dan juga mengikuti lomba diatas 3 kali*/

		mahasiswaKurangMampu = penghasilan.equals("Iya") && saudara > 2; 
		/* disini kita akan mencari beasiswa mahasiswa kurang mampu sesuai dengan hints yang diminta yaitu 
		penghasilan keluarga harus kurang dari Rp.4.0000.000 dan juga saudara harus lebih dari 2 */

		beasiswaMahasiswaBerprestasi = (angkatan && mahasiswaBerprestasi);
		//disini kita akan mengetahui hasil boolean dari beasiswaMahasiswaBerprestasi dengan cara = (angkatan && mahasiswaBerprestasi)
		beasiswaMahasiswaKurangMampu = (angkatan && mahasiswaKurangMampu);
		//disini kita akan mengetahui hasil boolean dari beasiswaMahasiswaKurangMampu dengan cara = (angkatan && mahasiswaKurangMampu)

		layakMendapatkanBeasiswa = ((angkatan && mahasiswaBerprestasi) || (angkatan && mahasiswaKurangMampu));
		/*disini kita akan memperlihatkan hasil dari boolean layakMendapatkanBeasiswa 
		dengan cara = ((angkatan && mahasiswaBerprestasi) || (angkatan && mahasiswaKurangMampu))*/
		
		System.out.println("===========================");
		System.out.println("Data sedang di proses....");
		System.out.println("===========================");
		System.out.println("[Status kelayakan]");	
		System.out.println(nama + "(" + npm + ")" + " kode pendaftaran kamu adalah: " + kodeAwal + kodeTengah + kodeAkhir);
		// disini kita akan mencetak nama, npm, kodeAwal, kodeTengah, dan juga kodeAkhir sesuai dengan String, int, char yang kita buat diatas
		System.out.println("Apakah kamu layak mendapatkan Beasiswa: " + layakMendapatkanBeasiswa);
		// disini kita akan mencetak layakMendapatkanBeasiswa dengan output true or false, sesuai dengan boolean yang kita buat diatas
		System.out.println("jika layak maka Beasiswa yang cocok untuk kamu adalah...");
		System.out.println("-Beasiswa mahasiswa berprestasi: " + beasiswaMahasiswaBerprestasi);
		// disini kita akan mencetak beasiswaMahasiswaBerprestasi dengan output true or false, sesuai dengan boolean yang kita buat diatas
		System.out.println("-Beasiswa mahasiswa kurang mampu: " + beasiswaMahasiswaKurangMampu);
		// disini kita akan mencetak beasiswaMahasiswaKurangMampu dengan output true or false, sesuai dengan boolean yang kita buat diatas
		System.out.println("===========================");
		System.out.println("Jangan patah semangat bila kamu belum layak untuk mendapatkan Beasiswa!");
		System.out.println("Jika kalian layak, jangan lupakan kode pendaftaran untuk seleksi berikutnya ya!");
		/*Created by = Ridho Gymnastiar Al Rasyid
		NPM Pembuat  = 1402020069*/
	}
}