package VendingMachine;

public class Machine_test {

    public static void main(String[] args) {
        int item = VendingMachine_2.getMenu();
        double cost =  VendingMachine_2.Price(item);
        double change = VendingMachine_2.Money(cost);
    }
}


