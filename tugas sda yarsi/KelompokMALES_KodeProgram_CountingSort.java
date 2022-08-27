import java.util.*;
public class KelompokMALES_KodeProgram_CountingSort {
    public static void main(String[] args) {
        /*
        KELOMPOK MALES:
        1. Ridho Gymnastiar Al Rasyid [1402020069]
        2. Rizal Abimanyu [1402020070]
        3. Aldhaf Fadlilah [1402020112]
        */
        // Best Case
        System.out.println("-BEST CASE-");
        int[] arrGanjil = { 1, 3, 5, 7, 9, 11, 13 };
        int k = 13; // elemen terbesar adalah 13 di dalam array ganjil

        System.out.println("Sebelum Counting Sort");
        for (int i : arrGanjil) {
            System.out.print(i + " ");
        }

        countingSort(arrGanjil, k); // sorting array memakai algoritma Counting Sort

        System.out.println("\nSesudah Counting Sort");
        for (int i : arrGanjil) {
            System.out.print(i + " ");
        }

        // Worst Case
        System.out.println("\n\n-WORST CASE-");
        int[] arrGenap = { 2, 8, 2, 4, 12, 6, 12, 8, 2 };
        k = 12; // elemen terbesar adalah 12 di dalam array genap

        System.out.println("Sebelum Counting Sort");
        for (int i : arrGenap) {
            System.out.print(i + " ");
        }

        countingSort(arrGenap, k); // sorting array memakai algoritma Counting Sort

        System.out.println("\nSesudah Counting Sort");
        for (int i : arrGenap) {
            System.out.print(i + " ");
        }
    }

    public static void countingSort(int[] arr, int k) { // scope method
        // membuat tampungan
        int counter[] = new int[k + 1];

        // mengisi tampungan
        for (int i : arr) {
            counter[i]++; // counter++
        }

        // sort array
        int index = 0;
        for (int i = 0; i < counter.length; i++) { // scope method
            while (0 < counter[i]) { // scope while
                arr[index++] = i;
                counter[i]--;
            } // scope while
        } // scope for
    } // scope method
}