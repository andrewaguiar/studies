package studies.textualsearch;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Result {
	private Query q;
	private List<ResultItem> resultItems;

	public Result(Query q) {
		this.q = q;
		this.resultItems = new LinkedList<ResultItem>();
	}

	public List<ResultItem> getResultItems() {
		List<ResultItem> result = new LinkedList<ResultItem>(resultItems);
		Collections.sort(result, new Comparator<ResultItem>() {
			@Override
			public int compare(ResultItem o1, ResultItem o2) {
				return o2.getScore().compareTo(o1.getScore());
			}
		});
		return result;
	}
	
	public Query getQuery() {
		return q;
	}

	public boolean add(ResultItem resultItem) {
		return resultItems.add(resultItem);
	}
}
