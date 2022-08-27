import java.util.*;

public class Tree_Sample{
	public static void main(String[] args){
		TreeNodeSDA<Integer> root = new TreeNodeSDA<>(35, null);
		TreeNodeSDA<Integer> child = new TreeNodeSDA<Integer>(30, root);
		TreeNodeSDA<Integer> child1 = new TreeNodeSDA<Integer>(25, root);
		root.addChild(child);
		root.addChild(child1);
		child.addChild(new TreeNodeSDA<Integer>(20, child));
		child1.addChild(new TreeNodeSDA<Integer>(37, child1));
		child1.addChild(new TreeNodeSDA<Integer>(45, child1));
		System.out.print("Pencarian Tree secara BFS: ");
		breadthFirstPrint(root);
		System.out.println();
		System.out.print("Pencarian Tree secara DFS: ");
		depthFirstPrint(root);
	}
	
	public static void breadthFirstPrint(TreeNodeSDA<Integer> node){
		System.out.print(node + ", ");
		breadthFirstPrintHelper(node);
	}
	
	private static void breadthFirstPrintHelper(TreeNodeSDA<Integer> node){
		LinkedList<TreeNodeSDA<Integer>> children = node.getChildren();
		System.out.print(children);
		for(TreeNodeSDA<Integer> child:children){
			breadthFirstPrintHelper(child);
		}
	}
	
	public static void depthFirstPrint(TreeNodeSDA<Integer> node){
		depthFirstPrintHelper(node);
	}
	
	private static void depthFirstPrintHelper(TreeNodeSDA<Integer> node){
		System.out.print(node + ", ");
		LinkedList<TreeNodeSDA<Integer>> children = node.getChildren();
		for(TreeNodeSDA<Integer> child: children){
			depthFirstPrint(child);
		}
	}
}