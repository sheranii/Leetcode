class Solution {
    public boolean three(int x) {
        if (x <= 0) return false;

        while (x % 3 == 0) {
            x = x / 3;
        }

        return x == 1;
    }

    public boolean isPowerOfThree(int n) {
        return three(n);
    }
}