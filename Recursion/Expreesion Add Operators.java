import java.util.*;

class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        backtrack(num, target, 0, 0, 0, "", res);
        return res;
    }

    private void backtrack(String num, int target, int index, long value, long prev, String path, List<String> res) {
        if (index == num.length()) {
            if (value == target) res.add(path);
            return;
        }

        for (int i = index; i < num.length(); i++) {
            if (i != index && num.charAt(index) == '0') break;

            long curr = Long.parseLong(num.substring(index, i + 1));

            if (index == 0) {
                backtrack(num, target, i + 1, curr, curr, path + curr, res);
            } else {
                backtrack(num, target, i + 1, value + curr, curr, path + "+" + curr, res);
                backtrack(num, target, i + 1, value - curr, -curr, path + "-" + curr, res);
                backtrack(num, target, i + 1, value - prev + prev * curr, prev * curr, path + "*" + curr, res);
            }
        }
    }
}
