import java.util.HashMap;
import java.util.Set;

public class NumberOfOccurencesOfALetterInString {

	static void occurences(String str) {

		HashMap<Character, Integer> charmap = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c) + 1);
			} else {
				charmap.put(c, 1);
			}
		}

		Set<Character> charsInString = charmap.keySet();

		System.out.println("Duplicate Characters In " + str);

		// Iterating through Set 'charsInString'

		for (Character car : charsInString) {
			if (charmap.get(car) > 1) {
				// If any char has a count of more than 1, printing it's count

				System.out.println(car + " : " + charmap.get(car));
			}
		}
	}

	public static void main(String[] args) {

		occurences("Java is a programming language");
	}

}
