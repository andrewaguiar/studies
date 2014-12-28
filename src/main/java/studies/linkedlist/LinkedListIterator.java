package studies.linkedlist;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

	private Node<T> currentNode;

	public LinkedListIterator(LinkedList<T> list) {
		this.currentNode = list.getRoot();
	}

	@Override
	public boolean hasNext() {
		return currentNode != null;
	}

	@Override
	public T next() {
		T value = currentNode.getValue();
		currentNode = currentNode.getNextNode();
		return value;
	}

	@Override
	public void remove() {
	}
}
