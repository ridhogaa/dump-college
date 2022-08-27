import java.util.*;
public class Recursion {
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int i = 0;
		int z = 1;
		int s = 2;
		
		int x = rekursif(data, z, i);
		System.out.println("Kembalian: " + x);
		
		boolean b = rek(data, z, i);
		System.out.println("True/False: " + b);
		
		int r = rekurs(data, z, i, s);
		System.out.println("Return target1 & target2: " + r);
		
	}
	static int rekursif(int[] n, int target, int index) {
		if(n.length == index)
			return 0;
		if(n[index] == target)
			return 1 + rekursif(n, target, index + 1);
		
		return rekursif(n, target, index + 1);
	}
	static boolean rek(int[] n, int target, int index) {
		if(n.length == index)
			return false;
		if(n[index] == target)
			return true;
		return rek(n, target, ++index);
	}
	static int rekurs(int[] n, int target1, int index, int target2) {
		if(n.length == index)
			return 0;
		if(n[index] == target1 && n[index + 1] == target2)
			return 1 + rekurs(n, target1, index + 1, target2);
		
		return rekurs(n, target1, index + 1, target2);
	}
}