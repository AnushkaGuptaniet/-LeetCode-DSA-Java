import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        
        String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };
        
        List<String> res = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), res, map);
        return res;
    }
    
    private void backtrack(String digits, int index, StringBuilder curr, List<String> res, String[] map) {
        if (index == digits.length()) {
            res.add(curr.toString());
            return;
        }
        
        String letters = map[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            curr.append(c);
            backtrack(digits, index + 1, curr, res, map);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
