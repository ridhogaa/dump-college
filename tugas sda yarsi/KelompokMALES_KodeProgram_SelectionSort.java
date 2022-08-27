import java.util.*;
public class KelompokMALES_KodeProgram_SelectionSort {
    public static void main(String[] args) {
    	/*
    	KELOMPOK MALES:
    	1. Ridho Gymnastiar Al Rasyid [1402020069]
    	2. Rizal Abimanyu [1402020070]
    	3. Aldhaf Fadlilah [1402020112]
    	*/
    	// Best case
        System.out.println("-BEST CASE-");
        int[] arrGenap = { 0, 2, 4, 6, 8, 10, 12 };
        System.out.println("Sebelum Selection Sort");
        for (int i : arrGenap) {
        	System.out.print(i + " ");
        }

        selectionSort(arrGenap); // sorting array memakai selection sort secara asecending

        System.out.println("\nSesudah Selection Sort");
        for (int i : arrGenap) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Worst case
        System.out.println("-WORST CASE-");
        int[] arrGanjil = { 7, 5, 4, 3, 2, 1 };
        System.out.println("Sebelum Selection Sort");
        for (int i : arrGanjil) {
            System.out.print(i + " ");
        }

        selectionSort(arrGanjil); // sorting array memakai selection sort secara asecending

        System.out.println("\nSesudah Selection Sort");
        for (int i : arrGanjil) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr){
    	// loop pertama mencari setiap index 
        for (int i = 0; i < arr.length - 1; i++) { // pembuka loop for pertama
            int index = i;
            // loop kedua mencari setiap index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) // jika arr[j] < arr[index] 
                    index = j; // maka mencari index = setiap looping j
            }
            // swap
            int angkaTerkecil = arr[index];
            arr[index] = arr[i];
            arr[i] = angkaTerkecil;
        } // penutup loop for pertama
    }
}