class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        
        HashMap<Character, Integer> patternMap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            patternMap.put(t.charAt(i),patternMap.getOrDefault(t.charAt(i),0) +1 );
        }
        
        int windowStart=0, minWinLen=Integer.MAX_VALUE, minWinStart=-1;
        HashMap<Character, Integer> windowMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            windowMap.put(s.charAt(i),windowMap.getOrDefault(s.charAt(i),0) +1 );
            
            while(containsPattern(windowMap,patternMap)){
                if( i-windowStart+1 < minWinLen){
                minWinLen = i-windowStart+1;
                minWinStart= windowStart;
                }    
                windowMap.put(s.charAt(windowStart),windowMap.get(s.charAt(windowStart)) -1 );
                if(windowMap.get(s.charAt(windowStart))==0)                                                   windowMap.remove(s.charAt(windowStart));
                
                windowStart++;
            }
        }
        return ((minWinStart!=-1)?
            s.substring(minWinStart, minWinStart+minWinLen) : "");
        
    }
    
    public boolean containsPattern(HashMap<Character, Integer> sMap, HashMap<Character, Integer> pMap){
        for(Map.Entry<Character, Integer> e : pMap.entrySet()){
            Character key=e.getKey();
            if(!sMap.containsKey(key)) return false;
            if(sMap.get(key)<e.getValue()) return false;
        }
        return true;
    }
}