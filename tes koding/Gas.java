import java.util.*;

public class Gas {  

    public static int coinHelper(int[][] numWays, int[] coins, int value) {
 
        for(int i = 1; i <= value; i++) {
            for(int j = 1; j <= coins.length; j++) {
                numWays[i][j] = (i - coins[j - 1] >= 0 ? numWays[i - coins[j - 1]][j] : 0 ) + numWays[i][j - 1];
            }
        }
        return numWays[value][coins.length];
    }
	
	public static int coinChange(int value, int[] coins) {
		int[][] numWays = new int[value + 1][coins.length + 1];
 
        for(int i = 0; i <= coins.length; i++) { 
            numWays[0][i] = 1;
        }
 
        for(int i = 1; i <= value; i++ ) {
            numWays[i][0] = 0;
        }
		return coinHelper(numWays, coins, value);
	}
 
    public  static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
        int value = in.nextInt();
        int[] coins = {1000, 2000, 5000, 10000};
 
        int count = coinChange(value, coins);
 
        System.out.println(count);
    }

}