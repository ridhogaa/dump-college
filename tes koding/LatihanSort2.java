import java.util.*;
public class LatihanSort2 {
 
 	public static void main(String[] args) {
		int[] angka = {5, 4, 3, 2, 1};
		for (int i : angka) {
			System.out.print(i + " ");
		}
		System.out.println();
		sort(angka, 0, angka.length - 1);
		for (int i : angka) {
			System.out.print(i + " ");
		}
 	}
 	public static void sort(int[] angka, int awal, int akhir) {
 		int i = awal, j = akhir, pivot = angka[awal];
 		while ( i <= j ) {
 			while (angka[i] < pivot)
 				i++;
 			while (angka[j] > pivot)
 				j--;
 			if(i <= j) {
 				int temp = angka[i];
 				angka[i] = angka[j];
 				angka[j] = temp;
 				i++;
 				j--;
 			}
 			if(awal < j)
 				sort(angka, awal, j);
 			if(i < akhir)
 				sort(angka, i, akhir);
 		}
 	}
}