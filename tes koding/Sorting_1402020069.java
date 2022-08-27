import java.util.*;
public class Sorting_1402020069 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("Selamat datang di program Sorting");
		System.out.println("Ridho Gymnastiar Al Rasyid/1402020069");
		System.out.println("---------------------------------");
		int[] data = new int[10];
		System.out.print("Input: ");
		for(int i = 0; i < data.length; i++) {
			data[i] = in.nextInt();
		}
		mergeSort(data);
		System.out.print("Setelah di Sorting: ");
		System.out.println(Arrays.toString(data));
	}

	public static int[] mergeSort(int[] data) {
		if(data.length <= 1){
			return data;
		}
		int[] kiri = new int[data.length / 2];
		int[] kanan = new int[data.length - kiri.length];
		System.arraycopy(data, 0, kiri, 0, kiri.length);
		System.arraycopy(data, kiri.length, kanan, 0, kanan.length);

		mergeSort(kiri);
		mergeSort(kanan);
		merge(kiri, kanan, data);
		return data;
	}

	public static void merge(int[] kiri, int[] kanan, int[] n) {
		int left = 0;
		int right = 0;
		int merge = 0;

		do{
			if(kiri[left] < kanan[right]) {
				n[merge] = kiri[left];
				left++;
			}else{
				n[merge] = kanan[right];
				right++;
			}
			merge++;
		}while(left < kiri.length && right < kanan.length);
		System.arraycopy(kiri, left, n, merge, kiri.length - left);
		System.arraycopy(kanan, right, n, merge, kanan.length - right);
	} 
}