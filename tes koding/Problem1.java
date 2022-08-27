import java.util.*;

public class Problem1 {
	public static void main(String[] args) {
		Stack<String> n = new Stack<>();
		String cache = "3 + 2 - 4";
		n.push("-");
		n.push("4");
		n.push("+");
		n.push("2");
		n.push("3");
		// System.out.println(solution(n));
		System.out.println(solution2(cache));
	}
	
	public static Stack<String> solution2(String cache) {
		Stack<String> result = new Stack<>();
		String[] n = cache.split(" ");
		for(int i = n.length - 2; i > 0; i -= 2) {
			result.push(n[i]);
			result.push(n[i + 1]);
		}
		result.push(n[0]);
		return result;
	}
	
	public static double solution(Stack<String> n) {
		if(n.size() == 1)
			return Double.parseDouble(n.pop());
		
		double a = Double.parseDouble(n.pop());
		double b = Double.parseDouble(n.pop());
		double c = 0;
		switch(n.pop()) {
			case "+" :
			c = a + b;
			break;
			case "-" :
			c = a - b;
			break;
			case "*" :
			c = a * b;
			break;
			case "/" :
			c = a / b;
			break;
		}
		n.add("" + c);
		return solution(n);
	}
	
}