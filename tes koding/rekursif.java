import java.util.*;
public class rekursif{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] n = new int[6];
		for(int i = 0; i < n.length; i++){
			n[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(n));
		System.out.print("Target yang dimasukan: ");
		int target = in.nextInt();
		
		int z = recursion(n, 0, target);
		// System.out.println("Kembalian: " + z);

		boolean m = recurs(n, 0, target);
		// System.out.println("Hasil: " + m);
		
		int findIt = find(n, 0, target);
		System.out.println("Hasil: " + findIt);
		
		/*System.out.print("Masukan target: ");
		int h = in.nextInt();
		System.out.print("Masukan data: ");
		int data = in.nextInt();
		int x = count(h, data);
		System.out.println("Hasil berikut: " + x);
		System.out.println("Modulo dari: " + data % 100);*/
	}
	static int recursion(int[] data, int index, int target){
		// base case, induksi case != index
		if(data.length == index)
			return 0;
		// base case nyari index
		if(data[index] == target) // && data[index + 1] == target * target)
			return 1 + recursion(data, index + 1, target);

		return recursion(data, index + 1, target);
	}

	static boolean recurs(int[] n, int index, int target){
		if(n.length == index)
			return false;
		if(n[index] == target)
			return true;
		return recurs(n, ++index, target);
	}
	
	public static int count(int target, int data){
		if(data == 0)
			return 0;
		if(data % 100 == target)
			return 1 + count(target, data / 100);
		return count(target, data / 10);
	}
	
	static int find(int[] n, int index, int target){
		if(n.length == index)
			return 0;
		if(n[index] == target && n[index + 1] == target * target)
			return 1 + find(n, ++index, target);
		return find(n, index + 1, target);
	}
	
}