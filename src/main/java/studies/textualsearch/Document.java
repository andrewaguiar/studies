package studies.textualsearch;

import java.util.List;

public class Document {

	private String id;
	private Terms terms;
	private double boost;

	public Document(String id, List<String> terms) {
		this(id, 1.0, terms);
	}
	public Document(String id, double boost, List<String> terms) {
		this.id = id;
		this.boost = boost;
		this.terms = new Terms(terms);
	}

	public String getId() {
		return id;
	}

	public boolean containsTerm(Term t) {
		return terms.getNumberOfOccurences(t) > 0;
	}

	public double getNumberOfTerms() {
		return (double) terms.numberOfTerms();
	}

	public double getNumberOfOccurrencesOfTerm(Term termToCheck) {
		return terms.getNumberOfOccurences(termToCheck);
	}

	public Terms getTerms() {
		return terms;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Document)) {
			return false;
		}
		return ((Document) obj).id.equals(id);
	}

	@Override
	public String toString() {
		return "Document[" + id + "]^" + boost;
	}

	public double getBoost() {
		return boost;
	}
}
