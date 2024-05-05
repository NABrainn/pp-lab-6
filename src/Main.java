import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker workerZero = new Worker("Jame", 12000, 0);
        Worker workerOne = new Worker("Jami", 1200, 1);
        Worker workerTwo = new Worker("Jimmy", 4000, 2);
        Worker workerThree = new Worker("Jil", 7000, 3);

        Manager managerZero = new Manager("Manny", 1200000, 0);

        workerZero.work();
        workerOne.work();
        workerTwo.work();
        workerThree.work();

        managerZero.work();
    }
}