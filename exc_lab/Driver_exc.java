
public class Driver_exc {

	public static void main (String[] args) {
		
		ArrayProcessor ap = new ArrayProcessor();
		
		String[] stringArray = {"one", "two", "three"};
		int len = ap.getArrayLength(stringArray);
		System.out.println("Array length is " + len);
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		len = ap.getArrayLength(intArray);
		System.out.println("Array length is " + len);
	}

}
