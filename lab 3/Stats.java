import java.util.Arrays;

public class Stats {

	int[] numbers;
	int count;

	/**
	 * @param value acts as numbers stored
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	/**
	 * @return the amount of numbers in the list
	 */
	public int getCount() {
		return numbers.length;
	}

	/**
	 * @return the biggest number
	 */
	public int getMax() {
		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > max)
				max = numbers[i];
		}
		return max;
	}

	/**
	 * @return the smallest number
	 */
	public int getMin() {
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}

	/**
	 * @return all numbers added
	 */
	public int getTotal() {
		int total = 0;

		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

	/**
	 * @return the average
	 */
	public double getAverage() {
		int x = 0;

		for (int i = 0; i < numbers.length; i++) {
			x += numbers[i];
		}

		double y = x / (double) numbers.length;
		return y;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}

	public Stats(int capacity) {
		numbers = new int[capacity];
	}

}