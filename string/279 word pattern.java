class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map1 = new HashMap<>(); // map 1 character to word
        HashMap<String,Character> map2 = new HashMap<>(); // map 2 word to character

       String[] words = s.split(" "); // whole string devide into diff words

       if(pattern.length() != words.length){
        return false;
       }

       for(int i =0; i < pattern.length(); i++)
       {
        char ch = pattern.charAt(i);
        String word = words[i];

        if(map1.containsKey(ch) && !map1.get(ch).equals(word)){
            return false;
        }

        if(map2.containsKey(word) && !map2.get(word).equals(ch)){
            return false;
        }
        map1.put(ch,word);
        map2.put(word,ch);
       }
       return true;
       

    }
}
