class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();

        int i = 0;

        while (i < chars.length) {
            int j = 0;
            boolean isUnique = true;
            
            while (j < chars.length) {
                if (i != j && chars[i] == chars[j]) {
                    isUnique = false;
                    break;
                }
                j++;
            }
            
            if (isUnique) {
                return i;
            }
            i++;
        }
        
        return -1;
    }
}