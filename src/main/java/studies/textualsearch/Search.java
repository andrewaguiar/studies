package studies.textualsearch;

public class Search {
	private MySimilarityCalculator sc;
	private Corpus corpus;

	public Search(Corpus corpus) {
		this.corpus = corpus;
		this.sc = new MySimilarityCalculator();
	}

	public Result query(Query q) {
		Result result = new Result(q);

		for (Document d : corpus.getDocuments()) {
			double score = sc.calculate(q, d, corpus);
			if (score > 0.0) {
				result.add(new ResultItem(d, score));
			}
		}

		return result;
	}
}
