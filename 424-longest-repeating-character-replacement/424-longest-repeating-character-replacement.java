class Solution {
    public int characterReplacement(String s, int k) {
        int start=0, maxCnt=0, maxLen=0;
    
        HashMap<Character, Integer> hm= new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            hm.put(c, hm.getOrDefault(c,0)+1);
            maxCnt=Math.max(maxCnt, hm.get(c));
            
            if(i-start+1-maxCnt >k){
                hm.put(s.charAt(start),hm.get(s.charAt(start))-1 );
                start++;
            }
            maxLen= Math.max(maxLen, i-start+1);
        }
        return maxLen;
    }
}