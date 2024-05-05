import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker workerZero = new Worker("Jame", 12000, 0, "08-08-2008", "chef");
        Worker workerOne = new Worker("Jami", 1200, 1, "12-12-2012", "cook");
        Worker workerTwo = new Worker("Jimmy", 4000, 2, "11-11-2011", "cook");
        Worker workerThree = new Worker("Jil", 7000, 3, "10-10-2010", "waiter");

        Manager managerZero = new Manager("Manny", 1200000, 99, "09-09-2009", "chairman");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(workerZero);
        employees.add(workerOne);
        employees.add(workerTwo);
        employees.add(workerThree);

        employees.add(managerZero);

        for(Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary());
        }

        Worker workerFirst = new Worker("Jame", 1240, 1, "08-01-2008", "player");
        Worker workerSecond = new Worker("Same", 12300, 1, "12-12-2012", "goalkeeper");
        Worker workerThird = new Worker("Tame", 44440, 23, "11-12-2011", "jury");

        Manager managerFirst = new Manager("Mame", 444, 0, "11-03-2003", "manager");

        System.out.println(workerFirst.getName() + " has code: " + workerFirst.hashCode());
        System.out.println(workerSecond.getName() + " has code: " + workerSecond.hashCode());
        System.out.println(workerThird.getName() + " has code: " + workerThird.hashCode());

        System.out.println(managerFirst.getName() + " has code: " + managerFirst.hashCode());

        System.out.println(workerFirst.equals(workerSecond));
        System.out.println(workerFirst.equals(workerThird));
        System.out.println(workerFirst.equals(managerFirst));
    }
}