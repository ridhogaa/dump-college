import java.util.*;
public class LatihanSort1 {
	public static void main(String[] args) {
		int[] angka = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		for (int i : angka) {
			System.out.print(i + " ");
		}
		System.out.println();
		sort(angka);
		for (int i : angka) {
			System.out.print(i + " ");
		}

	}

	public static int[] sort(int[] angka) {
		int temp = 0;
		for ( int i = 1; i < angka.length; i++ ) {
			for ( int j = i; j > 0; j-- ) {
				if ( angka[j] < angka[j - 1] ) {
					temp = angka[j - 1];
					angka[j - 1] = angka[j];
					angka[j] = temp;
				}
			}
		}
		return angka;
	}
	
}