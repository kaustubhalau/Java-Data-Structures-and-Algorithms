public class mergeSortedArray {

    public static void mergeSorted(int[] nums1, int[] nums2, int m, int n) {
        int a = m - 1;
        int b = n - 1;
        int i = m + n - 1;

        while (b >= 0) {
            if (nums1[a] > nums2[b]) {
                nums1[i] = nums1[a];
                a--;
                i--;
            } else if (nums2[b] > nums1[a]) {
                nums1[i] = nums2[b];
                b--;
                i--;
            } else {
                nums1[i] = nums2[b];
                i--;
                b--;
            }

        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        mergeSorted(nums1, nums2, m, n);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

}
