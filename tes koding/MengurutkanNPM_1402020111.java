import java.util.*;
public class MengurutkanNPM_1402020111 {
	// Dibuat oleh Abdaur Rizki Marwan 1402020111
	public static void main(String[] args) {
		System.out.println("================================================");
		System.out.println("\tProgram Mengurutkan NPM");
		System.out.println("Dibuat oleh Abdaur Rizki Marwan/1402020111");
		System.out.println("================================================");
		Scanner in = new Scanner(System.in);
		String npm; // deklarasi String npm
		Queue<String> data = new PriorityQueue<>(); // deklarasi Priority Queue
		Queue<String> data2 = new LinkedList<>(); // deklarasi Queue linkedlist
		System.out.print("Masukan NPM: ");
		String a = "";
		do {
			npm = in.nextLine(); // input
			if(npm.length() == 10) {
			int z = Integer.parseInt(npm.substring(npm.length() - 1)); // mengambil z dari angka npm paling akhir
			String x = angka(a, z); // memanggil method hasil yang dikembalikan oleh angka
			System.out.println("NPM anda adalah: " + x);
				if (z % 2 == 0) {
					System.out.print("Hasil NPM: ");
					reverse(data2, npm); // memanggil method reverse
				}else if (z % 2 == 1) {
					System.out.print("Hasil NPM: ");
					sort(data, npm); // memanggil method sort
				}
			}else {
				System.out.print("NPM lebih dari 10 angka silahkan masukkan npm yang benar: ");
			}
			
		}while(npm.length() != 10); // terimanasi jika panjang data tidak = 10
	}
	// method non void mengembalikan String angka
	public static String angka(String a, int z) {
		switch(z % 2) {
			case 0:
			a = "Genap"; // jika 0 maka genap
			break;
			case 1:
			a = "Ganjil"; // jika 1 maka ganjil
			break;
		}
		return a; // mengembalikan a
	}
	// method void Sorting apabila npm ganjil
	public static void sort(Queue<String> queue, String npm){
		String[] x = new String[npm.length()]; // deklarasi String array dari panjang npm
		hurufA(npm, x); // memanggil method hurufA
		for (int j = npm.length() - 1;j >= 0 ;j-- ) {
			queue.add(x[j]); // mengisi data queue
		}
		// print queue
		while (!queue.isEmpty()) { 
            System.out.print( queue.peek() + " "); 
            queue.remove(); 
        }
    	System.out.println();
	}
	// method void genap apabila npm genap
	public static void reverse(Queue<String> queue, String npm) {
		String[] x = new String[npm.length()]; // deklarasi String array dari panjang npm
		hurufA(npm, x); // memanggil method hurufA

		for (int j = npm.length() - 1;j >= 0 ;j-- ) {
			queue.add(x[j]); // mengisi data queue
		}
		// print queue
    	while (!queue.isEmpty()) { 
            System.out.print( queue.peek() + " "); 
            queue.remove(); 
        }
        System.out.println();
	}
	// method void untuk mendapatkan huruf a apabila elemen data ganjil
	public static void hurufA(String npm, String[] x){
		
		for (int i = 0;i < npm.length() ;i++ ) {
			x[i] = npm.substring(i, i + 1); // mengisi nilai
			if (Integer.parseInt(x[i]) % 2 == 1) // parse int dari string ke int
				x[i] = npm.substring(i, i + 1) + "a";
		}
	}
	
}