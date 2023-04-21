package jaseelan;

public class LinearSea {
	public static void main(String[] args) {
		int[] arrays = { 45, 67, 89, 32, 12, 93, 70, 11, 44, 77 };
		int index = LinearSearchs(arrays, 12);
		if (index != -1) {
			System.out.println("element found at index :" + index);
		} else {
			System.out.println("element not found");
		}
	}

	private static int LinearSearchs(int[] arrays, int values) {
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] == values) {
				return i;
			}
		}

		return -1;
	}
}
