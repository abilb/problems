package abilb.problems.array;

public class MaximumDifference {
  public int find(int[] arr) {
    int min = arr[0];
    int diff = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min)
        min = arr[i];
      else if (arr[i] > min && (arr[i] - min) > diff)
        diff = arr[i] - min;
    }

    return diff;
  }
}
