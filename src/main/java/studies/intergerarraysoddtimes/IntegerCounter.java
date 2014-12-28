package studies.intergerarraysoddtimes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IntegerCounter {

	private Map<Integer, Counter> map;
	
	public IntegerCounter() {
		map = new HashMap<Integer, Counter>();
	}

	public void count(int integer) {
		Counter counter = map.get(integer);
		if (counter == null) {
			counter = new Counter();
			map.put(integer, counter);
		}
		
		counter.inc();
	}

	public List<Integer> getAllEvenCountedInteger() {
		LinkedList<Integer> result = new LinkedList<>();
		for (Entry<Integer, Counter> entry : map.entrySet()) {
			if (entry.getValue().isEven()) {
				result.add(entry.getKey());
			}
		}
		return result;
	}

}
