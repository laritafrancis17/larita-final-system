package main;

import java.util.Map;
import java.util.Scanner;

public class Caterer {

    Scanner sc = new Scanner(System.in);

    public void CatererDashboard(Map<String, Object> user) {

        int choice;

        do {
            System.out.println("\n===== 👨‍🍳 CATERER DASHBOARD =====");
            System.out.println("Welcome, " + user.get("u_name"));
            System.out.println("[1] View Bookings");
            System.out.println("[2] Update Event Status");
            System.out.println("[3] My Profile");
            System.out.println("[4] Logout");
            System.out.print("Enter choice: ");

            choice = getValidInt();

            switch (choice) {

                case 1:
                    System.out.println("\n📅 Viewing bookings...");
                    // TODO: show bookings
                    break;

                case 2:
                    System.out.println("\n🔧 Updating event status...");
                    // TODO: update event status
                    break;

                case 3:
                    System.out.println("\n👤 Profile section...");
                    // TODO: profile info
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
