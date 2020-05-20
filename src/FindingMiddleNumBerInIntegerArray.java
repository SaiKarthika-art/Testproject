import java.util.Arrays;

public class FindingMiddleNumBerInIntegerArray {
	public static int[] midArray(int[] arr) {
		int extra = arr.length % 2 == 0 ? 1 : 0;

		int[] a = new int[1 + extra];

		int startIndex = arr.length / 2 - extra;
		int endIndex = arr.length / 2;

		for (int i = 0; i <= endIndex - startIndex; i++) {
			a[i] = arr[startIndex + i];
		}

		return a;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4 };
		int[] b = new int[] { 1, 2, 3 };
		int[] c = new int[] { 1, 2 };
		int[] d = new int[] { 1 };
		int[] e = new int[] { 1,2,3,4,5,6,7,8,9,10,11,12 };

		System.out.println(Arrays.toString(midArray(a)));
		System.out.println(Arrays.toString(midArray(b)));
		System.out.println(Arrays.toString(midArray(c)));
		System.out.println(Arrays.toString(midArray(d)));
		System.out.println(Arrays.toString(midArray(e)));
	}

}
