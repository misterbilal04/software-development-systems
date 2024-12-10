import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {
		// Create a Scanner object for input
		Scanner scan = new Scanner(System.in);

		// Ask the user to input some text
		System.out.println("Enter a sentence: ");
		String input = scan.nextLine();

		// Create an instance of WordProcessor
		Counter wordProcessor = new WordProcessor(); // Instance type is Counter

		// Call the methods and display the results
		int wordCount = wordProcessor.countWords(input);
		int letterCount = wordProcessor.countLetters(input);
		int length = wordProcessor.getLength(input);

		// Display results
		System.out.println("Word count: " + wordCount);
		System.out.println("Letter count: " + letterCount);
		System.out.println("Sentence length (including spaces): " + length);

		scan.close(); // Close scanner to prevent resource leaks
	}
}