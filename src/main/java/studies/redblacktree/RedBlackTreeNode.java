package studies.redblacktree;

public class RedBlackTreeNode<T extends Comparable<T>> {

	private T value;
	private RedBlackTreeNode<T> left;
	private RedBlackTreeNode<T> right;

	public void add(T t) {
		if (this.value == null) {
			this.value = t;
		} else {
			switch (t.compareTo(value)) {
			case 1:
				(right == null ? right = new RedBlackTreeNode<>() : right).add(t);
				break;
			case -1:
				(left == null ? left = new RedBlackTreeNode<>() : left).add(t);
				break;
			default:
				this.value = t;
				break;
			}
		}
	}

	public boolean contains(T t) {
		return get(t) != null;
	}

	public T get(T t) {
		switch (t.compareTo(value)) {
		case 1:
			return right != null ? right.get(t) : null;
		case -1:
			return left != null ? left.get(t) : null;
		default:
			return this.value;
		}
	}
}
