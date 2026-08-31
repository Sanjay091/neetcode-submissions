class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            int[] arr = new int[28];
            for(char c : str.toCharArray()){
                arr[c-'a']++;
            }
            String s = Arrays.toString(arr);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
