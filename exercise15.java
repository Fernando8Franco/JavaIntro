package javaintroexercises;

public class exercise15 {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
