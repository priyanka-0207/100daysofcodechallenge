class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i], new ArrayList<>());
            }
            List<Integer> list = map.get(groupSizes[i]);
            list.add(i);
            
            if(list.size()==groupSizes[i]){
                result.add(list);
                map.remove(groupSizes[i]);
            }
        }
        return result;
    }
}