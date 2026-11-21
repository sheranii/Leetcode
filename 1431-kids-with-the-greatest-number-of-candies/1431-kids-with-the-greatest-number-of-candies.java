class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list= new ArrayList<>();
        int smax=0;
        for(int i=0; i<candies.length; i++){
            smax= Math.max(smax, candies[i]);
        }
        for(int i=0; i<candies.length; i++){ 
            int max= candies[i]+extraCandies;
            if(max>=smax) list.add(true);
            else list.add(false);

        }
        return list;
    }
}