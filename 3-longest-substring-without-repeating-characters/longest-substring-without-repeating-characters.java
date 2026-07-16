class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int max = 0;
        String temp = "";

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            while(temp.contains(ch + "")) {
                temp = temp.substring(1); 
                left++;
            }

            temp = temp + ch;
            max = Math.max(max, temp.length());
        }

        return max;
    }
}