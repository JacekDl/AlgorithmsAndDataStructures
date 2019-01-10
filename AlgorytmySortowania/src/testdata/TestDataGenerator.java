package testdata;

import java.util.Random;

public class TestDataGenerator {

	public int[] generateRandomNumbers(int length, int bound) {

		Random random = new Random();
		int[] result = new int[length];

		for (int i = 0; i < result.length; i++) {
			result[i] = random.nextInt(bound);
		}

		return result;

	}

}
