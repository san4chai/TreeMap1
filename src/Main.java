import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Graph", "Karl Dolph Frank", 35));
        people.add(new Person("Petr", "Petrikov", 31));
        people.add(new Person("Ivan", "Ivanovpetrovsidorovnazabore", 40));
        people.add(new Person("Andrey", "Kirpichnikov", 35));

        Comparator<Person> comparator;

        comparator = (a, b) -> {
            if ((a.getSurname().split(" ").length) != (b.getSurname().split(" ").length)) {
                return -1;
            } else {
                return Integer.compare((a.getAge()), b.getAge());
            }
        };
        System.out.println(people);
        people.removeIf(x -> x.getAge() < 18);
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
