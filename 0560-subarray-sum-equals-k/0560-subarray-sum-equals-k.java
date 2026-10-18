import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Base case: a sum of 0 has been seen once
        map.put(0, 1);
        
        int currentSum = 0;
        int count = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            // Do we have a past remainder that equals (currentSum - k)?
            int remainder = currentSum - k;
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }
            
            // Record our currentSum into the map for future lookups
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
    }
