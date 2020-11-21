package VendingMachine;

import java.io.IOException;

public class Machine_test {

    public static void main(String[] args) throws VendingMachine_2.MyException {
        int item = VendingMachine_2.getMenu();
        double cost =  VendingMachine_2.getPriceByIndex(item);
        double change = VendingMachine_2.Money(cost);
    }
}


