import java.util.*;
public class StrukturData_Queue {
	public static void main(String[] args) {
		Queue<String> data = new LinkedList<>();
		String[] n = {"Ridho", "Ridha", "Aldo", "Nabila", "Putri"};
		rekursif(data, n, 0);
		System.out.println(data);
		Queue<String> data2 = new LinkedList<>();
		reverseRekursif(data2, n, n.length - 1);
		System.out.println("Reverse data linkedlist queue adalah: " + data2);
		System.out.println("Melihat data pertama: " + data.peek());
		System.out.println("Melihat data kedua: " + data2.peek());
		Queue<String> queue = new PriorityQueue<>();
		reverseRekursif(queue, n, n.length - 1);
		System.out.println("Sorting priority queue adalah: " + queue);
	}
	private static Queue<String> rekursif(Queue<String> data, String[] n, int i) {
		if(i >= n.length) 
			return data;
		data.add(n[i]);
		rekursif(data, n, i + 1);
		return data;
	}

	private static Queue<String> reverseRekursif(Queue<String> data, String[] n, int i) {
		if(i < 0) 
			return data;
		data.add(n[i]);
		reverseRekursif(data, n, --i);
		return data;
	}
}