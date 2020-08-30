package abilb.problems.array;

import java.util.Arrays;

public class PrefixSumArray {
  public int find(int[] arr, int b, int e) {
    return calculate(arr, b, e);
  }

  private int calculate(int[] arr, int b, int e) {
    int n = arr.length;
    int[] sumTable = new int[n];
    sumTable[0] = arr[0];

    for (int i = 1; i < n; i++)
      sumTable[i] += arr[i] + sumTable[i - 1];

    if (b == 0)
      return sumTable[e];

    return sumTable[e] - sumTable[b - 1];
  }
}
