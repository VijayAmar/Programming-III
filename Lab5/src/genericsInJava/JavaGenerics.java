package genericsInJava;

import java.util.ArrayList;

public class JavaGenerics {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		
		myList.add("Hello");
		myList.add(false);
		myList.add(125); // at index 2
		
		//int total = 30 + myList.get(2); How to fix this??
		//String var1 = myList.get(0);
		
		ArrayList<Integer> list = new ArrayList<>();
		

	}

}
