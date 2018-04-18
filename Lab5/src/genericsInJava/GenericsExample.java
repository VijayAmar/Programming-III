package genericsInJava;

public class GenericsExample {

	public static void main(String[] args) {
		Integer[] iArray = {1, 5, 13, 20};
		Character[] cArray = {'3', 'A', 'V', 'A'}; //this can be less than 4 or greater than 4
		
		displayArray(iArray);
		System.out.println();
		displayArray(cArray);
	}

//	public static void displayArray(Integer[] iArray) {
//		for(Integer temp : iArray) {
//			System.out.println(" " + temp);
//		}
//	} 
//	
//	public static void displayArray(Character[] cArray) {
//		for(Character temp : cArray) {
//			System.out.println(" " + temp);
//		}
//	} 
	
	public static <T> void displayArray(T[] array) {
		for(T temp : array) {
			System.out.println("%s " + temp);
		}
	}
}
