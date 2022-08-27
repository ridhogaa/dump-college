import java.util.*;
public class DeleteQueue{
	public static void main(String[] args) {
		Queue<Character> queue = new LinkedList<>();
		char[] x = args[0].toCharArray();
		for (int i = 0;i < x.length ;i++ ) {
			queue.add(x[i]);
		}
		System.out.println(queue);
		for (int j = 0;j < x.length ;j++ ) {
			if((x[j] >= 48) && (x[j] <= 57))
				queue.remove(x[j]);
		}
		System.out.println(queue);
	}
}