import java.util.*;
public class StrukturData_Hashmap {
	public static void main(String[] args) {
		HashMap <Integer,String> npm = new HashMap<>();
		rekursif(npm, args, 0);
		System.out.println("Setelah menjadi hashmap:\n" + npm);
		for (int i = 0;i < args[0].length();i++ ) {
			if(args[0].substring(i, i + 1).equals("A") || args[0].substring(i, i + 1).equals("w")){
				npm.remove(i + 1);
			}
		}
		System.out.println("Karakter yang dihapus: " + args[0].substring(3, 4) + " " + args[0].substring(6, 7));
		System.out.println("Hasil HashMap setelah diupdate: ");
		System.out.print(npm);	
	}
	public static HashMap <Integer,String> rekursif(HashMap <Integer,String> npm, String[] args, int i) {
		if(i >= args[0].length())
			return npm;
		npm.put(i + 1, args[0].substring(i, i + 1));
		rekursif(npm, args, i + 1);
		return npm;
	}
}