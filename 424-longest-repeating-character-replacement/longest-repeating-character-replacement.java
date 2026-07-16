class Solution {
    public int characterReplacement(String s, int k) {

        int[] count = new int[26];
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            count[ch - 'A']++;

            if(count[ch - 'A'] > maxCount) {
                maxCount = count[ch - 'A'];
            }

            while((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            if(right - left + 1 > maxLength) {
                maxLength = right - left + 1;
            }
        }

        return maxLength;
    }
}