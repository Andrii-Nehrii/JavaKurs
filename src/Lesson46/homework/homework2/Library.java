package Lesson46.homework.homework2;

import java.util.Optional;

public class Library {


    public Book[] books = {
            new Book("Война и мир", "Лев Толстой"),
            new Book("Преступление и наказание", "Фёдор Достоевский"),
            new Book("Мастер и Маргарита", "Михаил Булгаков"),
            new Book("Евгений Онегин", "Александр Пушкин"),
            new Book("Отцы и дети", "Иван Тургенев")
    };



    public Optional<Book> findBookByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (title.equals(books[i].getTitle())) {
                return Optional.of(books[i]);
            }

        }
        System.out.println("Книга не найдена");
        return Optional.empty();

    }
}
