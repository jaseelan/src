package jaseelan;

public class interpolationSea {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 12, 15, 17, 19 };
		int index = interpolationSear(arr, 190);
		
		if(index!=-1) {
			System.out.println("Element found at index:"+index);
		}else {
			System.out.println("Element not found");
		}

	}

	private static int interpolationSear(int[] arr, int value) {
		int high = arr.length - 1;
		int low = 0;
		while (value >= arr[low] && value <= arr[high] && low <= high) {
			int probe = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);
			System.out.println("probe" + probe);
			if(arr[probe]==value) {
				return probe;
			}else if(arr[probe]<value) {
				low=probe+1;
			}else {
				high=probe-1;
			}
		}
		return -1;
	}
}
