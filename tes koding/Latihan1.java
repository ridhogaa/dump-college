import java.util.*;

public class Latihan1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n = new int[4];
		int[] d = new int[4];

		System.out.print("Angka 1: ");
		for(int i = 0; i < n.length; i++) {
			n[i] = in.nextInt();
		}

		System.out.print("Angka 2: ");
		for(int i = 0; i < d.length; i++) {
			d[i] = in.nextInt();
		}
		
		int[] gabung = new int[n.length + d.length];
		int z = 0;
		for(int i = 0; i < n.length; i++){
			gabung[z] = n[i];
			z++;
		}
		for(int j = 0; j < d.length; j++){
			gabung[z] = d[j];
			z++;
		}
		sort(gabung);
		System.out.print("Urutan angka: ");
		for (int i : gabung) {
			System.out.print(i + " ");
		}
	}
	public static void sort(int[] n) {
		int temp = 0;
		for ( int i = 0; i < n.length; i++) {
			for ( int j = i; j > 0; j--) {
				if(n[j] > n[j-1]) {
					temp = n[j];
					n[j] = n[j-1];
					n[j-1] = temp;
				}
			}
		}
	}
}