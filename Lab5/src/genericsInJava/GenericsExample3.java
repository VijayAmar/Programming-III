/*
 * creating pseudo generic claa
 */

package genericsInJava;

public class GenericsExample3 {

	String item1;
	String item2;
	
	public GenericsExample3(String item1, String item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void displayItem() {
		System.out.println("the items are: ");
		System.out.println("Item 1: " + item1);
		System.out.println("Utem 2: " + item2);
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
