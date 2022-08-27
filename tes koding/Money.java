import java.util.*;
 
public class Money {
 
	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
 
		int b = scn.nextInt();
		
		int[] a = {1000, 2000, 5000, 10000};
		int x = help(a, b);
		System.out.println(x);
	}
	
	
	public static int help(int[] a, int n) {
		if(n == 0) {
			System.out.println("Uang yang Anda Input Tidak Sesuai");
		}
		int[] table = new int[n + 1];
        Arrays.fill(table, 0);
        table[0] = 1;
		return Money.countWays(a, n, a.length, table);
	}
    public static int countWays(int dataUang[], int n, int m, int[] table){
        for (int i = 0; i < m; i++)
            for (int j = dataUang[i]; j <= n; j++)
                table[j] += table[j - dataUang[i]];
        return table[n];
    }

}

