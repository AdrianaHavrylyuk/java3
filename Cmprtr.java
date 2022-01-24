import java.util.Comparator;
import java.util.Map;

public class Cmprtr implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2)
    {
        System.out.println("Різниця у зарплаті:");
        return Math.abs(o1.getSalary() - o2.getSalary());
    }
}
