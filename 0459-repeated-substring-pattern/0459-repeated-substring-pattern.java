class Solution {
    public boolean repeatedSubstringPattern(String s) 
    {
     for(int len = 1; len <= s.length() / 2; len++) {

            if(s.length() % len != 0)
                continue;

            String pattern = s.substring(0, len);

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < s.length() / len; i++) {
                sb.append(pattern);
            }

            if(sb.toString().equals(s))
                return true;
        }

        return false;    
    }
}