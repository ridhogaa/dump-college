import java.util.*;
/*@author : Ridho Gymnastiar Al Rasyid
NPM : 1402020069
Program Stack*/
public class Stack_1402020069 {
	public static void main(String[] args) {
		System.out.println("===================================================");
		System.out.println("|\tSelamat datang di Program Stack\t\t  |");
		System.out.println("|Dibuat oleh Ridho Gymnastiar Al Rasyid/1402020069|");
		System.out.println("===================================================");

		Scanner in = new Scanner(System.in); // membuat input Scanner
		Stack<Character> data = new Stack<>(); // mendeklarasikan stack generic Character
		ArrayList<Character> data2 = new ArrayList<Character>(); // mendeklarasikan ArrayList generic Character
		System.out.print("Masukan NPM anda: ");
		String npm = in.nextLine(); // input String untuk program

		rekursif(in, data, npm, data2); // memanggil method rekursif dan mencetaknya
		
	}
	// membuat method void bernama rekursif untuk mencetak, mengisi parameter method dengan Scanner in, Stack data, String npm, ArrayList data2
	public static void rekursif(Scanner in, Stack<Character> data, String npm, ArrayList<Character> data2){
		String namaAngka = ""; // mendeklarasikan String namaAngka dengan String kosong
		int angka = Integer.parseInt(npm.substring(npm.length() - 1)); // deklarasi int angka mengisi nilai dengan mengambil panjang String npm paling akhir
		// jika npm.length() == 10 maka akan mencetak program di bawah:
		// base case rekursif
		if(npm.length() == 10) {
			char[] n = npm.toCharArray(); // mendeklarasi char array dan mengisi nilainya dengan String npm to char array
			// angka genap
			if(angka % 2 == 0) {
				// mengisi semua elemen stack dengan struktur for dan nilainya diambil dari setiap char[] n
				for(int i = 0; i < n.length; i++) {
					data.push(n[i]);
				}
				namaAngka = "Genap"; // namaAngka menjadi genap
				System.out.println("NPM anda adalah: " + namaAngka);
				System.out.println("Stack sebelum disorting: " + data); // print data stack
				sortStack(data); // method mengsorting stack
				System.out.println("Stack sesudah disorting: " + data); // print data stack

			}
			// angka ganjil
			else if(angka % 2 == 1) {
				// mengisi semua elemen ArrayList dengan struktur for dan nilainya diambil dari setiap char[] n
				for(int i = 0; i < n.length; i++) {
					data2.add(n[i]);
				}
				namaAngka = "Ganjil"; // namaAngka menjadi ganjil
				System.out.println("NPM anda adalah: " + namaAngka);
				System.out.println("Stack sebelum direverse: " + data2); // print data2 ArrayList
				Collections.reverse(data2); // method reverse dari library java ArrayList
				System.out.println("Stack setelah direverse: " + data2); // print data ArrayList
			}
		} // jika panjang npm bukan 10 maka program akan rekursif dan juga mencetak program di dalam scope else di bawah: 
		else {
			System.out.println("Panjang NPM yang anda masukan salah!");
			System.out.print("Silahkan coba lagi: ");
			npm = in.nextLine(); // input kembali
			
			rekursif(in, data, npm, data2); // pemanggilan rekursif 
		}
	}
	// membuat method sortedInsert untuk mengsorting dan membandingkan stack dan mengisi parameternya dengan stack data dan juga char i
	public static void sortedInsert(Stack<Character> data, char i) {
		// base case rekursif jika data kosong dan juga char i > dari melihat data
        if (data.isEmpty() || i > data.peek()) {
            data.push(i); // maka data push(i)
            return;
        }
 
        char temp = data.pop(); // char temp diisi dengan data.pop();
        sortedInsert(data, i); // memanggil rekursif kembali untuk membandingkan dan mensortings // 
 
        data.push(temp); // data.push setiap temp
    }
 	// membuat method sortStack sebagai sorting data, mengisi parameternya dengan stack data
    public static void sortStack(Stack<Character> data) {
    	// base case rekursif jika !data kosong maka akan mencetak program di bawah
        if (!data.isEmpty()) {
            char i = data.pop(); // char i mengisi data.pop
            sortStack(data); // pemanggilan rekursif
            sortedInsert(data, i); // pemanggilan rekursif secara tidak langsung dan mengisi parameternya dengan di atas
        }
    }
} // end close