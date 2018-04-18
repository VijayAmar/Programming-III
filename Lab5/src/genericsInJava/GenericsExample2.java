package genericsInJava;

public class GenericsExample2 {

	public static void main(String[] args) {
		System.out.println("Maximun number: " + max(88, 76, 98));
		System.out.println("Max string: " + max("Apple", "Kiwi", "Pear"));
		System.out.println("Max Character: " + max('x', 'w', 'z'));

	}
	
	public static <T extends Comparable > T max(T v1, T v2, T v3) {
		T max = v1;
		
		if(v2.compareTo(v1) > 0)
			max = v2;
		if(v3.compareTo(max) > 0)
			max = v3;
		return max;
			
		
	}

}
