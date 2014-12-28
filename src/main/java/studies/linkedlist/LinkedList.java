package studies.linkedlist;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
	private int size;
	private Node<T> root;
	private Node<T> last;

	public void add(T t) {
		Node<T> newNode = new Node<T>(t);
		if (root == null) {
			root = newNode;
		} else {
			last.linkNext(newNode);
		}

		last = newNode;

		size++;
	}

	public void insert(T t, T reference) {
		this.insert(t, getNode(reference));
	}

	public void insert(T t, int index) {
		if (index < 0) {
			throw new IllegalArgumentException("invalid negative index "
					+ index);
		}
		if (index >= size) {
			add(t);
			return;
		}
		this.insert(t, getNode(index));
	}

	private void insert(T t, Node<T> current) {
		Node<T> newNode = new Node<T>(t);

		if (current == root) {
			root.linkPrior(newNode);
			root = newNode;
		} else {
			Node<T> prior = current.getPriorNode();
			newNode.linkNext(current);
			prior.linkNext(newNode);
		}

		size++;
	}

	public boolean replace(T reference, T change) {
		return this.replace(getNode(reference), change);
	}

	public boolean replace(int index, T change) {
		return this.replace(getNode(index), change);
	}

	private boolean replace(Node<T> node, T change) {
		if (node == null) {
			return false;
		}

		node.setValue(change);
		return true;
	}

	public boolean remove(T t) {
		if (size == 0) {
			return false;
		}

		Node<T> current = getNode(t);

		if (current == null) {
			return false;
		}

		Node<T> prior = current.getPriorNode();
		Node<T> next = current.getNextNode();

		if (current == last) {
			prior.linkNext(null);
			last = prior;

		} else if (current == root) {
			next.linkPrior(null);
			root = next;

		} else {
			prior.linkNext(next);

		}

		size--;

		return true;
	}

	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("[");

		Node<T> currentNode = root;

		do {
			sb.append(currentNode);

			currentNode = currentNode.getNextNode();
			if (currentNode != null) {
				sb.append(",");
			}
		} while (currentNode != null);

		return sb.append("]").toString();
	}

	public int indexOf(T t) {
		if (size == 0) {
			return -1;
		}

		Node<T> currentNode = root;
		int counting = 0;

		do {
			if (currentNode.getValue().equals(t)) {
				return counting;
			}
			counting++;
			currentNode = currentNode.getNextNode();

		} while (currentNode != null);

		return -1;
	}
	
	public T get(int index) {
		Node<T> node = getNode(index);
		return node == null ? null : node.getValue();
	}

	public int size() {
		return size;
	}

	private Node<T> getNode(T t) {
		if (size == 0) {
			return null;
		}

		Node<T> currentNode = root;
		do {
			if (currentNode.getValue().equals(t)) {
				return currentNode;
			}
			currentNode = currentNode.getNextNode();

		} while (currentNode != null);

		return null;
	}

	private Node<T> getNode(int index) {
		if (index < 0) {
			throw new IllegalArgumentException("invalid negative index "
					+ index);
		}
		if (size == 0 || index >= size) {
			return null;
		}

		Node<T> currentNode = root;
		int counting = 0;

		do {
			if (index == counting++) {
				return currentNode;
			}
			currentNode = currentNode.getNextNode();

		} while (currentNode != null);

		return null;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>(this);
	}

	public Node<T> getRoot() {
		return root;
	}
}
