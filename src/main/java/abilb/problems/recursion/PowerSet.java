package abilb.problems.recursion;

import java.util.*;

public class PowerSet {

  public List<List<Integer>> generate(int[] arr) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> list = new ArrayList<Integer>();
    recursive(arr, result, list, 0);
    return result;
  }

  private void recursive(int[] arr, List<List<Integer>> result, List<Integer> list, int level) {

    if (level == arr.length) {
      result.add(new ArrayList<Integer>(list));
      return;
    }

    list.add(arr[level]);
    recursive(arr, result, list, level + 1);

    list.remove(list.size() - 1);
    recursive(arr, result, list, level + 1);
  }
}
