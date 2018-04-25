package array;

public class CheckValueinArray {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 22, 8, 5 };
		int k = 19;
		System.out.println(containValue(arr, k) ? "value available" : "value not available");

	}

	private static boolean containValue(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k)
				return true;
		}
		return false;
	}
	

}
