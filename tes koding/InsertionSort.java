import java.util.*;
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		insertionSort(arr);
	}

	public static void insertionSort(int[] bilangan) {
		System.out.println("SEBELUM INSERTION SORT");
		for (int out : bilangan) {
			System.out.print(out + " ");
		}

		isHelper(bilangan);

		System.out.println("\nSESUDAH INSERTION SORT");
		for (int out : bilangan) {
			System.out.print(out + " ");
		}
	}

	public static int[] isHelper(int[] bilangan) {
		int temp = 0;
		for (int i = 1; i < bilangan.length; i++) {
			for (int j = i; j > 0; j--) {
				if (bilangan[j] < bilangan[j - 1]) {
					// swap
					temp = bilangan[j];
					bilangan[j] = bilangan[j - 1];
					bilangan[j - 1] = temp;
				}
			}
		}
	return bilangan;	
	}
} // end close