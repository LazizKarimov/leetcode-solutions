class Solution {
    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder result = new StringBuilder();
        
        while (!map.isEmpty()) {
            char maxChar = ' ';
            int maxCount = 0;
            
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxChar = entry.getKey();
                }
            }
            
            for (int i = 0; i < maxCount; i++) {
                result.append(maxChar);
            }
            
            map.remove(maxChar);
        }
        
        return result.toString();
    }
}