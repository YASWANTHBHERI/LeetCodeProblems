class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder orgStr = new StringBuilder();
        checkPalindrome(s, orgStr, sb, 0);
        return sb.toString().equals(orgStr.toString());
    }

    public void checkPalindrome(String s, StringBuilder orgStr, StringBuilder sb, int i) {
        if (i >= s.length())
            return;
        if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
            orgStr.append(Character.toLowerCase(s.charAt(i)));
        }    
        checkPalindrome(s, orgStr, sb, i + 1);
        if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
            sb.append(Character.toLowerCase(s.charAt(i)));
        }

    }
}