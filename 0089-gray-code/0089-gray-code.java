import java.util.*;

class Solution {
    public List<Integer> grayCode(int n) {

        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int bit = 0; bit < n; bit++) {

            int mask = 1 << bit;

            for (int i = result.size() - 1; i >= 0; i--) {
                result.add(result.get(i) | mask);
            }
        }

        return result;
    }
}