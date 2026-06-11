class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> mapInChars = stringToMap(chars);
        int totalLength = 0;

        for(String str : words) {
            Map<Character, Integer> mapInString = stringToMap(str);
            boolean canForm = true;
            
           
            for(Map.Entry<Character, Integer> entryStr : mapInString.entrySet()) {
                char c = entryStr.getKey();
                int countInWord = entryStr.getValue();
                int countInChars = mapInChars.getOrDefault(c, 0);
                
                if(countInChars < countInWord) {
                    canForm = false;
                    break;
                }
            }
            
           
            if(canForm) {
                totalLength += str.length();
            }
        }
        
        return totalLength;
    }

    public Map<Character, Integer> stringToMap(String s) {
        Map<Character, Integer> mapa = new HashMap<>();
        char[] charsArray = s.toCharArray();

        int i = 0;
        while (i < charsArray.length) { 
            mapa.put(charsArray[i], mapa.getOrDefault(charsArray[i], 0) + 1);
            i++;
        }

        return mapa;
    }
}