package abilb.problems.array;

public class MaximumConsecutiveOnes {
  public int find(int[] arr) {
    return naive(arr);
  }

  private int optimal(int[] arr) {
    int max1 = 0;
    int max2 = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1)
        max2++;
      else
        max2 = 0;

      max1 = Math.max(max1, max2);
    }

    return max1;
  }

  private int naive(int[] arr) {
    int max = 0;

    for (int i = 0; i < arr.length; i++)
      if (arr[i] == 1) {
        int count = 0;
        int j = i;
        while (j < arr.length && arr[j] == 1) {
          count++;
          j++;
        }

        max = Math.max(max, count);
      }

    return max;
  }
}
