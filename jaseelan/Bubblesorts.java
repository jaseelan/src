package jaseelan;

public class Bubblesorts {
	public static void main(String[] args) {
		int[] nums = { 544, 67, 32, 12, 77, 55, 90, 32, 16, 18, 59 };
		
		bubbleSort(nums);
		for (int x : nums) {
			System.out.print(" "+x);
		}
	}

	private static void bubbleSort(int nums[]) {
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
				}
				
			}
		}
	}
}
