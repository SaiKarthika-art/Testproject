import java.util.ArrayList;
import java.util.Iterator;

public class FinDuplicatesInTwoArrays {

	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int arr1[] = { 10, 12, 14, 16, 18,20,22,25 };
		int arr2[] = { 10, 15, 14, 16, 18,20,21 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					list.add(arr1[i]);
				}
			}
		}
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
	}
}