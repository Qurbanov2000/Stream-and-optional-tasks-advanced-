package StreamAdvanced;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World","Java","Python","Streams","Programming");
        Map<Integer,List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);

        Map<Integer,Long> map1 = list.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(map1);
    }
}
