import java.util.*;
public class StrukturData_Stack {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> data = new Stack<>();
		Stack<Integer> data2 = new Stack<>();
		System.out.print("Masukan panjang data yang anda inginkan: ");
		int a = in.nextInt();
		int[] n = new int[a];
		for (int i = 0; i < n.length;i++ ) {
			System.out.print("Input data ke-" + (i + 1) + " : ");
			n[i] = in.nextInt();
		}
		Arrays.sort(n);
		for (int i = 0; i < n.length;i++ ) {
			data.push(n[i]);
		}
		System.out.println("data di dalam stack: " + data);
		reverse(data2, n, n.length - 1);
		System.out.println("data setelah di reverse: " + data2);
		
		Stack<Integer> x = sortstack(data);
		System.out.println(x);
	}
	public static Stack<Integer> reverse(Stack<Integer> data2, int[] n, int i) {
		if(i < 0){
			return data2;
		}
		data2.push(n[i]);
		reverse(data2, n, --i);
		return data2;
	}	

	public static void printStack(Stack<Integer> stack) {
		while(!stack.empty()) {
			System.out.print(stack.peek() + " ");
			stack.pop();
		}
	}

	public static Stack<Integer> sortstack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty()) {
            int tmp = input.pop();
            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
            	input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }
}