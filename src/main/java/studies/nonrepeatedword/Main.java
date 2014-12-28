package studies.nonrepeatedword;

public class Main {

	public static void main(String[] args) {
		String streamExample = "cachorro cavalo pato pato cavalo cachorro coelho coelho coelho ganso";

		System.out.println(getFirstNonRepeatedWordInTheStream(streamExample.split(" ")));
	}

	private static String getFirstNonRepeatedWordInTheStream(String [] words) {
		WordsCounter counter = new WordsCounter();

		for (String word : words) {
			counter.count(word);
		}

		return counter.getFirstWithCounting(1);
	}
}
