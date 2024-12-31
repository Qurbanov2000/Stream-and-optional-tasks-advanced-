package StreamAdvanced;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        list.stream().max(Integer::compareTo).ifPresent(System.out::println);
        list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        System.out.println(list.stream().count());
    }
}
