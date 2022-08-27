import java.util.*;
// @author : Ridho Gymnastiar Al Rasyid, NPM : 1402020069
// Class ProfitPenjualan
class ProfitPenjualan{
	// Field
	private String namaBarang;
	private int hargaBarang;
	private int jumlahTerjual;
	private int hargaPerBarang;
	// Constructor
	public ProfitPenjualan(String nBarang, int hBarang, int jTerjual, int hPBarang){
		namaBarang = nBarang;
		hargaBarang = hBarang;
		jumlahTerjual = jTerjual;
		hargaPerBarang = hPBarang;
	}
	// Method
	public String getNamaBarang(){
		return namaBarang;
	}
	public int getHargaBarang(){
		return hargaBarang;
	}
	public int getJumlahTerjual(){
		return jumlahTerjual;
	}
	public int getHargaPerBarang(){
		return hargaPerBarang;
	}
	public long getJumlahProfit(){
		return (long)(getHargaBarang() - getHargaPerBarang()) * getJumlahTerjual();
	}
}

// Class main method
public class Praktikum1_1402020069{
	public static void main(String[] args) {
		// Membuat array of objek
		ProfitPenjualan objek[] = new ProfitPenjualan[10];
		objek[0] = new ProfitPenjualan("Semen Merek Kaki Empat", 130000, 10, 70000);
		objek[1] = new ProfitPenjualan("Cat 5L Merek No drip", 80000, 30, 30000);
		objek[2] = new ProfitPenjualan("Keramik Merek Caunima", 100000, 10, 50000);
		objek[3] = new ProfitPenjualan("Semen Merek Cap Enak", 150000, 15, 100000);
		objek[4] = new ProfitPenjualan("Martil Merek Balado", 30000, 20, 10000);
		objek[5] = new ProfitPenjualan("Paku Merek PayungEmas", 50000, 13, 20000);
		objek[6] = new ProfitPenjualan("Pipa Merek Sublime", 70000, 20, 40000);
		objek[7] = new ProfitPenjualan("Paralon Merek Johnson", 50000, 17, 20000);
		objek[8] = new ProfitPenjualan("Tembakau Merek Filter", 20000, 30, 15000);
		objek[9] = new ProfitPenjualan("Toren Merek Beruang", 1400000, 14, 500000);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Nama Produk\t\t\t|Harga Barang\t|Jumlah Terjual\t|Harga Modal/Barang");
		System.out.println("-----------------------------------------------------------------------------------");
		int angka = 1; // tampung angka
		long profit = 0; // tampung profit
		// Proses mencetak data
		for (int i = 0;i < objek.length ;i++ ) {
			System.out.print(angka + ". " + objek[i].getNamaBarang() + "   \t|Rp. " + objek[i].getHargaBarang() + "\t| "); 
			System.out.print(objek[i].getJumlahTerjual() + "\t\t|Rp. " + objek[i].getHargaPerBarang());
			System.out.println("");
			profit += objek[i].getJumlahProfit();
			angka++;
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Total Profit : Rp. " + profit); // Cetak profit
	}
}