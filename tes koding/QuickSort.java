import java.util.*;
public class QuickSort {
	public static void main(String[] args) {
		int[] angka = {5, 9, 10, 11, 12, 10, 7};
		quickSort(angka);
	}
	public static void quickSort(int[] angka) {
		System.out.println("SEBELUM QUICK SORT");
		for (int out : angka) {
			System.out.print(out + " ");
		}

		qsHelper(angka, 0, angka.length - 1);

		System.out.println("\nSESUDAH QUICK SORT");
		for (int out : angka) {
			System.out.print(out + " ");
		}
	}
	public static void qsHelper(int[] angka, int awal, int akhir) {
		int i = awal, j = akhir, pivot = angka[awal];

		while (i <= j) {

			while (angka[i] < pivot)
				i++;
			while (angka[j] > pivot)
				j--;

			if (i <= j) {
				int temp = angka[i];
				angka[i] = angka[j];
				angka[j] = temp;
				i++;
				j--;
			}
			if(awal < j)
				qsHelper(angka, awal, j);
			if(i < akhir)
				qsHelper(angka, i, akhir);
		} // end while
	}
} // end close