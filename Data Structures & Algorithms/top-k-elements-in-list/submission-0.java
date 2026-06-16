class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Stack<Integer>st=new Stack<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>list[]=new List[nums.length+1];

        for(int i:map.keySet())
        {
            int freq=map.get(i);
            if(list[freq]==null)
                list[freq]=new ArrayList<>();
            list[freq].add(i);
        }
        int result[]=new int[k];
        int index=0;
        for(int i=list.length-1;i>=0;i--)
        {
            if(list[i]!=null)
            {
                for(int num:list[i])
                {
                    result[index++]=num;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
