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
        people.add(new Person("Artem", "Smolin", 17));
        people.add(new Person("Oleg", "Sergeev", 15));

        Comparator<Person> comparator;

        comparator = (Person a, Person b) -> {
            if ((a.getSurname().split(" ").length) != (b.getSurname().split(" ").length)) {
                return Person.compare(a, b);
            } else {
                return Integer.compare((a.getAge()), b.getAge());
            }
           // Integer.compare(a.getSurname().split(" ").length).compareTo(b.getSurname().split(" ").length);
        };
        System.out.println(people);
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
