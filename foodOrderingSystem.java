import java.util.*;

public class foodOrderingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our Restaurant");
        System.out.println("Choose a restaurant:");
        System.out.println("1. CORNER HOUSE");
        System.out.println("2. WAFFLE HOUSE");

        int restaurant = sc.nextInt();

        switch (restaurant) {
            case 1:
                System.out.println("You selected CORNER HOUSE");
                System.out.println("Menu:");
                System.out.println("1. DBC");
                System.out.println("2. VANILLA");
                System.out.print("Enter your choice: ");
                int menu1 = sc.nextInt();
                switch (menu1) {
                    case 1:
                        System.out.println("You ordered: DBC");
                        break;
                    case 2:
                        System.out.println("You ordered: VANILLA");
                        break;
                    default:
                        System.out.println("Invalid menu choice.");
                }
                break;

            case 2:
                System.out.println("You selected WAFFLE HOUSE");
                System.out.println("Menu:");
                System.out.println("1. Chocolate Waffle");
                System.out.println("2. Nutella Waffle");
                System.out.print("Enter your choice: ");
                int menu2 = sc.nextInt();
                switch (menu2) {
                    case 1:
                        System.out.println("You ordered: Chocolate Waffle");
                        break;
                    case 2:
                        System.out.println("You ordered: Nutella Waffle");
                        break;
                    default:
                        System.out.println("Invalid menu choice.");
                }
                break;

            default:
                System.out.println("Invalid restaurant choice.");
        }

        sc.close();
    }
}
