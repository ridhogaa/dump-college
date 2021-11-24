public class HitungPercepatan_1402020069{
// argumen kecepatanAkhir, kecepatanAwal, waktuAkhir, waktuAwal
	public static void main(String[] args){	
	
	// agar bisa kita kurang dan kita bagi maka akan kita parse 
		// float dipilih karena variable kecepatan berada pada range 1-100 dan merupakan bilangan riil
		float kecepatanAkhir = Float.parseFloat(args[2]);
		float kecepatanAwal  = Float.parseFloat(args[3]);
		// byte dipilih karena variable waktu berada pada range 1-100 dan merupakan bilangan bulat	
		byte waktuAkhir = Byte.parseByte(args[0]);
		byte waktuAwal  = Byte.parseByte(args[1]);
		// double dipilih karena menjadi tipe default bilangan riil di Java
		double nilaiPerubahanKecepatan = kecepatanAkhir - kecepatanAwal; // ini merupakan proses pengurangan dari kecepatanAkhir dengan kecepatanAwal dan akan menghasilkan nilaiPerubahanKecepatan
		double nilaiSelangWaktu = waktuAkhir - waktuAwal; // ini merupakan proses pengurangan dari waktuAkhir dengan waktuAwal dan akan menghasilkan nilaiSelangWaktu
		double nilaiPercepatan = nilaiPerubahanKecepatan / nilaiSelangWaktu; // ini merupakan proses pembagian dari nilaiPerubahanKecepatan dengan nilaiSelangWaktu dan akan menghasilkan nilaiPercepatan
		
		// disini kita akan masuk ke dalam proses output atau keluaran dari program	
		System.out.println("--------------------------------------------------");
		// disini kita akan mencetak nama program, nama dan npm orang yang membuat
		System.out.println("Program Hitung Percepatan\nDibuat oleh Ridho Gymnastiar Al Rasyid/1402020069"); 
		System.out.println("--------------------------------------------------");
		// disini merupakan nilai kecepatanAwal yang akan kita cetak sesuai dengan args[3] yang ingin kita masukkan
		System.out.println("Kecepatan awal	   : " + kecepatanAwal  + " m/s");
		// disini merupakan nilai kecepatanAkhir yang akan kita cetak sesuai dengan args[2] yang ingin kita masukkan
		System.out.println("Kecepatan akhir	   : " + kecepatanAkhir + " m/s");
		// disini merupakan nilai waktuAwal yang akan kita cetak sesuai dengan args[1] yang ingin kita masukkan
		System.out.println("Waktu awal	   : " + waktuAwal  + " sekon");
		// disini merupakan nilai waktuAkhir yang akan kita cetak sesuai dengan args[0] yang ingin kita masukkan
		System.out.println("Waktu akhir	   : " + waktuAkhir + " sekon"); 
		System.out.println("--------------------------------------------------");
		// disini kita akan mencetak nilaiPerubahanKecepatan
		System.out.println("Perubahan kecepatan: " + nilaiPerubahanKecepatan + " m/s");
		// disini kita akan mencetak nilaiSelangWaktu
		System.out.println("Selang waktu	   : " + nilaiSelangWaktu + " sekon");
		// disini kita akan mencetak nilaiPercepatan
		System.out.println("Percepatan	   : " + nilaiPercepatan + " m/s^2");
		System.out.println("--------------------------------------------------");
		
	}
}