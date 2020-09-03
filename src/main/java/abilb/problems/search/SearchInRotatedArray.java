package abilb.problems.search;

public class SearchInRotatedArray {
  public static int find(int[] arr, int x) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (arr[left] <= arr[mid] && arr[left] <= x && x <= arr[mid])
        return SearchInRotatedArray.binarySearch(arr, x, left, mid);

      if (arr[mid] <= arr[right] && arr[mid] <= x && x <= arr[right])
        return SearchInRotatedArray.binarySearch(arr, x, mid, right);

      if (arr[mid] > arr[right])
        left = mid + 1;
      else
        right = mid - 1;
    }

    return -1;
  }

  public static int binarySearch(int[] arr, int x, int left, int right) {

    while (true) {
      int mid = left + (right - left) / 2;

      if (left > right)
        break;

      if (arr[mid] == x)
        return mid;

      if (arr[mid] < x)
        left = mid + 1;
      else
        right = mid - 1;
    }

    return -1;
  }
}
