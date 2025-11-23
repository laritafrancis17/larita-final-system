package main;

import java.util.Map;
import java.util.Scanner;

public class Manager {

    Scanner sc = new Scanner(System.in);

    public void ManagerDashboard(Map<String, Object> user) {

        int choice;

        do {
            System.out.println("\n===== 👨‍💼 MANAGER DASHBOARD =====");
            System.out.println("Welcome, " + user.get("u_name"));
            System.out.println("[1] View Caterers");
            System.out.println("[2] Approve Caterer Accounts");
            System.out.println("[3] Catering Reports");
            System.out.println("[4] Logout");
            System.out.print("Enter choice: ");

            choice = getValidInt();

            switch (choice) {

                case 1:
                    System.out.println("\n📋 Showing list of caterers...");
                    // TODO: db view method
                    break;

                case 2:
                    System.out.println("\n✔ Approving Caterers...");
                    // TODO: approve caterers
                    break;

                case 3:
                    System.out.println("\n📊 Reports section...");
                    // TODO: reports
                    break;

                case 4:
                    System.out.println("👋 Logging out...");
                    return;

                default:
                    System.out.println("❌ Invalid choice!");
            }

        } while (true);
    }

    private int getValidInt() {
        while (true) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                sc.nextLine();
                return n;
            }
            System.out.print("Numbers only: ");
            sc.nextLine();
        }
    }
}
