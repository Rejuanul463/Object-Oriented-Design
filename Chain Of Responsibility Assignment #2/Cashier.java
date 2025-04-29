import java.util.*;
class Cashier extends Approver {
    @Override
    public void handleRequest(double amount) {
        if (amount < 10000) {
            System.out.println("Cashier approved withdrawal of Tk. " + amount);
        } else if (nextApprover != null) {
            System.out.println("Cashier forwards the request...");
            nextApprover.handleRequest(amount);
        }
    }
}