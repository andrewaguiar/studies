package studies.textualsearch;

public class Term {

	private String value;
	private double boost;

	public Term(String value) {
		this(value, 1.0);
	}

	public Term(String value, double boost) {
		this.value = value;
		this.boost = boost;
	}

	public String getValue() {
		return value;
	}

	public double getBoost() {
		return boost;
	}
}
