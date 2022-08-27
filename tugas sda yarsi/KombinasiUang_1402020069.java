/*@author : Ridho Gymnastiar Al Rasyid
NPM : 1402020069
Program Kombinasi Uang*/
import java.util.*;

public class KombinasiUang_1402020069 {
	public static void main(String[] args) {
		// Mendeklarasikan Scanner input untuk memberikan input pada saat program dijalankan
		Scanner input = new Scanner(System.in);

		System.out.println("===========================================================================");
		System.out.println("\tSelamat datang di program Kombinasi Uang");
		System.out.println("\tProgram ini dibuat oleh Ridho Gymnastiar Al Rasyid 1402020069");
		System.out.println("===========================================================================");

		int[] persediaanUang = {1000, 2000, 5000, 10000}; // mendeklarasikan persediaan uang dari array 1000, 2000, 5000, 10000
		System.out.println("Banyaknya persediaan uang yaitu: " + Arrays.toString(persediaanUang)); // mencetak Array persediaanUang
		System.out.print("Jumlah uang yang ingin dimasukan: ");
		int jumlahUang = input.nextInt(); // Menginput dan mencetak int jumlahUang
		// mengisi int kombinasiUang dengan hasil yang dikembalikan method non void caraKombinasi dengan isi parameternya jumlahUang, persediaanUang
		int kombinasiUang = caraKombinasi(jumlahUang, persediaanUang);

		System.out.println("Banyak kombinasi penukaran sesuai dengan persediaan uang: " + kombinasiUang); // mencetak kombinasiUang
		System.out.println("============================ Terima Kasih =================================");
	}
	// Proses dynamic programming
	public static int caraKombinasi(int data, int[] persediaanUang) {
		// jika data <= 0 maka akan mencetak program di bawah: 
		if (data <= 0) {
			System.out.println("Jumlah uang tidak boleh kosong!");
			System.out.println("===============================");
			System.exit(0); // memberhentikan program yang berjalan
		}
		// membuat array multidimensi bernama banyakCara untuk dynamic programming mengisi dengan [data + 1][persediaanUang.length + 1]
		int[][] banyakCara = new int[data + 1][persediaanUang.length + 1];
 		// melooping semua index persediaanUang.length dengan increment i dan memberi nilai banyakCara[0][i] = 1
        for(int i = 0; i <= persediaanUang.length; ++i) { 
            banyakCara[0][i] = 1;
        }
 		// melooping semua index data dengan increment i dan memberi nilai banyakCara[i][0] = 0
        for(int i = 1; i <= data; ++i) {
            banyakCara[i][0] = 0;
        }
        /* membuat rekursif tidak langsung sebagai helper mencari banyak cara
        dan mengisi parameter int[][] banyakCara, int[]persediaan uang, int data */
		return caraKombinasiHelper(banyakCara, persediaanUang, data);
	}
	// Proses mencari banyak cara dan menggunakan program dinamis untuk mencari banyak kombinasi
	public static int caraKombinasiHelper(int[][] banyakCara, int[] persediaanUang, int data) {
 		// looping int i = 1; i <= data, increment i
        for(int i = 1; i <= data; ++i) {
        	// looping, int j = 1; j <= persediaanUang.length, increment j
            for(int j = 1; j <= persediaanUang.length; ++j) {
            	/* Mengisi nilai setiap banyakCara[i][j]
            	banyakCara[i][j] = (i - persediaanUang[j - 1] >= 0 ? banyakCara[i - persediaanUang[j - 1]][j] : 0 ) 
            	+ banyakCara[i][j - 1] */
                banyakCara[i][j] = (i - persediaanUang[j - 1] >= 0 ? banyakCara[i - persediaanUang[j - 1]][j] : 0 ) + banyakCara[i][j - 1];
            }
        }
        // mengembalikan banyakCara[data][persediaanUang.length]
        return banyakCara[data][persediaanUang.length];
    }
	
}