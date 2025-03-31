package Lesson43.Homework;


    import java.util.*;

    public class ListPerformanceTest {

        public static void main(String[] args) {
            // Создание списков
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            Random random = new Random();

            // Заполнение списков одинаковыми случайными значениями
            for (int i = 0; i < 5_000; i++) {
                int value = random.nextInt(1_001); // значения от 0 до 1000 включительно
                arrayList.add(value);
                linkedList.add(value);
            }

            System.out.println("== ArrayList ==");
            testAll(arrayList);

            System.out.println("\n== LinkedList ==");
            testAll(linkedList);
        }

        // Метод для запуска всех тестов на списке и замера общего времени
        private static void testAll(List<Integer> list) {
            long totalStart = System.currentTimeMillis();

            System.out.println("getElements: " + getElements(list) + " ms");
            System.out.println("insertElements: " + insertElements(list) + " ms");
            System.out.println("removeByIndex: " + removeByIndex(list) + " ms");
            System.out.println("removeByValue: " + removeByValue(list) + " ms");

            long totalTime = System.currentTimeMillis() - totalStart;
            System.out.println("Total time: " + totalTime + " ms");
        }

        // Получение всех элементов списка по индексу
        private static long getElements(List<Integer> list) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < list.size(); i++) {
                Integer value = list.get(i);
            }
            return System.currentTimeMillis() - start;
        }

        // Вставка 2000 новых элементов по случайным индексам
        private static long insertElements(List<Integer> list) {
            Random random = new Random();
            long start = System.currentTimeMillis();
            for (int i = 0; i < 2_000; i++) {
                int index = random.nextInt(list.size() + 1); // [0, size]
                int value = random.nextInt(1_001);
                list.add(index, value);
            }
            return System.currentTimeMillis() - start;
        }

        // Удаление 1000 элементов по случайным индексам
        private static long removeByIndex(List<Integer> list) {
            Random random = new Random();
            long start = System.currentTimeMillis();
            for (int i = 0; i < 1_000; i++) {
                if (list.isEmpty()) break;
                int index = random.nextInt(list.size());
                list.remove(index);
            }
            return System.currentTimeMillis() - start;
        }

        // Удаление 1000 элементов по случайному значению
        private static long removeByValue(List<Integer> list) {
            Random random = new Random();
            long start = System.currentTimeMillis();
            for (int i = 0; i < 1_000; i++) {
                Integer value = random.nextInt(10_001); // [0, 10000]
                list.remove(value); // удаляет первый встретившийся или ничего
            }
            return System.currentTimeMillis() - start;
        }
    }


