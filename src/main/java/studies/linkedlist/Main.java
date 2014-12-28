package studies.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");

		System.out.println(list + " - " + list.size());

		System.out.println("removing 'c' from list = " + list.remove("c"));
		System.out.println("removing 'h' from list = " + list.remove("h"));

		System.out.println(list + " - " + list.size());

		list.insert("-", 0);
		list.insert("-", list.size() / 2);

		System.out.println(list + " - " + list.size());

		list.insert("-", "g");

		System.out.println(list + " - " + list.size());

		list.replace("d", "D");
		list.replace("x", "X");
		list.replace(8, "G");
		list.replace(10, "G");

		System.out.println(list + " - " + list.size());

		System.out.print("[");
		for (String s : list) {
			System.out.print(s);
		}
		System.out.println("]");

		System.out.println("index of Z = " + list.indexOf("Z"));
		System.out.println("index of - = " + list.indexOf("-"));
		System.out.println("index of D = " + list.indexOf("D"));
		System.out.println("index of G = " + list.indexOf("G"));

		System.out.println("getting from index 0 = " + list.get(0));
		System.out.println("getting from index 8 = " + list.get(8));
		System.out.println("getting from index 9 = " + list.get(9));
	}
}
