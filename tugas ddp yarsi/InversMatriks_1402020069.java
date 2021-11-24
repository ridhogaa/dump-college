import java.util.Scanner;
import java.util.Arrays;
/* @author : Ridho Gymnastiar Al Rasyid 
NPM : 1402020069
Program Invers Matriks Ordo 2x2 dan Ordo 3x3
*/
public class InversMatriks_1402020069{
	public static void main(String[] args){
		// mendeklarasikan Scanner scan dan untuk memberi input pada saat program dijalankan 
		Scanner scan = new Scanner(System.in);
		// byte dipilih karna range bilangan bulat 1-100, berikut nama variablenya:
		byte pilih;

		System.out.println("=================================================");
		System.out.println("\tProgram Invers Matriks\nDibuat oleh Ridho Gymnastiar Al Rasyid/1402020069");
		System.out.println("=================================================");
		System.out.println("1. Invers Matriks 2x2");
		System.out.println("2. Invers Matriks 3x3");
		System.out.print("Pilihan:");
		pilih = scan.nextByte(); // menginput dan mencetak pilihan dengan tipe data byte

		// memilih ekspresi dari Byte pilih
		switch(pilih){ // scope awal atau pembukaan scope switch

			// apabila pilihan memilih nomor 1 maka akan mencetak matriks ordo 2x2 atau program berikut:
			case 1:
			// double dipilih karna bilangan riil umum, dan mendeklarasikan nama variable berikut:
			double temp, determinan;
			// mendeklarasikan Array tipe data double dan membuat hanya 2 angka saja atau [2], variablenya = arrMatriks1
			double[] arrMatriks1 = new double[2];
			System.out.println("\nAnda telah memilih Invers Matriks 2x2\nSilakan masukan input angka berikut: ");
			System.out.print("Input Matriks baris 1 kolom 1 : ");
			arrMatriks1[0] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arrMatriks1[0]
			System.out.print("Input Matriks baris 1 kolom 2 : ");
			arrMatriks1[1] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arrMatriks1[1]

			// mendeklaraikan Array tipe data double dan membuat hanya 2 angka saja atau [2], variablenya = arrMatriks2
			double[] arrMatriks2 = new double[2];
			System.out.print("Input Matriks baris 2 kolom 1 : ");
			arrMatriks2[0] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arrMatriks2[0]
			System.out.print("Input Matriks baris 2 kolom 2 : ");
			arrMatriks2[1] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arrMatriks2[0]

			System.out.println("\n========================================");
			// Proses mencari Matriks Ordo 2x2
			System.out.println("Matriks Ordo 2x2:");
			System.out.println(Arrays.toString(arrMatriks1)); // mencetak Array
			System.out.println(Arrays.toString(arrMatriks2)); // mencetak Array 

			// Proses mencari Determinan
			System.out.print("Hasil Determinan: ");
			determinan = (arrMatriks1[0]*arrMatriks2[1]) - (arrMatriks1[1]*arrMatriks2[0]); // rumus determinan
			System.out.println(determinan);

			System.out.println("\n========================================");
			// Proses mencari Matriks Adjoin
			System.out.println("Matriks Adjoin sebagai berikut: ");
			temp = arrMatriks1[0]; // mengisi variable temp dengan input arrMatriks1[0]
			arrMatriks1[0] = arrMatriks2[1]; // mengisi arrMatriks1[0] dengan input arrMatriks2[1]
			arrMatriks1[1] *= -1; // arrMatriks1[1] dikali dengan -1
			arrMatriks2[0] *= -1; // arrMatriks2[0] dikali dengan -1
			arrMatriks2[1] = temp; // mengisi arrMatriks2[1] dengan isi dari variable temp
			System.out.println(Arrays.toString(arrMatriks1)); // mencetak Array
			System.out.println(Arrays.toString(arrMatriks2)); // mencetak Array 

			System.out.println("\n========================================");
			// Proses mencari Invers Matriks
			System.out.println("Hasil Invers Matriks: ");
			arrMatriks1[0] /= determinan; // arrMatriks1[0] dibagi determinan
			arrMatriks1[1] /= determinan; // arrMatriks1[1] dibagi determinan
			arrMatriks2[0] /= determinan; // arrMatriks2[0] dibagi determinan
			arrMatriks2[1] /= determinan; // arrMatriks2[1] dibagi determinan
			System.out.println(Arrays.toString(arrMatriks1)); // mencetak Array
			System.out.println(Arrays.toString(arrMatriks2)); // mencetak Array 

			// Perintah break untuk menghentikan program di atas
			break;

			// apabila pilihan memilih nomor 2 maka akan mencetak matriks ordo 3x3 atau program berikut:
			case 2:
			// double dipilih karna bilangan riil umum, dan mendeklarasikan nama variable berikut:
			double determinan2;
			// mendeklarasikan Array multidimensi tipe data double dan membuat [3][3] atau 3 elemen, variablenya = arr 
			double[][] arr = new double[3][3];
			System.out.println("\nAnda telah memilih Invers Matriks 3x3\nSilakan masukan input angka berikut: ");
			System.out.print("Input Matriks baris 1 kolom 1 : ");
			arr[0][0] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arr[0][0]
			System.out.print("Input Matriks baris 1 kolom 2 : ");
			arr[0][1] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arr[0][1]
			System.out.print("Input Matriks baris 1 kolom 3 : ");
			arr[0][2] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arr[0][2]
			System.out.print("Input Matriks baris 2 kolom 1 : ");
			arr[1][0] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arr[1][0]
			System.out.print("Input Matriks baris 2 kolom 2 : ");
			arr[1][1] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arr[1][1]
			System.out.print("Input Matriks baris 2 kolom 3 : ");
			arr[1][2] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arr[1][2]
			System.out.print("Input Matriks baris 3 kolom 1 : ");
			arr[2][0] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arr[2][0]
			System.out.print("Input Matriks baris 3 kolom 2 : ");
			arr[2][1] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arr[2][1]
			System.out.print("Input Matriks baris 3 kolom 3 : ");
			arr[2][2] = scan.nextDouble(); // menginput dan mencetak angka yang ingin dimasukkan ke arr[2][2]

			double [] arrBaris1 = arr[0]; // membuat Array bertipe data double dan mengisi nilai arr[0] atau array multidimensi baris 1
			double [] arrBaris2 = arr[1]; // membuat Array bertipe data double dan mengisi nilai arr[1] atau array multidimensi baris 2
			double [] arrBaris3 = arr[2]; // membuat Array bertipe data double dan mengisi nilai arr[2] atau array multidimensi baris 3
			System.out.println("\n========================================");
			// Proses mencari Matriks Ordo 3x3
			System.out.println("Matriks Ordo 3x3:");
			System.out.println(Arrays.toString(arrBaris1)); // mencetak Array 
			System.out.println(Arrays.toString(arrBaris2)); // mencetak Array 
			System.out.println(Arrays.toString(arrBaris3)); // mencetak Array 

			// Proses mencari Determinan
			determinan2 = (arr[0][0]*arr[1][1]*arr[2][2])+(arr[0][1]*arr[1][2]*arr[2][0])
			+(arr[0][2]*arr[1][0]*arr[2][1])-(arr[2][0]*arr[1][1]*arr[0][2])
			-(arr[2][1]*arr[1][2]*arr[0][0])-(arr[2][2]*arr[1][0]*arr[0][1]); // Rumus determinan
			System.out.println("Hasil Determinan: " + (int)determinan2); // mengcasting determinan dari double menjadi int 
			System.out.println("\n========================================");
			// Proses mencari Matriks Adjoin
			System.out.println("Matriks Adjoin sebagai berikut: ");
			// double dipilih karna bilangan riil umum, dan mendeklarasikan nama variable berikut:
			double matriks00, matriks01, matriks02, matriks10, matriks11, matriks12, matriks20, matriks21, matriks22;
			// Proses mencari Matriks Adjoin dengan kofaktor atau mengisi variable double di atas dengan perhitungan elemen array multidimensi
			matriks00 = (arr[1][1]*arr[2][2]-arr[1][2]*arr[2][1]); // mencari matriks00
			matriks01 = -1*(arr[0][1]*arr[2][2]-arr[0][2]*arr[2][1]); // mencari matriks01
			matriks02 = (arr[1][0]*arr[2][1]-arr[1][1]*arr[2][0]); // mencari matriks02
			matriks10 = -1*(arr[1][0]*arr[2][2]-arr[1][2]*arr[2][0]); // mencari matriks10
			matriks11 = (arr[0][0]*arr[2][2]-arr[0][2]*arr[2][0]); // mencari matriks11
			matriks12 = -1*(arr[0][0]*arr[1][2]-arr[0][2]*arr[1][0]); // mencari matriks12
			matriks20 = (arr[0][1]*arr[1][2]-arr[0][2]*arr[1][1]); // mencari matriks20
			matriks21 = -1*(arr[0][0]*arr[2][1]-arr[0][1]*arr[2][0]); // mencari matriks21
			matriks22 = (arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0]); // mencari matriks22

			// Proses menyesuaikan hasil perhitungan di atas dengan elemen array multidimensi 
			arr[0][0] = matriks00; // mengisi arr[0][0] dengan matriks00
			arr[0][1] = matriks01; // mengisi arr[0][1] dengan matriks01
			arr[0][2] = matriks02; // mengisi arr[0][2] dengan matriks02
			arr[1][0] = matriks10; // mengisi arr[1][0] dengan matriks10
			arr[1][1] = matriks11; // mengisi arr[1][1] dengan matriks11
			arr[1][2] = matriks12; // mengisi arr[1][2] dengan matriks12
			arr[2][0] = matriks20; // mengisi arr[2][0] dengan matriks20
			arr[2][1] = matriks21; // mengisi arr[2][1] dengan matriks21
			arr[2][2] = matriks22; // mengisi arr[2][2] dengan matriks22
			System.out.println(Arrays.toString(arrBaris1)); // mencetak Array
			System.out.println(Arrays.toString(arrBaris2)); // mencetak Array
			System.out.println(Arrays.toString(arrBaris3)); // mencetak Array

			System.out.println("\n========================================");
			// Proses mencari hasil invers matriks 
			System.out.println("Hasil Invers Matriks: ");
			// Caranya dengan membagi semua elemen matriks multidimensi dengan determinan
			arr[0][0] /= determinan2; 
			arr[0][1] /= determinan2;
			arr[0][2] /= determinan2;
			arr[1][0] /= determinan2;
			arr[1][1] /= determinan2;
			arr[1][2] /= determinan2;
			arr[2][0] /= determinan2;
			arr[2][1] /= determinan2;
			arr[2][2] /= determinan2;
			System.out.println(Arrays.toString(arrBaris1)); // mencetak Array
			System.out.println(Arrays.toString(arrBaris2)); // mencetak Array
			System.out.println(Arrays.toString(arrBaris3)); // mencetak Array

			// Perintah break untuk menghentikan program di atas
			break;

			// Apabila pilihan tidak sesuai dengan case yang tersedia maka default akan mencetak program di bawah:
			default:
			// mencetak program default
			System.out.println("Error!! Tidak ada Pilihan yang dimaksud.");
			System.out.println("Hanya 2 pilihan yang tersedia saat ini!!");
			System.out.println("========================================");
		} // scope akhir atau penutupan scope switch
		/*Created by : Ridho Gymnastiar Al Rasyid
		NPM : 1402020069*/	
	}
}