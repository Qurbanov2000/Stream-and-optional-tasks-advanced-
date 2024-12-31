package StreamAdvanced;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> list = List.of("Ali","Sahib","Kenan","Ali","Kenan","Ali");
        String s = list.stream()
                .distinct()
                .max(Comparator.comparing(word-> Collections.frequency(list,word)))
                .orElse(null);

        System.out.println(s);
    }
}
