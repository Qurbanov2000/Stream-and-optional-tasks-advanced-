package StreamAdvanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task10 {
    public static void main(String[] args) {
        List<Optional<String>> list = List.of(
                Optional.of("Hello"),
                Optional.of("world"),
                Optional.empty(),
                Optional.of("Java"),
                Optional.empty(),
                Optional.of("New year")
        );
        list.stream().filter(Optional::isPresent).map(Optional::get).map(String::toUpperCase).forEach(System.out::println);
    }
}
