package StreamAdvanced;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = List.of("Ali","Sahib","Kenan","Adil","Bahadur");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
