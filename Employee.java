import java.lang.annotation.ElementType;
import java.time.LocalDate;
import java.util.List;

public class Employee extends Person implements Comparable
{
    private Job_List job;
    private int salary;



    public String toString()
    {
        return  "\n Employee:" +
                "\n Id:" + id +
                "\n First name:" + FirstName +
                "\n Last name:" + LastName +
                "\n sex:" + sex +
                "\n job:" + job +
                "\n Salary:" + salary +
                "\n birthDate:" + birthdate;
    }


    public boolean equals (Employee person)
    {
        return this.id == person.id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Job_List getJob() {
        return job;
    }

    public void setJob(Job_List job) {
        this.job = job;
    }

    public interface PersonBuilder
    {
        PersonBuilder setId(int id);
        PersonBuilder setFirstName(String name);
        PersonBuilder setLastName(String name);
        PersonBuilder setSex(Sex sex);
        PersonBuilder setDate(LocalDate bday);
        PersonBuilder setJob(Job_List job);
        PersonBuilder setSalary(int salary);
        Employee build();
    }

    public class Implem implements PersonBuilder
    {
        Employee person = new Employee();

        @Override
        public PersonBuilder setId(int id) {
            person.id = id;
            return this;
        }

        @Override
        public PersonBuilder setFirstName(String name) {
            person.FirstName = name;
            return this;
        }

        @Override
        public PersonBuilder setLastName(String name) {
            person.LastName = name;
            return this;
        }

        @Override
        public PersonBuilder setSex(Sex sex) {
            person.sex = sex;
            return this;
        }

        @Override
        public PersonBuilder setDate(LocalDate bday) {
            person.birthdate = bday;
            return this;
        }

        @Override
        public PersonBuilder setJob(Job_List job) {
            person.job = job;
            return this;
        }


        @Override
        public PersonBuilder setSalary(int salary) {
            person.salary = salary;
            return this;
        }

        @Override
        public Employee build() {
            return person;
        }
    }

    //Методи для роботи з колекціями
    public List<Employee> addToList(List<Employee> Spis)
    {
        Spis.add(this);
        return Spis;
    }

    public void removefList(List<Employee> Spis)
    {
        Spis.remove(this);
    }


    public void printList(List<Employee> Spis) {
        System.out.println("\n Employee list:");
        for (Employee x : Spis) {
            System.out.println(x.toString());
        }
    }

    public int compareTo(Employee p) {
        System.out.println("Різниця у зарплаті:");
        return Math.abs(this.salary - p.salary);
    }
}
