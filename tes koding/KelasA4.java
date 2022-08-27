import java.util.*;
public class KelasA4 {
	public static void main(String[] args) {
		System.out.println("================================================");
		System.out.println("\tProgram Mengurutkan NPM");
		System.out.println("-");
		System.out.println("================================================");
		Scanner in = new Scanner(System.in);
		Queue<String> data = new PriorityQueue<>(); // deklarasi Priority Queue
		Queue<String> data2 = new LinkedList<>(); // deklarasi Queue linkedlist
		String a = ""; 
		String[] tampungan = new String[10];
		System.out.print("Masukan NPM: ");
		printRekursif(in, data, data2, a, tampungan);
	}
	
	// method void Sorting apabila npm ganjil
	public static void printData(Queue<String> queue, String npm, String[] x){
		angkaGanjil(npm, x); // memanggil method angkaGanjil
		printDataHelper(npm, queue, x);
	}

	// method void untuk mendapatkan huruf a apabila elemen data ganjil
	public static String[] angkaGanjil(String npm, String[] x){
		for (int i = 0;i < npm.length() ;i++ ) {
			x[i] = npm.substring(i, i + 1); // mengisi nilai
			if (Integer.parseInt(x[i]) % 2 == 1) // parse int dari string ke int
				x[i] = npm.substring(i, i + 1) + "a";
		}
		return x;
	}
	public static void printDataHelper(String npm, Queue<String> queue, String[] x) {
		for (int j = npm.length() - 1;j >= 0;j--) {
			queue.add(x[j]); // mengisi data queue
		}
		// print queue
    	while (!queue.isEmpty()) { 
            System.out.print(queue.peek() + " "); 
            queue.remove(); 
        }
	}

	public static void printRekursif(Scanner in, Queue<String> data, Queue<String> data2, String a, String[] tampungan) {
		String npm;
		npm = in.nextLine(); // input
		if(npm.length() == 10) {
			int z = Integer.parseInt(npm.substring(npm.length() - 1)); // mengambil z dari angka npm paling akhir
			System.out.print("Hasil NPM: ");
			switch(z % 2) {
				case 0:
				a = "Genap";
				printData(data2, npm, tampungan); // memanggil method reverse
				break;
				case 1:
				a = "Ganjil";
				printData(data, npm, tampungan); // memanggil method sort
				break;
			}
			System.out.println("\nNPM anda adalah: " + a);
		}else {
			System.out.print("NPM lebih dari 10 angka silahkan masukkan npm yang benar: ");
			printRekursif(in, data, data2, a, tampungan);
		}
	}
}