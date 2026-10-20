class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List<String>[] bucket =new ArrayList[words.length+1];
        for(String word: map.keySet()){
            int freq=map.get(word);
            if (bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(word);
        }
        List<String> result=new ArrayList<>();
        for(int i=bucket.length-1;i>=0 && result.size()<k;i--){
            if(bucket[i]!=null){
                Collections.sort(bucket[i]);
                for(String word:bucket[i]){
                    result.add(word);
                    if (result.size() == k) {
                        break;
                }
            }
        }
    }
    return result;
}}