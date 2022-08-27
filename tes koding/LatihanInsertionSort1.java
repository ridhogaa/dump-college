import java.util.*;
public class LatihanInsertionSort1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] angka = new int[10];
		for (int i = 0; i < angka.length; i++) {
			angka[i] = in.nextInt();
		}
		InsertionSort(angka);
		for ( int out : angka ) {
			System.out.print(out + " ");
		}	
	}
	public static int[] InsertionSort(int[] angka) {
		int temp = 0;
		for ( int i = 1; i < angka.length; i++ ) {
			for ( int j = i; j > 0; j-- ) {
				if ( angka[j] < angka[j - 1] ) {
					temp = angka[j];
					angka[j] = angka[j - 1];
					angka[j - 1] = temp;
				}
			}
		}
		return angka;
	}
}