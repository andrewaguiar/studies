package studies.intergerarraysoddtimes;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println(findIntegers(new int[]{1,4,4,6,6,7,7,7,9,9,9,9,9,9,9,8,8,8,8}));
	}

	private static List<Integer> findIntegers(int[] arrayOfIntegers) {
		IntegerCounter counter = new IntegerCounter();

		for (int i = 0, j = arrayOfIntegers.length - 1 ; i < arrayOfIntegers.length ; i++, j--){
			counter.count(arrayOfIntegers[i]);
			if (i == j) {
				break;
			}
			counter.count(arrayOfIntegers[j]);
		}

		return counter.getAllEvenCountedInteger();
	}
}
