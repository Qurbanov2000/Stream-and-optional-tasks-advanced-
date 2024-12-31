package StreamAdvanced;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(6,2,4,7,3,6,8,2,4,6,1,9,7);
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);
    }
}
