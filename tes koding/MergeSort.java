import java.util.*;
public class MergeSort {
	public static void main(String[] args) {
		int[] angka = {11, 20, 30, 40, 12, 23, 50, 60, 70, 10, 100};
		sort(angka);
		for (int i : angka) {
			System.out.print(i + " ");
		}
	}
	public static int[] sort(int[] data) {
        if (data.length <= 1) {
            return data;
        }
        int[] kiri = new int[data.length / 2];
        int[] kanan = new int[data.length - kiri.length];
        System.arraycopy(data, 0, kiri, 0, kiri.length);
        System.arraycopy(data, kiri.length, kanan, 0, kanan.length);
         
        sort(kiri);
        sort(kanan);
        merge(kiri, kanan, data);
        return data;
    }
     
    public static void merge(int[] kiri, int[] kanan, int[] tampungan) {
        int left = 0;
        int right = 0;
        int merged = 0;

        do{
            if (kiri[left] < (kanan[right])) {
                tampungan[merged] = kiri[left];
                left++;
            } 
            else{
                tampungan[merged] = kanan[right];
                right++;
            }
            merged++;
        }while (left < kiri.length && right < kanan.length);
        System.arraycopy(kiri, left, tampungan, merged, kiri.length - left);
        System.arraycopy(kanan, right, tampungan, merged, kanan.length - right);
    }
}