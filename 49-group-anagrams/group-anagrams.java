class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //question 49
        int n = strs.length;

        HashMap<Character, Integer> [] map = new HashMap[n];
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++){
            map[i] = new HashMap<>();
            for(int j=0;j<strs[i].length();j++){
                map[i].put(strs[i].charAt(j), map[i].getOrDefault(strs[i].charAt(j),0)+1);
            }
        }

        for(int i=0;i<n;i++){
            if(visited[i]) continue;

            List<String> ans1 = new ArrayList<>();
            ans1.add(strs[i]);
            visited[i] = true;
            if(strs[i].isEmpty()){
                for(int j=i+1;j<n;j++){
                    if(strs[j].isEmpty() && !visited[j]){
                        ans1.add(strs[j]);
                        visited[j]=true;
                    }
                }
            } else {
                for(int j=i+1;j<n;j++){
                    if(!visited[j] && map[i].equals(map[j])){
                        ans1.add(strs[j]);
                        visited[j]=true;
                    }
                }
            }
            ans.add(ans1);
        }
        
        return ans;
    }
}