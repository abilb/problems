package abilb.problems.math;

public class LCM {
  public int calculate(int num1, int num2) {
    if (num1 == 0 || num2 == 0)
      throw new IllegalArgumentException("Values must be non-zero");

    return (num1 * num2) / calculateGCD(num1, num2);
  }

  private int calculateGCD(int num1, int num2) {
    if (num2 == 0)
      return num1;

    return calculateGCD(num2, num1 % num2);
  }
}
