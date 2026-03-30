import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] arr, int target, int index, List<Integer> list, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        if (index == arr.length) return;

        if (arr[index] <= target) {
            list.add(arr[index]);
            backtrack(arr, target - arr[index], index, list, res);
            list.remove(list.size() - 1);
        }

        backtrack(arr, target, index + 1, list, res);
    }
}
