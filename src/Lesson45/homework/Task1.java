package Lesson45.homework;

import Lesson12.MainOperations;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<String , Integer> getFrequency(String string) {
        Map<String, Integer> frMap = new HashMap<>();

        String[] words = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]" ,  "").split("\\s+");
        for (String word : words){
                frMap.put(word , frMap.getOrDefault(word , 0)+ 1);
        }
        return frMap;
    }

    public static   void main(String[] args) {
        String str = "Счетчик повтора текста повтора 1 1 счетчик ";
        Map<String, Integer> getFr = getFrequency(str);

        System.out.println(getFr);
    }
}
