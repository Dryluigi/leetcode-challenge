class Solution {
    public String sortSentence(String s) {
        String[] result = Stream.of(s.split(" "))
            .sorted((str1, str2) -> Character.compare(
                str1.charAt(str1.length() - 1),
                str2.charAt(str2.length() - 1)))
            .map(str -> str.substring(0, str.length() - 1))
            .toArray(String[]::new);
        
        return String.join(" ", result);
    }
}