class Solution {
    public int lengthOfLongestSubstring(String s) {
        int li=-1;
        HashMap<Character, Integer> hm=new HashMap<>();
        int maxlen=0;
        
        for(int i=0;i<s.length();i++){
            Character c= s.charAt(i);
            if(hm.containsKey(c) && hm.get(c) >li){
                    li=hm.get(c);
            }
            hm.put(c,i);
            maxlen=Math.max(maxlen,i-li);
        }
        
       return maxlen; 
        
    }
}