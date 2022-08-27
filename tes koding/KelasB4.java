import java.util.*;
public class KelasB4 {
	public static void main(String[] args) {
		System.out.println("===================================================");
		System.out.println("	Selamat datang di Program Stack");
		System.out.println("	Dibuat oleh [Ahmad Zain Al Huda 1402020075]");
		System.out.println("===================================================");
		printData(); // memanggil method void printData tanpa parameter masukan
	}
	// membuat method void printData untuk memprint semua data
	public static void printData() {
		Scanner in = new Scanner(System.in); // deklarsi Scanner
		Stack<Integer> stack = new Stack<Integer>(); // deklarsi Stack
		ArrayList<Integer> arrList = new ArrayList<Integer>(); // deklarasi Arraylist
		System.out.print("Masukan NPM anda: ");	
		String data; // deklarasi string data
		// masuk struktur do while untuk pengulangan apabila panjang data != 10
		do{
		data = in.nextLine(); // input
		char angka = data.charAt(data.length() - 1); // deklarsi char angka mengisi nilai sbg berikut
		int angka1 = (int)(angka); // deklarsi int data lalu di casting
			// masuk struktur switch case untuk pengecekan panjang data
			switch(data.length()) {
				// jika panjang data = 10 mencetak program di bawah:
				case 10:
				String blg = ""; // deklarsi string blg sbg string kosong
					// switch angka modulo 2
					switch(angka1 % 2) {
						// jika hasil 0
						case 0:
						printSorting(data, stack, blg); // memanggil method printSorting untuk setiap angka genap
						break;
						// jika hasil 1
						case 1:
						printReverse(data, arrList, blg); // memanggil method printReverse untuk setiap angka ganjil
						break;
					}
				break;
				default:
				System.out.println("Panjang NPM yang anda masukan salah!");
				System.out.print("Silahkan coba lagi: ");
			}
		}while(data.length() != 10); // panjang data != 10
	}
	// membuat method printSorting untuk print angka genap dengan masukan parameter sbg berikut:
    static void printSorting(String data, Stack<Integer> stack, String blg) {
    	blg = "Genap"; // blg menjadi "Genap"
    	System.out.println("NPM Anda adalah " + blg);
    	// struktur for untuk mengisi setiap data di dalam Stack
    	for (int i = 0; i < data.length() ; i++ ) {
			stack.push(Integer.parseInt(data.substring(i, i + 1)));
		}
		System.out.println("data sebelum disorting: " + stack); // print stack
		urutElemen(stack); // masuk ke method pengurutan stack diisi dengan variable struktur data stack
		System.out.println("data sesudah disorting: " + stack);
    }
    // membuat method printReverse untuk print angka ganjil dengan masukan parameter sbg berikut:
    static void printReverse(String data, ArrayList<Integer> arrList, String blg) {
    	blg = "Ganjil"; // blg menjadi "Ganjil"
    	System.out.println("NPM Anda adalah " + blg);
    	char[] tampung = data.toCharArray(); // mendeklarasikan char arr tampung nilai diambil dari data menjadi char
		System.out.print("data sebelum direverse: ");
		System.out.println(Arrays.toString(tampung)); // print arr char tampung
		// struktur for untuk mengisi setiap data di dalam arraylist secara reverse
		for (int i = data.length() - 1; i >= 0 ; i-- ) {
			arrList.add(Integer.parseInt(data.substring(i, i + 1))); // diambil dari data substring setiap i
		}
		System.out.println("data sesudah direverse: " + arrList);
    }
	// method urutElemen sebagai sorting stack
    static void urutElemen(Stack<Integer> stack) {
    	// membuat rekursif, base case jika data stack tidak kosong
        if (!stack.isEmpty()) {
            int tmp = stack.pop(); // diisi dengan stack pop
            urutElemen(stack); // pemanggilan rekursif
            perbandingan(stack, tmp); // rekursif tidak langsung
        }
    }
    // membuat perbandingan untuk pengurutan setiap stack
	static void perbandingan(Stack<Integer> stack, int tmp) {
		// membuat rekursif, base case jika data stack abis atau tmp > stack peek
        if (stack.isEmpty() || tmp > stack.peek()) {
            stack.push(tmp); // mendorong kedalam elemen tmp
            return;
        }
        int banding = stack.pop(); // deklarasi banding
        perbandingan(stack, tmp); // pemanggilan rekursif
 
        stack.push(banding); // mendorong ke dalam struktur stack dengan elemen banding
    }
} // end close