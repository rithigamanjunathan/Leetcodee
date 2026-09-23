class Solution {

    public int maxConsecutiveAnswers(String answerKey, int k) {

        int t = answers(answerKey, k, 'T');
        int f = answers(answerKey, k, 'F');

        return Math.max(t, f);
    }

    public int answers(String a, int k, char ans) {

        int left = 0, count = 0, max = 0;

        for(int i = 0; i < a.length(); i++) {

            if(a.charAt(i) != ans)
                count++;

            while(count > k) {

                if(a.charAt(left) != ans)
                    count--;

                left++;
            }

            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}





    