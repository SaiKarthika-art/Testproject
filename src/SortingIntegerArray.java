
public class SortingIntegerArray {

	public static void main(String[] args) {
		int temp;
		int flag;
		int arr[] = { 7, 3, 1, 8, 5, 0, 9, 6, 2, 16, -1 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			flag = 0;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
