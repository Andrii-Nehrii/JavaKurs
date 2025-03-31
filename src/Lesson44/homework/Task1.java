package Lesson44.homework;



import java.util.*;


public class Task1 {

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    private static List<String> getUniqueSortedWords(String string) {
        String[] words = string.replaceAll("[^а-яА-Яa-zA-Z0-9 ]", "").split("\\s+");
        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        uniqueWords.addAll(Arrays.asList(words));
        return new ArrayList<>(uniqueWords);

    }
}




















