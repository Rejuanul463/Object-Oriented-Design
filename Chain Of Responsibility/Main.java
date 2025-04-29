import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Approver manager = new Manager();
        Approver seniorOfficer = new SeniorOfficer();
        Approver cashier = new Cashier();

        cashier.setNextApprover(seniorOfficer);
        seniorOfficer.setNextApprover(manager);

        while(true){
            System.out.println("\n\nEnter Amount to withdraw. Enter -1 to end.");
            int ammount = sc.nextInt();
            System.out.println("\n--- Withdrawal Tk." + ammount + " ---");
            cashier.handleRequest(ammount);
        }
    }
}