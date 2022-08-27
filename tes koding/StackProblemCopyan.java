import java.util.*;

public class StackProblemCopyan{
	public static void main(String[] args){
		Stack<String> data = new Stack<>();
		String cache = "5 + 2 * 2 - 4 + 10 * 2 / 4";
		System.out.print(cache + " = ");
		System.out.println(firstSolution(secondSolution(cache)));
	}
	
	public static Stack<String> secondSolution(String cache){
		Stack<String> result = new Stack<>();
		String[] data = cache.split(" ");
		for(int index = data.length - 2; index > 0; index -= 2){
			result.push(data[index]);
			result.push(data[index + 1]);
		}
		result.push(data[0]);
		return result;
	}
	
	public static double firstSolution(Stack<String> data){
		if(data.size() == 1){
			return Double.parseDouble(data.pop());
		}
		double a = Double.parseDouble(data.pop()); 
		double b = Double.parseDouble(data.pop());
		double c = 0;
		switch(data.pop()){
			case "+" :
				c = a + b;
			break;
			case "-" :
				c = a - b;
			break;
			case "*":
				c = a * b;
			break;
			case "/":
				c = a / b;
			break;
		}
		data.add("" + c);
		return firstSolution(data);
	}
}