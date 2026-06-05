class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList();
        while (n >= 1) {
        if ((n % 3 == 0) && (n % 5 == 0)){
            answer.add("FizzBuzz");
        } else if ((n % 3 == 0)){
            answer.add("Fizz");
        } else if ((n % 5 == 0)){
            answer.add("Buzz");
        } else {
           answer.add(String.valueOf(n)); 
        }
        n--;    
      }  
      Collections.reverse(answer);
      return answer;
    }
}