package studies.palindromedetect;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> palindrome = new LinkedList<>();
		palindrome.add("a");
		palindrome.add("b");
		palindrome.add("c");
		palindrome.add("c");
		palindrome.add("c");
		palindrome.add("b");
		palindrome.add("a");

		PalindromeDetecter detecter = new PalindromeDetecter();
		System.out.println(detecter.isPalimdrome(palindrome));
	}
}
