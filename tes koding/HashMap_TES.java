import java.util.*;
public class HashMap_TES {
	public static void main(String[] args) {
		HashMap <Integer, Character> npm = new HashMap<Integer, Character>();
		char[] tmp = args[0].toCharArray();
		for (int i = 0;i < tmp.length ;i++ ) {
			npm.put(i + 1, tmp[i]);
		}
		System.out.println(npm);
		char t = 0;
		for (int i = 0;i < tmp.length ;i++ ) {
			if(tmp[i] == 'A' || tmp[i] == 'w') {
				npm.remove(i + 1);
				t = tmp[i];
			}
		}
		System.out.println("Karakter yang dihapus: " + t + " " + tmp[6]);
		System.out.println("Hashmap setelah di update: ");
		System.out.println(npm);
	}
}