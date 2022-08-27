import java.util.*;
public class InsertionGenap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		System.out.print("Input: ");
		for(int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		sort(a);
		System.out.print("Setelah di sorting: ");
		System.out.print(Arrays.toString(a));
	}
	public static int[] sort(int[] a) {
		int temp = 0;
		for(int i = 1; i < a.length; i++) {
			for(int j = i; j > 0; j--) {
				if(a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		return a;
	}
}