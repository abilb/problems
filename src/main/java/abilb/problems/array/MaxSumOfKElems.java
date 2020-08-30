package abilb.problems.array;

public class MaxSumOfKElems {
  public int find(int[] arr, int k) {
    return optimal(arr, k);
  }

  // sliding window techniq
  // time complexity: O(N)
  private int optimal(int[] arr, int k) {
    int max = Integer.MIN_VALUE;
    int n = arr.length;
    int sum = 0;

    for (int j = 0; j < k; j++)
      sum += arr[j];

    max = Math.max(max, sum);

    for (int i = k; i < n; i++) {
      int b = i - k;
      sum -= arr[b];
      sum += arr[i];
      max = Math.max(max, sum);
    }
    return max;
  }

  // simple brute force
  // time complexity: O(N*K)
  private int naive(int[] arr, int k) {
    int max = Integer.MIN_VALUE;
    int n = arr.length;

    for (int i = 0; i <= n - k; i++) {
      int sum = 0;

      for (int j = i; j < (i + k); j++)
        sum += arr[j];

      max = Math.max(max, sum);
    }

    return max;
  }
}
