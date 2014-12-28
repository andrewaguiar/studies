package studies.textualsearch;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class MySimilarityCalculator {

	// · ( tf(t in d) * idf(t)2 * t.getBoost() * norm(t,d) ) * coord(q,d) * queryNorm(q)
	public double calculate(Query q, Document d, Corpus corpus) {
		double total = 0.0;

		for (Term t : q.getTerms()) {
			double tf = tf(t,d);
			double idf = pow(idf(corpus,t), 2);
			double boost = t.getBoost();
			double norm = norm(t,d);

			double coord = coord(q,d);
			double queryNorm = queryNorm(q);

			total += (tf * idf * boost * norm) * coord * queryNorm;
		}

		return total;
	}

	private double queryNorm(Query q) {
		// TODO Auto-generated method stub
		return 1;
	}

	private double coord(Query q, Document d) {
		// TODO Auto-generated method stub
		return 1;
	}

	private double norm(Term t, Document d) {
		// TODO Auto-generated method stub
		// d.getBoost() * lengthNorm(f) * f.getBoost();
		return 1;
	}

	private double idf(Corpus c, Term t) {
		return 1 + log(c.getNumberOfDocuments() / (c.getNumberOfDocumentsContainingTerm(t) + 1));
	}

	private double tf(Term t, Document d) {
		return d.getNumberOfOccurrencesOfTerm(t) / d.getNumberOfTerms();
	}
}
