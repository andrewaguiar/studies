package studies.linkedlist;

public class Node<T> {
	private T value;
	private Node<T> prior;
	private Node<T> next;

	public Node(T t) {
		this.value = t;
	}

	void linkNext(Node<T> next) {
		this.setNext(next);
		if (next != null) {
			next.setPrior(this);
		}
	}

	void linkPrior(Node<T> prior) {
		this.setPrior(prior);
		if (prior != null) {
			prior.setNext(this);
		}
	}

	private void setNext(Node<T> node) {
		this.next = node;
	}

	private void setPrior(Node<T> node) {
		this.prior = node;
	}

	Node<T> getNextNode() {
		return next;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public Node<T> getPriorNode() {
		return prior;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}
