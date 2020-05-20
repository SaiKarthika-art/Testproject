
public class ReversingStringByPreservingPositionOfSpaces {

	public static void main(String[] args) {
		String input = "I am a very good teacher";
		char[] inputarr = input.toCharArray();
		char[] result = new char[inputarr.length];
		for (int i = 0; i < inputarr.length; i++) {
			if (inputarr[i] == ' ') {
				result[i] = ' ';
			}
		}
		int j = result.length - 1;
		for (int i = 0; i < inputarr.length; i++) {
			if (inputarr[i] != ' ') {
				if (result[j] == ' ') {
					j--;
				}
				result[j] = inputarr[i];
				j--;
			}
		}
		System.out.println(input + "---->" + String.valueOf(result));

	}
}
