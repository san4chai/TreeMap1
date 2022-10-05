import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Graph", "Karl Dolph Frank", 35));
        people.add(new Person("Petr", "Petrikov", 31));
        people.add(new Person("Ivan", "Ivanovpetrovsidorovnazabore", 40));
        people.add(new Person("Andrey", "Kirpichnikov", 35));

        System.out.println(people);
        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}
