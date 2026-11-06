package java_hm_8.Task_2;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        Person person1 = new Person("Kyryll", "Herasimchuk", 22);
        Person person2 = new Person("Bogdan", "Kapusta", 44);
        Person person3 = new Person("Nikita", "Kyznetsov", 18);
        Person person4 = new Person("ALex", "Timonin", 33);
        Person person5 = new Person("Artam", "Kortelev", 25);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        System.out.println("All person:");
        System.out.println(people);

        System.out.println("Number of people: " + people.size());

        System.out.println("Is  there an Kyryll Herasimchuk: " + people.contains(person1));

        people.remove(person2);
        System.out.println("After delete Bogdan");
        System.out.println(people);

        Person person6 = new Person("Anton", "Biliy", 35);
        people.add(person6);

        System.out.println("List of people");
        for (Person person : people){
            System.out.println(person);
        }

        System.out.println("Collection is empty: " + people.isEmpty());

        Set<Person> newPeople = new HashSet<>();
        newPeople.add(new Person("Dasha","Slivova",30));
        newPeople.add(new Person("Katya", "Abramova",27));

        people.addAll(newPeople);

        System.out.println("After addAll");
        System.out.println(people);

        System.out.println("Contains all elements newPeople: " + people.containsAll(newPeople));

        people.removeAll(newPeople);
        System.out.println("After removeAll");
        System.out.println(people);

        people.clear();
        System.out.println("After clear");
        System.out.println(people);
        System.out.println("Collection is empty:" + people.isEmpty());
    }
}
