package jaseelan;

public class InsertionSortsss {
	public static void main(String[] args) {
		int[] num = { 12, 32, 1, 45, 6754, 212, 450, 6754, };

		intsertionsort(num);
		for (int i : num) {
			System.out.print(" " + i);
		}

	}

	private static void intsertionsort(int[] num) {
		for (int x = 1; x < num.length; x++) {
			int temp = num[x];
			int j = x - 1;
			while (j >= 0 && num[j] > temp) {
				num[j + 1] = num[j];
				j--;
			}
			num[j + 1] = temp;

		}
	}
}
