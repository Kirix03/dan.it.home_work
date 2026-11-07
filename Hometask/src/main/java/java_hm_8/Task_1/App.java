package java_hm_8.Task_1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new HashMap<>();

        while (true){
            System.out.println("Enter command");
            System.out.println("addPerson - add person");
            System.out.println("getPerson - find person");
            System.out.println("Exit - end program");
            String command = scanner.nextLine();
            switch (command){
                case "addPerson":
                    System.out.println("Enter Surname: ");
                    String surname = scanner.nextLine();
                    String key = surname.toUpperCase();
                    if (people.containsKey(key)){
                        System.out.println("Person with this surname already exists");
                        System.out.println("Change information (Y/N): ");
                        String answer = scanner.nextLine();
                        if(answer.equalsIgnoreCase("Y")){
                            System.out.println("Information don't change");
                            break;
                        }
                    }
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();

                    int age;
                    while (true){
                        System.out.println("Enter age: ");
                        try {
                            age = Integer.parseInt(scanner.nextLine());
                            break;
                        }
                        catch (NumberFormatException e){
                            System.out.println("Error. Enter Integer");
                        }
                    }
                    Person person = new Person(name,surname,age);
                    people.put(key, person);
                    System.out.println("Person successfully added");
                    break;
                case "getPerson":
                    System.out.println("Enter surname to search: ");
                    String searchSurname = scanner.nextLine();
                    String searchKey = searchSurname.toUpperCase();

                    if(people.isEmpty()){
                        System.out.println("The list of people is empty");
                    } else if(people.containsKey(searchKey)) {
                        System.out.println(people.get(searchKey));
                    }else{
                        System.out.println("Person with this suranem not found");
                        System.out.println("Available surname");
                        for(String surnameKey : people.keySet()){
                            System.out.println(surnameKey);

                        }
                    }
                    break;

                case "Exit":
                    System.out.println("Program ended");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command! Try again.");
                    break;

            }

        }

    }
}
