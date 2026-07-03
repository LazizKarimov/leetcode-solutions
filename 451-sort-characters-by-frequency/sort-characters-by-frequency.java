class Solution {
    public String frequencySort(String s) {
        return new StringBuilder(
            s.chars()
             .boxed()
             .collect(Collectors.groupingBy(
                 Function.identity(), 
                 Collectors.counting()
             ))
             .entrySet()
             .stream()
             .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
             .map(e -> String.valueOf((char) e.getKey().intValue())
                 .repeat(e.getValue().intValue()))
             .collect(Collectors.joining())
        ).toString();
    }
}