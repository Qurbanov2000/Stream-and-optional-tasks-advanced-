package StreamAdvanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class Task1 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ali",24),
                new Person("Akif",38),
                new Person("Xeyal",15),
                new Person("Etibar",9),
                new Person("Nurlan",35)
        );
        Map<String, List<Person>> map = people.stream().collect(Collectors.groupingBy(
                person -> {
                    if (person.age < 20) return "<20";
                    else if (person.age < 30) return "<30";
                    else if (person.age < 40) return "<40";
                    else return ">=40";
                }
        ));

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    }

