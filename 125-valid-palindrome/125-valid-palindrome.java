class Solution {
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        
        while(i<j){
            while(i<j && !(s.charAt(i)>='a' && s.charAt(i)<='z') 
                  && !(s.charAt(i)>='A' && s.charAt(i)<='Z') 
                  && !(s.charAt(i)>='0' && s.charAt(i)<='9')) i++;
            while(i<j && !(s.charAt(j)>='a' && s.charAt(j)<='z') 
                  && !(s.charAt(j)>='A' && s.charAt(j)<='Z') 
                  && !(s.charAt(j)>='0' && s.charAt(j)<='9')) j--;
            if(Character.toLowerCase(s.charAt(i++))!=
               Character.toLowerCase(s.charAt(j--)))
                return false;
        } 
        return true;
    }
}