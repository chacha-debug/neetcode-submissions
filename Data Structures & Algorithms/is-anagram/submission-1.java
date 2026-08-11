class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] letterS = s.toCharArray();
        char[] letterT = t.toCharArray();
        
        Arrays.sort(letterS);
        Arrays.sort(letterT);
        
        return Arrays.equals(letterS, letterT);
    }
}
