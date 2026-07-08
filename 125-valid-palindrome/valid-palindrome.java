class Solution {
    public boolean isPalindrome(String s) {
        
        char [] stringToCharArray = s.toCharArray();

        int i = 0;
        int j = stringToCharArray.length - 1;
        while (i < j) {

            if (stringToCharArray[i] >= 'a' && stringToCharArray[i] <= 'z' || 
                stringToCharArray[i] >= 'A' && stringToCharArray[i] <= 'Z'||
                stringToCharArray[i] >= '0' && stringToCharArray[i] <= '9') {

                    if (stringToCharArray[j] >= 'a' && stringToCharArray[j] <= 'z' || 
                        stringToCharArray[j] >= 'A' && stringToCharArray[j] <= 'Z'||
                        stringToCharArray[j] >= '0' && stringToCharArray[j] <= '9') {
                        
                            char left = stringToCharArray[i];
                            char right = stringToCharArray[j];

                            if (left >= 'A' && left <= 'Z') {
                                left = (char)(left + 32);
                                }
                            if (right >= 'A' && right <= 'Z') {
                                right = (char)(right + 32);
                                }

                            if (left == right) {
                                i++;
                                j--;
                                } else {
                                    return false;
                                }
                    } else {
                        j--;
                    }

                } else {
                i++; 
            }
            
        }
        return true;
    }
}