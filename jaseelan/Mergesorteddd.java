package jaseelan;

public class Mergesorteddd {
    public static void main(String[] args) {
        int[] nums = { 12, 13, 11, 107, 3, 7, 8, 112, 90, 78, 93, 29 };
        mergesorted(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void mergesorted(int[] nums) {
        int length = nums.length;
        if (length <= 1)
            return;
        int middle = length / 2;
        int[] leftarr = new int[middle];
        int[] right = new int[length - middle];
        int i = 0; // left
        int j = 0; // right
        for (; i < middle; i++) {
            leftarr[i] = nums[i];
        }
        for (; i < length; i++) {
            right[j] = nums[i];
            j++;
        }
        mergesorted(leftarr);
        mergesorted(right);
        merge(leftarr, right, nums);
    }

    private static void merge(int[] leftarr, int right[], int nums[]) {
        int leftSize = leftarr.length;
        int rightSize = right.length;
        int i = 0, l = 0, r = 0;
        while (l < leftSize && r < rightSize) {
            if (leftarr[l] < right[r]) {
                nums[i] = leftarr[l];
                i++;
                l++;
            } else {
                nums[i] = right[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            nums[i] = leftarr[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            nums[i] = right[r];
            i++;
            r++;
        }
    }
}
