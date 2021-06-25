package Utility;

import java.util.HashMap;
import java.util.Map;

public class CountIt {
    private static String getGroupByCount(final String input){
        String[] array = new String[input.length()];
        char[] c = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<c.length;i++){

            if(map.containsKey(c[i])){
                map.put(c[i],map.get(c[i])+1);
            }else{
                map.put(c[i],1);
            }

        }
        System.out.println(map);


        return null;

    }
    public static void main(String[] args){
        String input="aaaabbbacccc";
        String output = getGroupByCount(input);

    }
}


