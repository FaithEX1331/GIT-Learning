public class Test2 {

    public static int[] findDuplicates(int[] nums) {
        int[] duplicates = new int[nums.length];
        int duplicateCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                duplicates[duplicateCount++] = index + 1;
            } else {
                nums[index] = -nums[index];
            }
        }

        int[] result = new int[duplicateCount];
        for (int i = 0; i < duplicateCount; i++) {
            result[i] = duplicates[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] duplicates = findDuplicates(nums);
        System.out.print("Duplicates: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}