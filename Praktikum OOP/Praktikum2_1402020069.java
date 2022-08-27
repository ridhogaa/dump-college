import java.util.*;
import java.text.DecimalFormat;
// @author : Ridho Gymnastiar Al Rasyid, NPM : 1402020069
// Class ProfitPenjualan
class ProfitPenjualan{
	// Field
	private String namaBarang;
	private int hargaBarang;
	private int jumlahTerjual;
	private int hargaPerBarang;
	private int diskon;
	private double jumlahProfit; 
	private double jumlahHargaDiskon;
	public static final String duit = "Rp. "; // konstanta duit
	static final String persen = "%"; // konstanta persen
	protected final String barang = "Barang"; // konstanta barang
	public static DecimalFormat df = new DecimalFormat(",###"); 
	// Constructor, Constructor overloading
	public ProfitPenjualan(String namaBarang, int hargaBarang, int jumlahTerjual, int hargaPerBarang){
		this.namaBarang = namaBarang;
		this.hargaBarang = hargaBarang;
		this.jumlahTerjual = jumlahTerjual;
		this.hargaPerBarang = hargaPerBarang;
		setJumlahProfit();
		setHargaDiskon();
	}
	public ProfitPenjualan(String namaBarang, int hargaBarang, int jumlahTerjual, int hargaPerBarang, int diskon){
		this.namaBarang = namaBarang;
		this.hargaBarang = hargaBarang;
		this.jumlahTerjual = jumlahTerjual;
		this.hargaPerBarang = hargaPerBarang;
		this.diskon = diskon;
		setJumlahProfit();
		setHargaDiskon();
	}
	// Method enkapsulasi
	public String getNamaBarang(){
		return this.namaBarang;
	}
	public int getHargaBarang(){
		return this.hargaBarang;
	}
	public int getJumlahTerjual(){
		return this.jumlahTerjual;
	}
	public int getHargaPerBarang(){
		return this.hargaPerBarang;
	}
	public int getDiskon(){
		return this.diskon;
	}
	public void setHargaDiskon(){
		this.jumlahHargaDiskon = hargaBarang - (hargaBarang * diskon / 100);
	}
	public double getHargaDiskon(){
		return this.jumlahHargaDiskon;
	}
	public void setJumlahProfit(){
		setHargaDiskon();
		this.jumlahProfit = (getHargaDiskon() - getHargaPerBarang()) * getJumlahTerjual();
	}
	public double getJumlahProfit(){
		return this.jumlahProfit;
	}
	// method static overloading
	protected static String getRupiahHargaBarang(int harga){
		return df.format(harga);
	}
	protected static String getRupiahHargaBarang(double harga){
		return df.format(harga);
	}
}

// Class main method
public class Praktikum2_1402020069{
	public static void main(String[] args) {
		ProfitPenjualan objek[] = new ProfitPenjualan[15];
		objek[0] = new ProfitPenjualan("Semen Merek Kaki Empat", 130000, 10, 70000);
		objek[1] = new ProfitPenjualan("Cat 5L Merek No drip", 80000, 30, 30000);
		objek[2] = new ProfitPenjualan("Keramik Merek Caunima", 100000, 10, 50000);
		objek[3] = new ProfitPenjualan("Semen Merek Cap Enak", 150000, 15, 100000);
		objek[4] = new ProfitPenjualan("Martil Merek Balado", 30000, 20, 10000);
		objek[5] = new ProfitPenjualan("Paku Merek PayungEmas", 50000, 13, 20000);
		objek[6] = new ProfitPenjualan("Pipa Merek Sublime", 70000, 20, 40000);
		objek[7] = new ProfitPenjualan("Paralon Merek Johnson", 50000, 17, 20000);
		objek[8] = new ProfitPenjualan("Tembakau Merek Filter", 20000, 30, 15000);
		objek[9] = new ProfitPenjualan("Toren Merek Beruang", 1400000, 10, 500000);
		objek[10] = new ProfitPenjualan("Gypsum Merek Beruang", 100000, 15, 80000, 10);
		objek[11] = new ProfitPenjualan("Tembakau Merek Berlin", 21000, 10, 16000, 1);
		objek[12] = new ProfitPenjualan("Tembakau Merek Mild", 20000, 20, 15000, 2);
		objek[13] = new ProfitPenjualan("Tembakau Merek Juara", 20000, 25, 15000, 3);
		objek[14] = new ProfitPenjualan("Paralon 3 inc PowerMin", 55000, 30, 40000, 50);
		String duit = ProfitPenjualan.duit;
		int angka = 1, profit = 0;
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\tDAFTAR PRODUK TOKO MAKMUR");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Nama Produk\t\t\t|Harga Barang\t\t|Harga Modal/Barang\t|Diskon\t\t|Harga Diskon\t|Jumlah Terjual");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0;i < objek.length ;i++ ) {
			System.out.print(angka + ". " + objek[i].getNamaBarang() + "   \t|" + duit + objek[i].getRupiahHargaBarang(objek[i].getHargaBarang()) + "\t\t|"); 
			System.out.print(duit + objek[i].getRupiahHargaBarang(objek[i].getHargaPerBarang()) + "\t\t|" + objek[i].getDiskon() + objek[i].persen + "\t\t|");
			System.out.print(duit + objek[i].getRupiahHargaBarang(objek[i].getHargaDiskon()) + "\t|" + objek[i].getJumlahTerjual() + " " + objek[i].barang + "\n");
			profit += objek[i].getJumlahProfit();
			angka++;
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Profit yang dihasilkan TOKO MAKMUR: " + duit + ProfitPenjualan.getRupiahHargaBarang(profit));
	}
}