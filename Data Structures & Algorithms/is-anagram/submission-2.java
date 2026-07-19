class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] list = new int[27];

        for(char c : s.toCharArray()){
            list[c-'a']++;
        }

        for(char c : t.toCharArray()){
            list[c-'a']--;
        }

        for(int i = 0; i<27;i++){
            if(list[i]!=0){
                return false;
            }
        }
        return true;
    }
}
