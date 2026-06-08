class Solution {
    public boolean isPalindrome(String s) {
        if(" ".equals(s)){
            return true;
        }

        int i = 0;
        char [] charArrayS = s.toCharArray();
        String resultStr = "";
        while (i < charArrayS.length) { 
            if (Character.isDigit(charArrayS[i])){
                resultStr += charArrayS[i];
            }
            if ('a' <= charArrayS[i] && charArrayS[i] <= 'z') {
                resultStr += charArrayS[i];
            }
            if ('A' <= charArrayS[i] && charArrayS[i] <= 'Z'){
                resultStr += Character.toLowerCase(charArrayS[i]);
            }
            i++;
        }

        char [] isPal = resultStr.toCharArray();
        int j = 0;
        int k = isPal.length - 1;

        while (j < k) {
            if (isPal[j] != isPal[k]){
                return false;
            }
            j++;
            k--;
        }
  
        return true;


    }
}