class Solution {
    private int[] buildLPSLength(String pattern) {
        int[] lpsLength = new int[pattern.length()];
        int len = 0;
        int j = 1;
        
        while (j < pattern.length()) {
            if (pattern.charAt(j) == pattern.charAt(len)) {
                len++;
                lpsLength[j] = len;
                j++;
            } else {
                if (len > 0) {
                    len = lpsLength[len - 1];
                } else {
                    lpsLength[j] = 0;
                    j++;
                }
            }
        }
        
        return lpsLength;
    }
    
    private int kmp(String text, String pattern) {
        int[] lpsLength = buildLPSLength(pattern);
        int i = 0;
        int j = 0;
        
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                if (j > 0) {
                    j = lpsLength[j - 1];
                } else {
                    i++;
                }
            }
            
            if (j == pattern.length()) {
                return i - j;
            }
        }
        return -1;
    }
    
    public int repeatedStringMatch(String a, String b) {
        StringBuilder aRepeated = new StringBuilder(a);
        while (aRepeated.length() < a.length() + b.length()) {
            aRepeated.append(a);
        }
        
        int startIdx = kmp(aRepeated.toString(), b);
        if (startIdx == -1) {
            return -1;
        }
        
        return (int) Math.ceil((double)(startIdx + b.length()) / a.length());
    }
}