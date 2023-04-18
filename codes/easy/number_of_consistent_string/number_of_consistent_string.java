class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        
        for (String word : words) {
            boolean foundUnique = false;
            
            for (char c : word.toCharArray()) {
                if (!allowed.contains(String.valueOf(c))) {
                    foundUnique = true;
                    break;
                }
            }
            
            if (!foundUnique) {
                result++;
            }
        }
        
        return result;
    }
}