class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int[] bus = new int[1001];
        for (int i = 0; i < trips.length; i++) {
            int people = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];

            bus[from] += people;
            bus[to] -= people;
        }

        int sum = 0;

        for (int i = 0; i <= 1000; i++) {
            sum += bus[i];

            if (sum > capacity) {
                return false;
            }
        }

        return true;
    }
}