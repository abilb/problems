package abilb.problems.bit;

public class CountSetBits {

  public int brianAndKerninghamAlgorithm(int n) {
    if (n < 1)
      throw new IllegalArgumentException("Value must be greater than zero");

    int count = 0;

    while (n > 0) {
      n = (n & (n - 1));
      count++;
    }

    return count;
  }

  public int naiveSolution(int n) {

    if (n < 1)
      throw new IllegalArgumentException("Value must be greater than zero");

    int count = 0;

    while (n > 0) {
      if (n % 2 == 1)
        count++;
      n >>= 1;
    }

    return count;
  }

  public int naiveSolution2(int n) {
    if (n < 1)
      throw new IllegalArgumentException("Value must be greater than zero");

    int count = 0;

    while (n > 0) {
      count += (n & 1);
      n >>= 1;
    }

    return count;
  }

}
