class Solution {
   public static boolean isSubsequence(String s, String t) {
        String ans="";
        return isSub(s, t, new StringBuilder(ans), 0);
    }
 public static boolean isSub(String s,String t,StringBuilder ans,int i){
        if(s.length()==ans.length()){
            return true;
            }
            if(i==t.length())
            return false;
            if(s.charAt(ans.length())==t.charAt(i))
                         ans.append(t.charAt(i));
            return isSub(s, t, ans, i+1);
            
   }
}