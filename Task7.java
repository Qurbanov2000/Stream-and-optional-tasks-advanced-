package StreamAdvanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) list.add(rand.nextInt(100));

        long start1 = System.currentTimeMillis();
        list.parallelStream().filter(x->x%2!=0).forEach(System.out::println);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        list.stream().filter(x->x%2!=0).forEach(System.out::println);
        long end2 = System.currentTimeMillis();

        long time1 = end1 - start1;
        long time2 = end2 - start2;

        System.out.println("Parallel Stream: " + time1 + " ms");
        System.out.println("Stream: " + time2 + " ms");

    }
}
