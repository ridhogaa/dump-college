import java.util.*;
public class LatihanQuickSort1 {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		int[] n = new int[10];
		for(int i = 0; i < n.length; i++) {
			n[i] = in.nextInt();
		}
		quickSort(n, 0, n.length - 1);
		for (int i : n) {
			System.out.print(i + " ");
		}

	}
	public static void quickSort(int[] data, int awal, int akhir) {
		int i = awal, j = akhir, pivot = data[awal];
		while(i <= j) {
			while(data[i] < pivot)
				i++;
			while(data[j] > pivot)
				j--;
			if(i <= j) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
			if(akhir < i)
				quickSort(data, awal, i);
			if(awal > j)
				quickSort(data, j, akhir);
		}
	}
}