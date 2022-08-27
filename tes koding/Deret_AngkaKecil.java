import java.util.*;
public class Deret_AngkaKecil {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Angka: ");
		int angka = in.nextInt();
		int[] n = new int[angka];
		for(int i = 0; i < n.length; i++) {
			System.out.print("Angka ke " + (i + 1) + ": ");
			n[i] = in.nextInt();
		}
		sort(n, angka);
		System.out.print("Urutan angka: ");
		for (int i : n) {
			System.out.print(i + " ");
		}

	}
	public static void sort(int[] n, int angka) {
		if(angka <= 1) {
			return;
		}

		sort(n, angka - 1);

		int akhir = n[angka-1];
		int j = angka-2;
		while(j >= 0 && n[j] > akhir){
			n[j+1] = n[j];
			j--;
		}
		n[j+1] = akhir;	
	}	
}