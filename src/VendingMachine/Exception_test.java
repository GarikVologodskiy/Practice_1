package VendingMachine;

public class Exception_test {
    public static void main(String[] args) {
        // создать екземпляр класса
        QuadraticEquation qE = new QuadraticEquation(1,1,1);
        qE.Solution(); // вызвать метод, решающий уравнение
        System.out.println("-------------------------");

        // создать другой екземпляр класса
        QuadraticEquation qE2 = new QuadraticEquation(0,3,5);
        qE2.Solution();
        System.out.println("-------------------------");

        QuadraticEquation qE3 = new QuadraticEquation(2,3,-5);
        qE3.Solution();
    }
}
