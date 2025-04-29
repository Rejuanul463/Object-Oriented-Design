import java.util.*;
class Manager extends Approver {
    @Override
    public void handleRequest(double amount) {
        if (amount > 1000000) {
            System.out.println("Manager approved withdrawal of Tk. " + amount);
        } else {
            System.out.println("Manager: No action taken. Amount is below approval level.");
        }
    }
}