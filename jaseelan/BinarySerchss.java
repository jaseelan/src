package jaseelan;

import java.util.Arrays;

public class BinarySerchss {
	public static void main(String[] args) {
		int[] arr = { 12, 89, 90, 98, 100, 210, 230, 231, 400 };
		int target = 90;
		int result = Arrays.binarySearch(arr, target);
		if (result < 0) {
			System.out.println("Target not found");
		} else {
			System.out.println("Target found at index:" + result);
		}
	}
}
