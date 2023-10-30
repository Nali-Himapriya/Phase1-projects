package PracticeProjects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {
public static List<Integer> findLongestIncreasingSubsequence(int[] nums) {
	        int n = nums.length;
	        int[] dp = new int[n];
	        int[] prev = new int[n];
	        Arrays.fill(prev, -1);

	        int maxLength = 1;
	        int endIndex = 0;

	        for (int i = 0; i < n; i++) {
	            dp[i] = 1;
	            for (int j = 0; j < i; j++) {
	                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
	                    dp[i] = dp[j] + 1;
	                    prev[i] = j;
	                }
	            }
	            if (dp[i] > maxLength) {
	                maxLength = dp[i];
	                endIndex = i;
	            }
	        }

	        List<Integer> longestSubsequence = new ArrayList<>();
	        while (endIndex != -1) {
	            longestSubsequence.add(nums[endIndex]);
	            endIndex = prev[endIndex];
	        }

	        return reverseList(longestSubsequence);
	    }

	    public static List<Integer> reverseList(List<Integer> list) {
	        List<Integer> reversed = new ArrayList<>();
	        for (int i = list.size() - 1; i >= 0; i--) {
	            reversed.add(list.get(i));
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
	        List<Integer> longestIncreasingSubsequence = findLongestIncreasingSubsequence(nums);
	        System.out.println("Longest Increasing Subsequence: " + longestIncreasingSubsequence);
	    }
	}



