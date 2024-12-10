public class WordProcessor implements Counter {

	private String text = "";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int countWords(String sentence) {
		if (sentence == null) {
			sentence = this.text;
		}
		String[] words = sentence.trim().split("\\s+");
		return words.length;
	}

	public int countLetters(String sentence) {
		int letters = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (Character.isLetter(sentence.charAt(i))) {
				letters++;
			}
		}
		return letters;
	}

	public int getLength(String sentence) {
		return sentence.length(); // Returns the length of the sentence
	}

}
