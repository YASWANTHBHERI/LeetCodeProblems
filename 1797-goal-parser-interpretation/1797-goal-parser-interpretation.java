class Solution {
    public String interpret(String command) {
        String ans = command.replace("()","o");
        ans = ans.replace("(al)","al");
        return ans;
    }
}