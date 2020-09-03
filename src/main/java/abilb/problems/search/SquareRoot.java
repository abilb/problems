package abilb.problems.search;

public class SquareRoot {

  public static int binarySearch(int X) {
    if (X == 0 || X == 1)
      return X;

    int left = 1;
    int right = X;
    int root = 0;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (mid * mid == X)
        return mid;

      if (mid * mid > X)
        right = mid - 1;
      else {
        left = mid + 1;

        root = mid;
      }
    }

    return root;
  }

  public static int bruteForce(int X) {
    if (X == 0 || X == 1)
      return X;

    int root = 1;

    while (root <= X) {
      int sq = root * root;

      if (sq == X)
        return root;

      if (sq > X)
        break;

      root++;
    }

    return root - 1;
  }
}
