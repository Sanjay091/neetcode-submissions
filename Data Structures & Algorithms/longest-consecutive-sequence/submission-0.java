class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int n:nums){
            st.add(n);
        }
        
        int result = 0;

        for(int n:st){
            if(!st.contains(n-1)){
                int count =1;
                while(st.contains(n+1)){
                    n++;
                    count++;
                }
                result = Math.max(result, count);
            }
        }

        return result;
    }
}
