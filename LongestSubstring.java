class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int maxVal = 0;
        int left=0;
        for(int right=0;right<s.length();right++) {
            char ch = s.charAt(right);
            while(hs.contains(ch)) {
                hs.remove(s.charAt(left));
                ++left;
            }
            hs.add(ch);
            
            maxVal = Math.max(maxVal, right-left+1);
        }
        
        return maxVal;
    }
}
