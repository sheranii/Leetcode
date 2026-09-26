import java.util.*;
class Solution {
    public boolean solve(int n, List<Integer> ans, Set<Integer> used) {
        if (ans.size() == (1 << n)) {
            return Integer.bitCount(ans.get(0) ^ ans.get(ans.size() - 1)) == 1;
        }
        int current = ans.get(ans.size() - 1);
        //flipping
        for (int bit = 0; bit < n; bit++) {
            int next = current ^ (1 << bit);

            if (!used.contains(next)) {

                used.add(next);
                ans.add(next);

                if (solve(n, ans, used))
                    return true;
                ans.remove(ans.size() - 1);
                used.remove(next);
            }
        }

        return false;
    }

    public List<Integer> grayCode(int n) {

        List<Integer> ans = new ArrayList<>();
        Set<Integer> used = new HashSet<>();

        ans.add(0);
        used.add(0);

        solve(n, ans, used);

        return ans;
    }
}