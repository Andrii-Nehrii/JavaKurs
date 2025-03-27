package Lesson42.Homework;

import java.util.Comparator;

public class SportsmnComparatorScore implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return s1.getScore() - s2.getScore();
    }
}
