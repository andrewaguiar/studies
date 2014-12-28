package studies.textualsearch;

public class Query {

	private Term[] terms;

	public Query(Term... terms) {
		this.terms = terms;
	}

	public Term[] getTerms() {
		return terms;
	}
}
