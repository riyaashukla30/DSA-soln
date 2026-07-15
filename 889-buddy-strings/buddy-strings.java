class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                a.append(s.charAt(i));
                b.append(goal.charAt(i));
            }
        }

        if (a.length() == 0) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
                if (freq[c - 'a'] > 1) return true;
            }
            return false;
        }

        if (a.length() == 2) {
            return a.charAt(0) == b.charAt(1) &&
                   a.charAt(1) == b.charAt(0);
        }

        return false;
    }
}