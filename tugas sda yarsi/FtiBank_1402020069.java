import java.util.*;
/*@author: Ridho Gymnastiar Al Rasyid
NPM : 1402020069
Program FTI Bank*/
public class FtiBank_1402020069{
	// membuat method non void dengan tipe data int dan nama variable tarikTunai, mengisi parameter dengan int a dan int b
	static int tarikTunai(int a, int b){
		return a - b; // mengembalikan hasil int a - int b
	}
	// membuat method non void dengan tipe data int dan nama variable setorTunai, mengisi parameter dengan int a dan int b
	static int setorTunai(int a, int b){
		return a + b; // mengembalikan hasil int a + int b
	}
	// membuat method void dengan nama variable berhasil dan mengisi parameternya dengan int c
	static void berhasil(int c){
		// mencetak perogram di bawah 
		System.out.println("Transaksi Berhasil"); 
		System.out.println("Jumlah saldo anda saat ini: Rp. " + c); // mencetak int c sesuai hasil
	}
	// method main
	public static void main(String[] args){
		// medeklarasikan Scanner in untuk memberikan input pada saat program dijalankan
		Scanner in = new Scanner(System.in);
		// mendeklarasikan tipe data int dengan nama variable argumen, lalu argumen diparse dari args[0] yang ingin dimasukan
		int argumen = Integer.parseInt(args[0]);
		System.out.println("=================================================");
		System.out.println("\tFTI Bank");
		System.out.println("Dibuat oleh Ridho Gymnastiar Al Rasyid/1402020069");
		System.out.println("=================================================");
		System.out.print("Masukan Pin anda: ");
		String pin = in.next(); // menginput pin dan mencetak pin dengan tipe data String
		// jika panjang String pin == 6, maka akan mencetak program di bawah:
		if(pin.length() == 6){
			System.out.println("Jumlah Saldo anda: Rp. " + argumen); // mencetak argumen
			System.out.println(">>>Pilih Menu<<<");
			System.out.println("1. Tarik Tunai");
			System.out.println("2. Setor Tunai");
			System.out.println("3. Transfer Tunai");
			System.out.println("4. Exit");
			System.out.print("Menu yang anda pilih: ");
			byte menu = in.nextByte(); // menginput menu dan mencetak menu dengan tipe data Byte
			// mendeklarasikan tipe data int dengan nama variable uang dan hasil
			int uang, hasil;
			// mendeklarasikan tipe data String dengan nama variable verifikasiPin
			String verifikasiPin;
			// switch menu, input pilihan menu
			switch(menu){
				case 1: // jika menu == 1, maka akan mencetak program di bawah:
				System.out.print("Masukan jumlah uang yang ingin diambil: Rp. ");
				uang = in.nextInt(); // menginput uang dan mencetak uang dengan tipe data int
				// jika jumlah setor = uang % 50000 == 0, atau kelipatan 50000 maka akan mencetak program di bawah:
				if(uang % 50000 == 0){
					System.out.print("Masukan Pin Anda: ");
					verifikasiPin = in.next(); // menginput verifikasiPin dan mencetak verifikasiPin dengan tipe data String
					hasil = tarikTunai(argumen, uang); // mengisi nilai hasil dengan method non void tarikTunai, lalu mengisi parameternya dengan int argumen dan int uang
						// jika argumen > uang maka akan mencetak program di bawah:
						if(argumen > uang){
							// jika verifikasiPin sesuai dengan pin yang dimasukan maka akan mencetak program di bawah juga:
							if(verifikasiPin.equals(pin)){
								berhasil(hasil); // mencetak method void berhasil lalu mengisi parameternya dengan int hasil
							}else{
								System.out.println("Pin yang anda masukan salah"); // jika pin tidak sesuai maka akan mencetak program di samping
							}
						}else{
							System.out.println("Maaf saldo anda tidak mencukupi"); // jika argumen tidak lebih dari uang maka akan mencetak program di samping
						}
				}else{
					System.out.println("Maaf, minimal untuk tarik tunai adalah kelipatan Rp. 50000"); // jika bukan kelipatan 50000 maka akan mencetak program di samping
				}
			break; // perintah break untuk menghentikan program di atas
				case 2: // jika menu == 2, maka akan mencetak program di bawah:
				System.out.print("Masukan jumlah uang yang ingin disetor: Rp. ");
				uang = in.nextInt(); // menginput uang dan mencetak uang dengan tipe data int
				// jika jumlah setor = uang % 50000 == 0, atau kelipatan 50000 maka akan mencetak program di bawah:
				if(uang % 50000 == 0){
					System.out.print("Masukan Pin Anda: ");
					verifikasiPin = in.next(); // menginput verifikasiPin dan mencetak verifikasiPin dengan tipe data String
					hasil = setorTunai(argumen, uang); // mengisi nilai hasil dengan method non void setorTunai, lalu mengisi parameternya dengan int argumen dan int uang
						// jika verifikasiPin sesuai dengan pin yang dimasukan maka akan mencetak program di bawah juga:
						if(verifikasiPin.equals(pin)){
							berhasil(hasil); // mencetak method void berhasil lalu mengisi parameternya dengan int hasil
						}else{
							System.out.println("Pin yang anda masukan salah"); // jika pin tidak sesuai maka akan mencetak program di samping
						}
				}else{
					System.out.println("Maaf, minimal untuk setor tunai adalah kelipatan Rp. 50000"); // jika bukan kelipatan 50000 maka akan mencetak program di samping
				}
			break; // perintah break untuk menghentikan program di atas
				case 3: // jika menu == 3, maka akan mencetak program di bawah:
				System.out.print("Masukan rekening tujuan: ");
				String norek = in.next(); // mendeklarasikan tipe data norek dan mengisi nilai dari inputan Scanner
				System.out.print("Masukan uang yang ingin anda kirim: Rp. ");
				uang = in.nextInt(); // menginput uang dan mencetak uang dengan tipe data int
				System.out.print("Masukan Pin Anda: ");
				verifikasiPin = in.next(); // menginput verifikasiPin dan mencetak verifikasiPin dengan tipe data String
				hasil = tarikTunai(argumen, uang); // mengisi nilai hasil dengan method non void tarikTunai, lalu mengisi parameternya dengan int argumen dan int uang
				// jika argumen > uang maka akan mencetak program di bawah:
				if(argumen > uang){
					// jika verifikasiPin sesuai dengan pin yang dimasukan maka akan mencetak program di bawah juga:
					if(verifikasiPin.equals(pin)){
						berhasil(hasil); // mencetak method void berhasil lalu mengisi parameternya dengan int hasil
					}else{
						System.out.println("Pin yang anda masukan salah"); // jika pin tidak sesuai maka akan mencetak program di samping
					}
				}else{
					System.out.println("Maaf saldo anda tidak mencukupi"); // jika argumen tidak lebih dari uang maka akan mencetak program di samping
				}
			break; // perintah break untuk menghentikan program di atas
				case 4: // jika menu == 4, maka akan mencetak program di bawah:
				System.out.println("-Keluar-"); // mencetak program di samping
			break; // perintah break untuk menghentikan program di atas
				// lainnya jika salah satu program di atas tidak terpenuhi maka akan mencetak program di bawah:
				default:
				System.out.println("Masukan pilihan dengan benar");
			}
		}else{
			System.out.println("Mohon Masukan Pin Dengan Benar!"); // jika panjang String tidak sama dengan 6, maka akan mencetak program di samping
		}
		// mencetak program terima kasih di bawah
		System.out.println("\t===========================================");
		System.out.println("\tTerima kasih telah menggunakan program ini!");
		System.out.println("\t===========================================");
	}
}