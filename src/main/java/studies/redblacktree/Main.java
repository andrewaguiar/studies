package studies.redblacktree;

public class Main {
	public static void main(String[] args) {
		RedBlackTreeNode<Integer> tree = new RedBlackTreeNode<Integer>();
		tree.add(2);
		tree.add(1);
		tree.add(7);
		tree.add(4);
		tree.add(5);
		tree.add(3);
		tree.add(10);
		tree.add(3);
		tree.add(21);
		tree.add(31);
		tree.add(15);
		tree.add(13);
		tree.add(9);

		System.out.println(tree.contains(13));
	}
}
