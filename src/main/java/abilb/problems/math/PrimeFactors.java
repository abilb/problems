package abilb.problems.math;

import java.util.*;
import abilb.problems.abstraction.Prime;

public class PrimeFactors {
  Prime _prime;

  public PrimeFactors() {
    _prime = new PrimeImpl();
  }

  public List<Integer> solveOptimal(int n) {
    if (n < 1 || n > 1000000)
      throw new IllegalArgumentException("Value must be greate than zero or less than 10000");

    List<Integer> list = new ArrayList<Integer>();

    if (n == 2 || n == 3)
      return list;

    while (n % 2 == 0) {
      list.add(2);
      n /= 2;
    }

    while (n % 3 == 0) {
      list.add(3);
      n /= 3;
    }

    for (int i = 5; i * i <= n; i = i + 6) {
      while (n % i == 0) {
        list.add(i);
        n = n / i;
      }
      while (n % (i + 2) == 0) {
        list.add(i + 2);
        n = n / (i + 2);
      }
    }

    if (n > 1 && list.size() > 0)
      list.add(n);

    return list;
  }

  public List<Integer> solveNaive(int n) {
    if (n < 1 || n > 1000000)
      throw new IllegalArgumentException("Value must be greater than zero and less than 10000");

    List<Integer> factors = new ArrayList<Integer>();

    for (int i = 2; i <= n / 2; i++)
      if (_prime.check(i)) {
        int x = i;
        while (n % x == 0) {
          factors.add(i);
          x = x * i;
        }
      }

    return factors;
  }

}
