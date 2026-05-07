class Solution {

    public String longestPalindrome(String s) {

        return fun(s);
    }

    public static String fun(String s) {

        int len = s.length();

        String max1 = "";

        // odd palindrome
        for (int i = 0; i < len; i++) {

            int j = 0;

            while ((i - j) >= 0 &&
                   (i + j) < len &&
                   s.charAt(i - j) == s.charAt(i + j)) {

                j++;
            }

            String q = s.substring(i - j + 1, i + j);

            if (q.length() > max1.length()) {
                max1 = q;
            }
        }

        // even palindrome
        for (int i = 0; i < len - 1; i++) {

            int j = 0;

            while ((i - j) >= 0 &&
                   (i + j + 1) < len &&
                   s.charAt(i - j) == s.charAt(i + j + 1)) {

                j++;
            }

            String q = s.substring(i - j + 1, i + j + 1);

            if (q.length() > max1.length()) {
                max1 = q;
            }
        }

        return max1;
    }
}
