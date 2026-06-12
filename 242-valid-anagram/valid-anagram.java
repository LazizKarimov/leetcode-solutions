class Solution {
    public boolean isAnagram(String s, String t) {
        // int i = 0;
        // int sumS = 0;
        // int sumT = 0;

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        // while ((chars.length == chart.length) && i < chars.length - 1) {
        //     sumS += (int) chars[i];
        //     sumT += (int) chart[i];

        //     i++;
        // }

        Arrays.sort(chars);
        Arrays.sort(chart);


        return Arrays.equals(chars, chart);
    }
}