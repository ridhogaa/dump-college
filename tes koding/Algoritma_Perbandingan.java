/**
Guidelines for sorting compare algorithm
Made by @author Jovian Kurnia
Sources inside the comment lines
**/

import java.util.*;

public class Algoritma_Perbandingan{
	public static void main(String[] args){
		int[] data = new int[10];
		data = new int[]{3, 1, 5, 1, 9, 4, 2, 3, 6, 8};
		System.out.println("Masuk kedalam Selection Sort");
		System.out.println("Data yang belum terurut adalah: " + Arrays.toString(data));
		System.out.println("Data yang telah terurut adalah: " + Arrays.toString(selection_Sort(data)));
		System.out.println();
		
		data = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("Masuk kedalam Insertion Sort");
		System.out.println("Data yang belum terurut adalah: " + Arrays.toString(data));
		System.out.println("Data yang telah terurut adalah: " + Arrays.toString(insertion_Sort(data)));
		System.out.println();
		
		data = new int[]{21, 5, 8, 13, 11, 9, 4, 6, 19, 20};
		System.out.println("Masuk kedalam Merge Sort");
		System.out.println("Data yang belum terurut adalah: " + Arrays.toString(data));
		System.out.println("Data yang telah terurut adalah: " +Arrays.toString(merge_Sort(data, 0, data.length - 1)));
		System.out.println();
		
		data = new int[]{31, 20, 13, 8, 53, 43, 30, 9, 3, 24};
		System.out.println("Masuk kedalam Shell Sort");
		System.out.println("Data yang belum terurut adalah: " + Arrays.toString(data));
		System.out.println("Data yang telah terurut adalah: " + Arrays.toString(shell_Sort(data)));
		System.out.println();
		
		data = new int[]{19, 35, 26, 9, 5, 11, 85, 69, 3, 99};
		System.out.println("Masuk kedalam Quick Sort");
		System.out.println("Data yang belum terurut adalah: " + Arrays.toString(data));
		System.out.println("Data yang telah terurut adalah: " + Arrays.toString(quick_Sort(data, 0, data.length - 1)));
		System.out.println();
		
		int[] data_Tim = new int[15];
		data_Tim = new int[]{9, 5, 13, 11, 8, 18, 29, 6, 16, 23, 25, 12, 7, 3, 10};
		System.out.println("Masuk kedalam Tim Sort");
		System.out.println("Data yang belum terurut adalah: " + Arrays.toString(data_Tim));
		System.out.println("Data yang telah terurut adalah: " + Arrays.toString(tim_Sort(data_Tim)));
		System.out.println();
		
		data = new int[]{13, 5, 11, 9, 4, 1, 10, 6, 7, 12};
		System.out.println("Masuk kedalam Comb Sort");
		System.out.println("Data yang belum terurut adalah: " + Arrays.toString(data));
		System.out.println("Data yang telah terurut adalah: " + Arrays.toString(comb_Sort(data)));
		System.out.println();
		
		data = new int[]{17, 11, 19, 12, 9, 5, 10, 20, 14, 4};
		System.out.println("Masuk kedalam Gnome Sort");
		System.out.println("Data yang belum terurut adalah: " + Arrays.toString(data));
		System.out.println("Data yang telah terurut adalah: " + Arrays.toString(gnome_Sort(data)));
	}
	
	/*
	Selection Sort
	Sorts an array by repeatedly finding the element chosen (minimum/maximum)
	from unsorted part and putting it at the beginning.
	The algorithm maintains two subarrays in a given array
	1. The subarray which is already sorted
	2. Remaining subarray which is unsorted
	In every itteration of Selection sort, the element chosen from the unsorted subarray
	Is picked and moved to the sorted subarray
	https://www.geeksforgeeks.org/selection-sort/
	*/
	
	/*
	Best case: O(n^2)
	Average case: O(n^2)
	Worst case: O(n^2)
	Because of the using of two nested loops
	*/
	public static int[] selection_Sort(int[] data){
		int minimum = 0;
		for(int index = 0; index < data.length - 1; index++){
			minimum = index;
			for(int point = index + 1; point < data.length; point++){
				if(data[point] < data[minimum]){
					minimum = point;
				}
			}
			swap_Selection(data, minimum, index);
		}
		return data;
	}
	
	public static void swap_Selection(int[] data, int minimum, int first){
		int swapping = data[minimum];
		data[minimum] = data[first];
		data[first] = swapping;
	}
	
	/*
	Insertion Sort
	A simple sorting algorithm that works similar the way you sort playing cards in your hands
	The array is virtually split into a sorted and an unsorted part.
	Values from the unsorted part are picked and placed at the correct position in the sorted part.
	https://www.geeksforgeeks.org/insertion-sort/
	*/
	
	/*
	Best case: O(n)
	Best case reason: If the array already sorted in order, compares O(n) elements and perform no swaps
	Average case: O(n^2)
	Worst case: O(n^2)
	Average/Worst case reason: Occur when the input list is in descending order, need to move n - 1 and n - 1 swap
	*/
	/*
	5, 4, 9, 12, 1, 3, 7
	.., 5, 9, 12, 1, 3, 7
	4, 5, 9, 12, 1, 3, 7
	.., .., .., .., 12, 3, 7
	.., .., .., 9, 12, 3, 7
	.., .., 5, 9, 12, 3, 7
	.., 4, 5, 9, 12, 3, 7
	1, 4, 5, 9, 12, 3, 7
	*/
	public static int[] insertion_Sort(int[] data){
		int length = data.length;
		for(int index = 1; index < length; index++){
			int key = data[index];
			int pointer = index - 1;
			while(pointer >= 0 && data[pointer] > key){
				data[pointer + 1] = data[pointer];
				pointer = pointer - 1;
			}
			data[pointer + 1] = key;
		}
		return data;
	}
	
	/*
	Merge sort 
	Like QuickSort, Merge Sort is a Divide and Conquer algorithm.
	It divides the input array into two halves, calls itself for the two halves, 
	and then merges the two sorted halves.
	The merge() function is used for merging two halves.
	The merge(data, first, middle, last) is a key process that assumes that data[first..middle] 
	and arr[middle+1..last] are sorted and merges the two sorted sub-arrays into one.
	https://www.geeksforgeeks.org/merge-sort/
	*/
	
	/*
	Best case: O(n log n)
	Average case: O(n log n)
	Worst case: O(n log n)
	Reasons: As merge sort always divides the array into two halves and takes linear time to merge two halves
	*/
	public static void merge(int[] data, int first, int middle, int last){
		System.out.println("Masuk kedalam merge");
		int size1 = middle - first + 1;
		int size2 = last - middle;
		int cache1[] = new int[size1];
		int cache2[] = new int[size2];
		
		for(int index1 = 0; index1 < size1; index1++){
			cache1[index1] = data[first + index1];
		}
		for(int index2 = 0; index2 < size2; index2++){
			cache2[index2] = data[middle + 1 + index2];
		}
	
		int index1 = 0, index2 = 0;	
		int point = first;
		while(index1 < size1 && index2 < size2){
			if(cache1[index1] <= cache2[index2]){
				data[point] = cache1[index1];
				index1++;
			}else{
				data[point] = cache2[index2];
				index2++;
			}
			point++;
		}
		
		while(index1 < size1){
			data[point] = cache1[index1];
			index1++;
			point++;
		}
		
		while(index2 < size2){
			data[point] = cache2[index2];
			index2++;
			point++;
		}
		
	}
	/*
	iterasi 1
	first = 0, last = 9, middle = 4
	iterasi 2
	first = 0, last = 4, middle = 2
	iterasi 3
	first = 0, last = 2, middle = 1
	iterasi 4
	first = 0, last = 1, middle = 0
	Masuk kedalam merge
	
	iterasi 5
	first = 3, last = 4, middle = 3
	Masuk kedalam merge
	
	iterasi 6
	first = 5, last = 9, middle = 7
	iterasi 7
	first = 5, last = 7, middle = 6
	iterasi 8
	first = 5, last = 6, middle = 5
	Masuk kedalam merge
	
	iterasi 9
	first = 8, last = 9, middle = 8
	masuk kedalam merge
	*/
	public static int[] merge_Sort(int[] data, int first, int last){
		if(first < last){
			System.out.println("Masuk kedalam iterasi");
			System.out.println("Nilai first adalah: " + first);
			System.out.println("Nilai last adalah: " + last);
			int middle = first + (last - first)/2;
			System.out.println("Nilai middle adalah: " + middle);
			System.out.println();
			merge_Sort(data, first, middle);
			merge_Sort(data, middle + 1, last);
			merge(data, first, middle, last);
		}
		return data;
	}
	
	/*
	Quick Sort
	Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
	It picks an element as pivot and partitions the given array around the picked pivot.
	There are many different versions of quickSort that pick pivot in different ways.
	1. Always pick first element as pivot.
	2. Always pick last element as pivot 
	3. Pick a random element as pivot
	4. Pick median as pivot
	For this code the method used to choose pivot is on the last element of every partition
	The key process in quickSort is partition().
	Target of partitions is, given an array and an element x of array as pivot,
	put x at its correct position in sorted array and put all smaller elements (smaller than x) before x,
	and put all greater elements (greater than x) after x.
	All this should be done in linear time.
	https://www.geeksforgeeks.org/quick-sort/
	*/
	
	/*
	Time complexity of Quick Sort:
	Worst case = occurs when the partition process always picks the greatest or smallest element as pivot.
	If we consider below partition strategy where last element is always picked as pivot,
	the worst case would occur when the array is already sorted in increasing or decreasing order
	O(n^2)
	Best case = occurs when the partition process always picks the middle element as pivot.
	O(n log n)
	Average case = for analysis, we need to consider all possible permutation of array and
	calculate time taken by every permutation which doesn't look easy
	O(n log n)?
	*/
	public static int[] quick_Sort(int[] data, int start, int end){
		if(start < end){
			int partindex = partition(data, start, end);
			quick_Sort(data, start, partindex - 1);
			quick_Sort(data, partindex + 1, end);
		}
		return data;
	}
	
	public static int partition(int[] data, int start, int end){
		int pivot = data[end];
		int index = (start - 1);
		for(int point = start; point <= end; point++){
			if(data[point] < pivot){
				index++;
				swap_Quick(data, index, point);
			}
		}
		swap_Quick(data, index + 1, end);
		return(index + 1);
	}
	
	public static void swap_Quick(int[] data, int index, int point){
		int after = data[index];
		data[index] = data[point];
		data[point] = after;
	}
	
	/*
	Shell sort
	Is mainly a variation of Insertion Sort. In insertion sort, we move elements only one position ahead.
	When an element has to be moved far ahead, many movements are involved.
	The idea of shellSort is to allow exchange of far items.
	In shellSort, we make the array h-sorted for a large value of h.
	We keep reducing the value of h until it becomes 1.
	An array is said to be h-sorted if all sublists of every h’th element is sorted.
	https://www.geeksforgeeks.org/shellsort/
	*/
	
	/*
	Time complexity depends on how we reduce gap between the subarrays,
	This code use the reduction gap of Halve in every iteration, which make time complexity of:
	O(n^2) for the 3 cases (worst, average, best)
	*/
	public static int[] shell_Sort(int[] data){
		int size = data.length;
		
		for(int gap = size/2; gap > 0; gap /= 2){
			for(int index = gap; index < size; index++){
				int temp = data[index];
				int pointer;
				for(pointer = index; pointer >= gap && data[pointer - gap] > temp; pointer -= gap){
					data[pointer] = data[pointer - gap];
				}
				data[pointer] = temp;
			}
		}
		return data;
	}
	
	/*
	Tim Sort
	Algorithm based on Insertion sort and Merge sort.
	First sort small pieces using Insertion sort, then merges the pieces using Merge sort
	Devide the array into blocks known as Run. Sort the runs using Insertion sort on by one
	Merge those runs using the combine function used in Merge sort.
	If the size of the array is less than run, then Array gets sorted just by using Insertion sort.
	The size of the run may vary from 32 to 64 depending upon the size of the array.
	Note that the merge function performs well when size subarrays are powers of 2.
	The idea is based on the fact that Insertion sort performs well for small arrays
	Details On below code implementation
	We consider the size of the run as 32
	We one by one sort pieces of size equal to run
	After sorting individual pieces, we merge them one by one. 
	We double the size of merged subarrays after every iteration.
	https://www.geeksforgeeks.org/timsort/
	*/
	
	/*
	By design TimSort is well suited for partially sorted data with the best case being totally sorted data.
	It falls into the adaptive sort family. 
	Taking the number of runs p as a (natural) parameter for a refined analysis we obtained:
	Time complexity
	Worst case: O(n log n)
	Average case: O(n log n)
	Best case: O(n)
	*/
	public static int MIN_MERGE = 32;
	
	public static int minRunLength(int length){
		assert length >= 0;
		
		int post = 0;
		while(length >= MIN_MERGE){
			post |= (length & 1);
			length >>= 1;
		}
		return length + post;
	}
	
	public static int[] insertion_Tim_Sort(int[] data, int left, int right){
		for(int index = left + 1; index <= right; index++){
			int temp = data[index];
			int post = index - 1;
			while(post >= left && data[post] > temp){
				data[post + 1] = data[post];
				post--;
			}
			data[post + 1] = temp;
		}
		return data;
	}
	
	//Here we can copy paste the merge from Merge Sort section
	
	public static int[] tim_Sort(int[] data){
		int length = data.length;
		int minRun = minRunLength(MIN_MERGE);
		for(int post = 0; post < length; post += minRun){
			insertion_Tim_Sort(data, post, Math.min((post + MIN_MERGE - 1), (length - 1)));
		}
		
		for(int size = minRun; size < length; size = 2 * size){
			for(int left = 0; left < length; left += 2 * size){
				int mid = left + size - 1;
				int right = Math.min((left + 2 * size - 1), (length - 1));
				if(mid < right){
					merge(data, left, mid, right);
				}
			}
		}
		return data;
	}
	
	/*
	Comb Sort
	Mainly an improvement over Bubble sort. Bubble sort always compares adjacent values.
	So all inversions are removed one by one. 
	Comb Sort improves on Bubble Sort by using gap of size more than 1.
	The gap starts with a large value and shrinks by a factor of 1.3
	in every iteration until it reaches the value 1.
	Thus Comb Sort removes more than one inversion counts with one swap and performs better than Bubble Sort.
	The shrink factor has been empirically found to be 1.3
	Although, it works better than Bubble Sort on average, worst case remains O(n^2).
	https://www.geeksforgeeks.org/comb-sort/
	*/
	
	/*
	Time complexity
	Average case: O(n^2/2^p), where p is the number of increments.
	Worst case: O(n^2)
	Best case: O(n log n)
	In best case scenario, Comb Sort performs at O(n logn) time complexity.
	This creates a drastic improvement over Bubble Sort's performance.
	*/
	
	public static int nextGap(int gap){
		gap = (gap * 10)/13;
		if(gap < 1){
			return 1;
		}
		return gap;
	}
	
	public static int[] comb_Sort(int[] data){
		int length = data.length;
		int gap = length;
		boolean swapped = true;
		while(gap != 1 || swapped == true){
			gap = nextGap(gap);
			swapped = false;
			for(int index = 0; index < length - gap; index++){
				if(data[index] > data[index + gap]){
					swap_Comb(data, index, gap);
					swapped = true;
				}
			}
		}
		return data;
	}
	
	public static void swap_Comb(int[] data, int index, int gap){
		int temp = data[index];
		data[index] = data[index + gap];
		data[index + gap] = temp;
	}
	
	/*
	Gnome Sort
	Also called Stupid Sort is based on concept of a Garden Gnome sorting his flower pots.
	A garden gnome sorts the flower pots by the following method	
	- He looks at the flower pot next to him and the previous one
	If they are in the right order he steps one pot forward otherwise he swaps them and steps one pot backwards.
	- If there is no previous pot (he is at the starting of the pot line), he steps forwards
	If there is no pot next to him (he is at the end of the pot line), he is done.
	https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
	*/
	
	/*
	Worst case: O(n^2)
	Average case: O(n^2)
	As there are no nested loop (only one while) it may seem that this is a linear O(N) time algorithm.
	But the time complexity is O(N^2).
	This is because the variable – ‘index’ in our program doesn’t always gets incremented, it gets decremented too. 
	Best case: O(n)
	However this sorting algorithm is adaptive and performs better if the array is already/partially sorted.
	*/
	
	public static int[] gnome_Sort(int[] data){
		int length = data.length;
		int index = 0;
		
		while(index < length){
			if(index == 0){
				index++;
			}
			if(data[index] >= data[index - 1]){
				index++;
			}else{
				swap_Gnome(data, index);
				index--;
			}
		}
		return data;
	}
	
	public static void swap_Gnome(int[] data, int index){
		int temp = data[index];
		data[index] = data[index - 1];
		data[index - 1] = temp;
	}
	
}

//May the force be with thou, Salute to you comrade