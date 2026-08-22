class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int n=nums.length;
        // int count=0;
        // int cd=0;
        // for(int i=0; i<nums.length; i++){
        //     if(count==0){
        //         cd=nums[i];
        //     }
        //     else if(nums[i]==cd){
        //         count++;
        //     }
        //     else{
        //         count--;
        //     }
        // }
        // int c=0;
        // for(int j=0; j<n; j++){
        //     if(nums[j]==cd){
        //         c++;
        //     }
        // }
        // return cd;

HashMap<Integer, Integer> map= new HashMap<>();
List<Integer> result = new ArrayList<>();
for(int num: nums){
    map.put(num, map.getOrDefault(num,0)+1);

}
for(int key: map.keySet()){
    if(map.get(key)>nums.length/3){
        result.add(key);
    }
}
return result;
}
}