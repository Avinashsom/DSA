import java.util.Arrays;

public class Merge {
    public static int[] Mergea(int[] nums1, int m, int[] nums2, int n) {
        int rr = m + n;
        int cc = 0;
        int[] merge = new int[rr];

        for (int i = 0; i < m; i++) {
            merge[i] = nums1[i];
        }
        for (int i = m; i < rr; i++) {
            merge[i] = nums2[cc];
            cc = cc + 1;
        }

        Arrays.sort(merge);
        return merge; // ✅ fixed
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;

        int[] mergedArray = Mergea(nums1, m, nums2, n); // ✅ fixed order

        System.out.println("Merged array:");
        System.out.println(Arrays.toString(mergedArray)); // ✅ print array properly
    }
}
