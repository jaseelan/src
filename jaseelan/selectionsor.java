package jaseelan;

public class selectionsor {
	public static void main(String[] args) {

		int[] arr = { 43, 2, 34, 5, 78, 22, 75, 89, 432, 178, 944, 259 };
		selectionsort(arr);
		for (int x : arr) {
			System.out.print(" "+x);
		}
	}

	private static void selectionsort(int[] arr) {
		for (int a = 0; a < arr.length - 1; a++) {
			int min = a;
			for (int b = a + 1; b < arr.length; b++) {
				if (arr[min] < arr[b]) {
					min = b;
				}
			}
			
			int temp = arr[a];
			arr[a] = arr[min];
			arr[min] = temp;

		}
	}
}
