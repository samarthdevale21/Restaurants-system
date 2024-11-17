import java.util.*;

class Restorunt {
    static String username;
    static String pass;
    static String phone;
    static ArrayList<String> cart = new ArrayList<>();
    static double bill;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println();
            System.out.println("    ****** Welcome To Surbii *******");
            System.out.println();
            System.out.println("1.Sign In");
            System.out.println("2.Sign up");
            System.out.println();
            System.out.println("Enter an option :");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    createAccount(sc);
                    break;
                case 2:
                    Login(sc);
                    break;
                default:
                    System.out.println("Enter Wrong option");
            }
        }
    }

    public static void createAccount(Scanner sc) {
        System.out.println();
        System.out.println("Create  Account ");
        System.out.println();
        System.out.print("Username :");
        sc.nextLine();
        username = sc.next();
        System.err.print("PASSWORD");
        pass = sc.next();
        System.out.println();

        System.out.print("Contact Number :");
        phone = sc.next();

        System.out.println();
        System.out.print("Account Created ");
        System.out.println();
    }

    public static void Login(Scanner sc) {
        if (username != null) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(" ");
                System.out.println("Login page ");
                System.out.println();
                System.out.println("Username/Contact :");
                sc.nextLine();
                String un1 = sc.nextLine();
                System.out.println("Password :");
                String pass1 = sc.next();

                if (((un1.equals(username)) || (un1.equals(phone))) && (pass1.equals(pass))) {
                    homePage(sc);

                } else {
                    System.out.println();
                    System.out.println("Wrong Credential ");
                    System.out.println();
                }
            }
            System.exit(0);
        } else {
            System.out.println("Create Your Account First");
        }
    }

    public static void homePage(Scanner sc) {
        for (;;) {
            System.out.println();
            System.out.println("Home Page");
            System.out.println();
            System.out.println("1.Veg MENU");
            System.out.println("2.NON-Veg MENU");
            System.out.println("3.Checkout");
            System.out.println("4.Logout");
            System.out.println();
            System.out.print("Enter an option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    vegMenu(sc);
                    break;
                case 2:
                    nonVegMenu(sc);
                    break;
                case 3:
                    checkout(sc);
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("Thank you never Visite Again");
                    break;
                default:
                    System.out.println("Wrong option ");
                    break;
            }
        }
    }

    public static void vegMenu(Scanner sc) {
        for (;;) {
            System.out.println();
            System.out.println("Veg DISHESHS");
            System.out.println("101. Panner Tikka : 200");
            System.out.println("102. PavBhaji : 100");
            System.out.println("103. chole Bhuture : 400");
            System.out.println("104. Shai panner : 500");
            System.out.println("105.MENU");
            System.out.println();
            System.out.println("Enter a Dish ID");
            int id = sc.nextInt();
            switch (id) {
                case 101:
                    cart.add("PannerTikka :200");
                    bill += 200;
                    System.out.println("Panner Tikka is added inside cart");
                    break;
                case 102:
                    cart.add("PavBhaji :100");
                    bill += 100;
                    System.out.println("PavBhaji is added inside cart");
                    break;
                case 103:
                    cart.add("chole Bhuture :400");
                    bill += 400;
                    System.out.println("chole Bhuture is added inside cart");
                    break;
                case 104:
                    cart.add("Shai panner :500");
                    bill += 500;
                    System.out.println("Shai panner is added inside cart");
                    break;
                case 105:
                    return;
                default:
                    System.out.println("Wrong Dish Enterd");
            }

        }

    }

    public static void nonVegMenu(Scanner sc) {
        for (;;) {
            System.out.println();
            System.out.println("NonVeg DISHESHS");
            System.out.println("106.chiken tika : 200");
            System.out.println("107. chiken 65 : 100");
            System.out.println("108. chiken roll : 400");
            System.out.println("109. chiken kabab : 500");
            System.out.println("105.MENU");
            System.out.println();
            System.out.println("Enter a Dish ID");
            int id = sc.nextInt();

            switch (id) {
                case 106:
                    cart.add("chiken tika :200");
                    bill += 200;
                    System.out.println("Chiken Tikka is added inside cart");
                    break;
                case 107:
                    cart.add("chiken 65 :100");
                    bill += 100;
                    System.out.println("chiken 65 is added inside cart");
                    break;
                case 108:
                    cart.add("chiken roll  :400");
                    bill += 400;
                    System.out.println("chiken roll  is added inside cart");
                    break;
                case 109:
                    cart.add("chiken kabab :500");
                    bill += 500;
                    System.out.println("chiken kabab is added inside cart");
                    break;
                case 105:
                    return;
                default:
                    System.out.println("Wrong Dish Enterd");

            }

        }
    }

    public static void cart(Scanner sc) {
        System.out.println("Your Purchased Food");
        System.out.println();
        for (String food : cart) {
            System.out.println(food);
        }
        System.out.println();
        System.out.println("Your Total bill is: " + bill + "rs.");
        System.out.println();
    }

    public static void checkout(Scanner sc) {
        System.out.println("CHEKOUT TOMO");
        cart(sc);

    }
}
