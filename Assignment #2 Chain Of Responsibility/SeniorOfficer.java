import java.util.*;
class SeniorOfficer extends Approver {
    @Override
    public void handleRequest(double amount) {
        if (amount >= 10000 && amount <= 1000000) {
            System.out.println("Senior Officer approved withdrawal of Tk. " + amount);
        } else if (nextApprover != null) {
            System.out.println("Senior Officer forwards the request...");
            nextApprover.handleRequest(amount);
        }
    }
}