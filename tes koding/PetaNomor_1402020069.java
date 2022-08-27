import java.util.*;
public class PetaNomor_1402020069{
	public static void main(String[] args) {
		HashMap <Integer,Character> npm = new HashMap<>();
		char[] tmp = args[0].toCharArray();
		for (int i = 0;i < tmp.length;i++ ) {
			npm.put(i + 1, tmp[i]);
		}
		System.out.println("Setelah menjadi hashmap:\n" + npm);
		for (int i = 0;i < tmp.length;i++ ) {
			if(tmp[i] == 'A' || tmp[i] == 'w'){
				npm.remove(i + 1);
			}
		}
		System.out.println("Karakter yang dihapus: " + tmp[3] + " " + tmp[6]);
		System.out.println("Hasil HashMap setelah diupdate: ");
		System.out.print(npm);
	}
}