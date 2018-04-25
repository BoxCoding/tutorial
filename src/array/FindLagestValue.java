package array;

public class FindLagestValue {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 22, 8, 5 };
		System.out.println(largestValue(arr));

	}

	private static int largestValue(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > temp)
				temp = arr[i];
		}
		return temp;

	}

}
