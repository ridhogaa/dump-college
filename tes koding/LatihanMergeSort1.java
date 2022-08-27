import java.util.*;
public class LatihanMergeSort1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n = new int[10];
		for ( int i = 0; i < n.length; i++ ) {
			n[i] = in.nextInt();
		}
		sort(n, 0, n.length - 1);
		for ( int i : n ) {
			System.out.print(i + " ");
		}
	}
	
	public static void sort(int arr[], int awal, int akhir)	{  
		if (awal < akhir) {  
			int tengah = (awal + akhir) / 2;  
			sort(arr, awal, tengah);  
			sort(arr , tengah + 1, akhir);  
			merge(arr, awal, tengah, akhir);
		}  
	}

	public static void merge(int arr[], int awal, int tengah, int akhir) {  
  
		int l = tengah - awal + 1;  
		int r = akhir - tengah;  
  
		int left[] = new int [l];  
		int right[] = new int [r];  
  
		for (int i = 0; i < l; ++i)  
			left[i] = arr[awal + i];  
  
		for (int j = 0; j < r; ++j)  
			right[j] = arr[tengah + 1 + j];  
  
		int i = 0, j = 0;  
		int k = awal;  
		while (i < l && j < r) {  
			if (left[i] <= right[j]) {  
				arr[k] = left[i];  
				i++;  
			}else {  
				arr[k] = right[j];  
				j++;  
			}  
			k++;  
		}  
		while (i < l) {  
			arr[k] = left[i];  
			i++;  
			k++;  
		}  
  
		while (j < r) {  
			arr[k] = right[j];  
			j++;  
			k++;  
		}  
	}  
}