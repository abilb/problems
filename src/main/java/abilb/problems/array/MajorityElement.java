package abilb.problems.array;

import java.util.*;

public class MajorityElement {
  public int find(int[] arr) {
    return optimal(arr);
  }

  // boyer moore algorithm
  private int optimal(int[] arr) {
    int n = arr.length;

    // find candidate
    int candidate = 0;
    int count = 1;

    for (int i = 1; i < n; i++) {
      if (arr[candidate] == arr[i])
        count++;
      else
        count--;

      if (count == 0) {
        candidate = i;
        count = 1;
      }
    }

    // check if the candidate is actually a majority
    count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[candidate] == arr[i])
        count++;
    }

    if (count > n / 2)
      return candidate;

    return -1;
  }

  // time complexity O(n)
  // space complexity O(n)
  private int naive2(int[] arr) {
    Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    int n = arr.length;

    // list[0] - index
    // list[1] - count
    for (int i = 0; i < n; i++) {
      if (map.containsKey(arr[i])) {
        int current = map.get(arr[i]).get(1);
        map.get(arr[i]).set(1, current + 1);
      } else {
        List<Integer> list = new ArrayList<Integer>();
        list.add(i);
        list.add(1);
        map.put(arr[i], list);
      }
    }

    int max = 0;
    int index = -1;

    for (List<Integer> list : map.values()) {
      if (list.get(1) > max) {
        max = list.get(1);
        index = list.get(0);
      }
    }

    return max > n / 2 ? index : -1;
  }

  // time complexity O(n^2)
  // space complexity O(1)
  private int naive1(int[] arr) {
    int max = 0;
    int index = -1;
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      int count = 0;

      for (int j = 0; j < n; j++)
        if (arr[j] == arr[i])
          count++;

      if (count > n / 2)
        return i;
    }

    return -1;
  }
}
