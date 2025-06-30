package basicpractice;

public class MaxConsecutiveOnes {
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;  // To store the maximum count of 1s
        int currentCount = 0;  // To count current streak of 1s

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

	public static void main(String[] args) {
		
		int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
		
		//int[] arr = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };

        // Print the result
        System.out.println("Maximum consecutive 1s: " + findMaxConsecutiveOnes(arr));

	}

}
