/**
 * Клас "людина" із дочірнім класом "працівник"
 * @autor Гаврилюк Андріана 302 група
 * @version 1.0
*/

import jdk.jshell.PersistentSnippet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args)

    {
        Employee Person1 = new Employee();

        Person1.setId(35);
        Person1.setFirstName("John");
        Person1.setLastName("Wick");
        Person1.setSex(Sex.MALE);
        Person1.setJob(Job_List.Driver);
        Person1.setSalary(23400);
        Person1.setBirthdate(LocalDate.of(1992, 5, 13));

        Employee Person2 = new Employee();

        Person2.setId(73);
        Person2.setFirstName("Ihor");
        Person2.setLastName("Melnyk");
        Person2.setSex(Sex.MALE);
        Person2.setJob(Job_List.DJ);
        Person2.setSalary(32300);
        Person2.setBirthdate(LocalDate.of(1994, 7, 26));

        Employee Person3 = new Employee();

        Person3.setId(7);
        Person3.setFirstName("Lyda");
        Person3.setLastName("Colins");
        Person3.setSex(Sex.FEMALE);
        Person3.setJob(Job_List.Programmer);
        Person3.setSalary(35900);
        Person3.setBirthdate(LocalDate.of(1990, 8, 18));



        List<Employee> EmployeeList = new ArrayList<Employee>();
        Person1.addToList(EmployeeList);
        Person2.addToList(EmployeeList);
        Person3.addToList(EmployeeList);

        new Employee().printList(EmployeeList);

        Person2.removefList(EmployeeList);

        new Employee().printList(EmployeeList);

        System.out.println(Person1.compareTo(Person3));

        Cmprtr compare = new Cmprtr();

        System.out.println(compare.compare(Person1, Person3));

//
//        Person Person2 = new Person();
//
//        Person2.setId(27);
//        Person2.setFirstName("Anna");
//        Person2.setLastName("Jenson");
//        Person2.setSex(Sex.FEMALE);
//        Person2.setBirthdate(LocalDate.of(1996, 2, 23));
//
//        System.out.println(Person1.toString());
//        System.out.println(Person2.toString());
//
//        System.out.print("\nId1:" + Person1.hashCode() + " = Id2:" + Person2.hashCode() + " - " + Person1.equals(Person2) + "\n");
//
//        Employee Person3 = new Employee().new Implem().setId(12).setFirstName("Kate").setSex(Sex.FEMALE).build();
//        System.out.println(Person3.toString());



    }
}