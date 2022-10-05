import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int length1 = p1.getSurname().split(" ").length;
        int length2 = p2.getSurname().split(" ").length;
        if (length1 != length2) {
            return Integer.compare(length1, length2);
        }
        return Integer.compare((p1.getAge()), p2.getAge());
    }
}
