public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[count++] = nums1[i];
                    nums2[j] = -1;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);
        printArray(result);

    }
}
