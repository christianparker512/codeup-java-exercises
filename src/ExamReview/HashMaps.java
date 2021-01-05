package ExamReview;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        System.out.println(letterCounter("abakd;lkajsdflkj"));
    }

    public static HashMap<Character, Integer> letterCounter(String string){
        HashMap<Character, Integer>charList = new HashMap<>();

        for(int i = 0; i<string.length(); i++){
            char currChar = string.charAt(i);
            if(charList.containsKey(currChar)){
                int count = charList.get(currChar);
                charList.put(currChar, count +1);
            } else{
                charList.put(currChar,1);
            }
            System.out.println(charList);
        }
        return charList;
    }
}
