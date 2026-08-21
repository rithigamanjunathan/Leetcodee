import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count characters in s1
        for (char ch1 : s1.toCharArray()) {
            count1[ch1 - 'a']++;
        }

        // Create the first window in s2
        for (int i = 0; i < s1.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(count1, count2)) {
            return true;
        }

        // Sliding window
        int left = 0;

        for (int right = s1.length(); right < s2.length(); right++) {

            // Add new character
            count2[s2.charAt(right) - 'a']++;

            // Remove old character
            count2[s2.charAt(left) - 'a']--;

            // Move left
            left++;

            // Check current window
            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}