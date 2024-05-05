import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker workerZero = new Worker("Jame", 12000, 0);
        Worker workerOne = new Worker("Jami", 1200, 1);
        Worker workerTwo = new Worker("Jimmy", 4000, 2);
        Worker workerThree = new Worker("Jil", 7000, 3);

        Manager managerZero = new Manager("Manny", 1200000, 0);

        System.out.println(workerZero.getSalary());
        workerZero.work();

        System.out.println(workerOne.getSalary());
        workerOne.work();

        System.out.println(workerTwo.getSalary());
        workerTwo.work();

        System.out.println(workerThree.getSalary());
        workerThree.work();

        System.out.println(managerZero.getSalary());
        managerZero.work();
    }
}