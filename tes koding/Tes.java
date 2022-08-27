import java.util.*;
public class Tes{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] y = {1000, 2000, 5000, 10000};
		System.out.println("=======");
		System.out.println("Selamat datang di tukar uang");
		System.out.println("Program ini dibuat oleh Ridho Gymnastiar Al Rasyid 1402020069");
		System.out.println("=======");

		System.out.print("Masukan jumlah uang: ");
		int uang = input.nextInt();

		int skut = dataHelper(y, uang);
		System.out.println("Banyaknya kombinasi penukaran: " + skut);
	}

	public static int data(int[][] t, int n, int[] s, int data) {
        for (int i = 0; i <= n; i++) {
            t[i][0] = 1;
        }
 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= data; j++) {
                if (s[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                }
                else {
                    t[i][j] = t[i - 1][j] + t[i][j - s[i - 1]];
                }
            }
        }
 
        return t[n][data];
    }
	
	public static int dataHelper(int[] x, int d) {
		int n = x.length;
 
        int t[][] = new int[n + 1][d + 1];
		return Tes.data(t, n, x, d);
	}
	
}