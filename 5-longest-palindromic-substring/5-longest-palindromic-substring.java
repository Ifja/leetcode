class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(); // calculcharAting size of string
        if (n < 2)
            return s; // if string is empty then size will be 0.
                  // if n==1 then, answer will be 1(single
                  // character will always palindrome)
 
        int maxLength = 1,start=0;
        int low, high;
        for (int i = 0; i < n; i++) {
            low = i - 1;
            high = i + 1;
            while ( high < n && s.charAt(high) == s.charAt(i)) //increment 'high'                                  
                high++;
       
            while ( low >= 0 && s.charAt(low) == s.charAt(i)) // decrement 'low'                   
                low--;
       
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high) ){
                  low--;
                high++;
        }
 
        int length = high - low - 1;
        if (maxLength < length){
            maxLength = length;
            start=low+1;
        }
    }   
    return s.substring(start, start + maxLength );
    }
}