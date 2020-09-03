package abilb.problems.search;

public class Contains {
  public static boolean find(int[] a, int x) {
    int left = 0;
    int right = a.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (a[mid] == x)
        return true;

      if (a[mid] > x)
        right = mid - 1;
      else
        left = mid + 1;
    }

    return false;
  }
}
