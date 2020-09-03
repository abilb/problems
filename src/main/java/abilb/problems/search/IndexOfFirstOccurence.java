package abilb.problems.search;

public class IndexOfFirstOccurence {

  public static int iterative(int[] arr, int X) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (X == arr[mid]) {
        if (mid == 0 || arr[mid - 1] != X)
          return mid;

        right = mid - 1;
      } else if (X < arr[mid])
        right = mid - 1;
      else
        left = mid + 1;
    }

    return -1;
  }

  // time complexity O(Log(N))
  public static int recursive(int[] arr, int X, int left, int right) {
    if (left > right)
      return -1;

    int mid = left + (right - left) / 2;

    if (X == arr[mid]) {
      if (mid == 0 || arr[mid - 1] != X)
        return mid;

      return IndexOfFirstOccurence.recursive(arr, X, left, mid - 1);
    } else if (X > arr[mid])
      return IndexOfFirstOccurence.recursive(arr, X, mid + 1, right);
    else
      return IndexOfFirstOccurence.recursive(arr, X, left, mid - 1);
  }

  // time complexity O(N)
  public static int bruteForce(int arr[], int X) {
    for (int i = 0; i < arr.length; i++)
      if (X == arr[i])
        return i;

    return -1;
  }
}
