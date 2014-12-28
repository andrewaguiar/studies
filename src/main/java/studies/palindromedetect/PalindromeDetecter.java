package studies.palindromedetect;

import java.util.List;

public class PalindromeDetecter {

	public boolean isPalimdrome(List<?> list) {
		for (int i = 0, j = list.size() - 1; i < list.size(); i++, j--) {
			if (!list.get(i).equals(list.get(j))) {
				return false;
			}
			if (i >= j) {
				break;
			}
		}
		return true;
	}
}
