class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs)
        {
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String ch=new String(arr);
            if(!map.containsKey(ch))
            {
                map.put(ch,new ArrayList<>());
            }
            map.get(ch).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
