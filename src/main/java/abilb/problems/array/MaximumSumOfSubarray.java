package abilb.problems.array;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumOfSubarray {
  public int find(int[] arr) {
    return optimal(arr);
  }

  // time complexity O(n)
  private int optimal(int[] arr) {
    int n = arr.length;
    int prevSum = arr[0];
    int maxSum = prevSum;

    for (int i = 1; i < n; i++) {
      int currSum = prevSum + arr[i];
      prevSum = Math.max(currSum, arr[i]);
      maxSum = Math.max(maxSum, prevSum);
    }

    return maxSum;
  }

  // time complexity O(n^2)
  private int naive(int[] arr) {
    int n = arr.length;
    int maxSum = Integer.MIN_VALUE;
    int localSum = 0;

    for (int i = 0; i < n; i++) {
      localSum = 0;
      for (int j = i; j < n; j++) {
        localSum += arr[j];
        maxSum = Math.max(maxSum, localSum);
      }
    }

    return maxSum;
  }
}
