package abilb.problems.math;

public class TrailingZeros {
  public int count(int n) {

    if (n < 0)
      throw new IllegalArgumentException("Value must be greater than zero");

    int sumOfZeros = 0;
    int i = 5;

    while (i < n) {
      sumOfZeros += n / i;
      i *= 5;
    }

    return sumOfZeros;
  }
}
