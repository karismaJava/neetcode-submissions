class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sCount.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
            tCount.compute(t.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }
        var keys = sCount.keySet();
        for (char key : keys) {
            if (!tCount.containsKey(key) || !(tCount.get(key).equals(sCount.get(key)))) {
                return false;
            }
        }
        return true;
    }
}
