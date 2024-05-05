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

        Manager managerZero = new Manager("Manny", 1200000, 0, "09-09-2009", "chairman");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(workerZero);
        employees.add(workerOne);
        employees.add(workerTwo);
        employees.add(workerThree);

        employees.add(managerZero);

        for(Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary());
        }
    }
}