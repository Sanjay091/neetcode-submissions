class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparing(Pair::getKey));

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getValue(), entry.getKey()));
            if(pq.size()>k){
                pq.poll();
            }
        }


        int[] res = new int[k];
        int i=0;
        while(pq.size()>0){
            res[i++]=pq.poll().getValue();
        }

        return res;
    }
}
