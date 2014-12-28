package studies.nonrepeatedword;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordsCounter {

	private Map<String, Counter> map;

	public WordsCounter() {
		map = new LinkedHashMap<String, Counter>();
	}

	public void count(String word) {
		Counter counter = map.get(word);
		if (counter == null) {
			counter = new Counter();
			map.put(word, counter);
		}
		counter.inc();
	}

	public String getFirstWithCounting(int counting) {
		if (!map.isEmpty()) {
			for (Entry<String, Counter> entry : map.entrySet()) {
				if (entry.getValue().getCounting() == counting) {
					return entry.getKey();
				}
			}
		}
		return null;
	}

}
