import java.util.*;
	public class CekNilaiGanjil_1402020069 {
		public static void main(String[] args) {
			int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
			int t = 0;
			for(int i = 0; arr.length > i; ++i){
				if(arr[i] % 2 == 1)
					t = arr[i];
			int tampung = rekursif(arr, t, 0);
			System.out.println(t + " kuadrat: " + tampung);
			}
		}
		static int rekursif(int[] n, int target, int index) {
			if(n.length <= index)
				return 0;
			if(n[index] == target)
				return target * target;
			return rekursif(n, target, index + 1);
		}
}