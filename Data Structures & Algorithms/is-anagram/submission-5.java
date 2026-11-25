class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tCount = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            sCount.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
                tCount.compute(t.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }
        for (char key : sCount.keySet()) {
            if (!(sCount.get(key).equals(tCount.get(key)))) {
                return false;
            }
        }
        return true;
    }
}
