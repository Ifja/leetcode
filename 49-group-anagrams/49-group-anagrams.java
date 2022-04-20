class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        
        for(int i=0; i<strs.length;i++){
            char[] keyArr=strs[i].toCharArray();
            Arrays.sort(keyArr);
            String key = new String(keyArr);
            if(hm.containsKey(key))  hm.get(key).add(strs[i]);
            else {
                ArrayList<String> al=new ArrayList<String>();
                al.add(strs[i]);
                hm.put(key,al);
            }
        }
        List<List<String>> result= new ArrayList<>();
        for(String key: hm.keySet()){
            result.add(hm.get(key));
        }
        return result;
    }
}