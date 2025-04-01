package Lesson46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        //Optional <T> это класс- обертка,  который может содержать значние типа Т , а может не содержать
        // против null
        Optional<User> user = getById(10);
        System.out.println(user.get());


    }

    public static Optional<User> getById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }


}
