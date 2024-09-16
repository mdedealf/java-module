package exercises.day10;

import exercises.day10.materials.Book;
import exercises.day10.materials.Dvd;
import exercises.day10.materials.Magazine;
import exercises.day10.materials.Material;

import java.util.*;

public class LibrarySystem {
    static List<Material> materials = new ArrayList<>();
    static Map<String, User> users = new HashMap<>();
    private static Scanner scanner;

    public LibrarySystem(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runLibrary() {
        /**
         * for debugging only, delete later
         */
        users.put("admin", new Admin("admin", "admin"));
        users.put("user", new NormalUser("dede","dede"));

        while (true) {
            System.out.println("===== Library Management System =====");
            System.out.println("1. Login " +
                    "\n2. Register" +
                    "\n3. Exit");

            System.out.print("Enter an option number : ");
            int userOption = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (userOption) {
                case 1 -> loginAccount();
                case 2 -> registerAccount();
                case 3 -> {
                    System.out.println("Exit the system, see yaa later.");
                    return;
                }
                default -> System.out.println("Invalid option. Please input the valid one.\n");
            }
        }
    }

    public static void registerAccount() {
        List<String> utils = Utils.inputUsernamePassword(scanner);
        System.out.println("User Type : 1. Admin | 2. Normal user");
        int userRole = scanner.nextInt();
        scanner.nextLine();

        if(userRole == 1) {
            users.put(utils.getFirst(), new Admin(utils.getFirst(), utils.getLast()));
            System.out.println("Admin account successfully registered.\n");
        } else if(userRole == 2) {
            users.put(utils.getFirst(), new NormalUser(utils.getFirst(), utils.getLast()));
            System.out.println("Normal account successfully registered.\n");
        } else {
            System.out.println("Invalid username or password. Please try again.\n");
        }
    }

    public static void loginAccount() {
        List<String> utils = Utils.inputUsernamePassword(scanner);

        User user = users.get(utils.getFirst());
        if(user != null && user.password.equals(utils.getLast())) {
            if(user instanceof Admin) {
                adminMenu((Admin) user);
            } else if(user instanceof NormalUser) {
                userMenu((NormalUser) user);
            }
        } else {
            System.out.println("Invalid user.\n");
        }
    }

    public static void adminMenu(Admin admin) {
        while (true) {
            admin.showMenu();
            System.out.print("Enter your option choice : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addMaterial(admin);
                case 2 -> deleteMaterial(admin);
                case 3 -> admin.viewMaterial(materials);
                case 4 -> {
                    System.out.println("Logging out program, see yaa later.");
                    return;
                }
                default -> System.out.println("Invalid option. Please input the valid one.\n");
            }
        }
    }


    public static void addMaterial(Admin admin) {
        System.out.print("Enter Material type (Book / Magazine / DVD) : ");
        String materialType = scanner.nextLine();
        System.out.print("Enter material name : ");
        String materialName = scanner.nextLine();
        System.out.print("Enter total stock : ");
        int totalStock = scanner.nextInt();
        scanner.nextLine();

        if (materialType.equalsIgnoreCase("Book")) {
            System.out.print("Enter author name : ");
            String authorName = scanner.nextLine();
            admin.addMaterial(materials, new Book(authorName, materialName, totalStock));
        } else if (materialType.equalsIgnoreCase("Magazine")) {
            System.out.print("Enter magazine volume : ");
            int magazineVolume = scanner.nextInt();
            admin.addMaterial(materials, new Magazine(magazineVolume, materialName, totalStock));
        } else if (materialType.equalsIgnoreCase("DVD")) {
            System.out.print("Enter dvd duration : ");
            float dvdDuration = scanner.nextFloat();
            admin.addMaterial(materials, new Dvd(dvdDuration, materialName, totalStock));
        } else System.out.println("Invalid material type, please entered valid one.");
    }

    public static void deleteMaterial(Admin admin) {
        System.out.print("Enter material UUID to delete : ");
        String materialUUID = scanner.nextLine();
        UUID materialId = UUID.fromString(materialUUID);
        admin.deleteMaterial(materials, materialId);
    }

    public static void userMenu(NormalUser user) {
        while (true) {
            user.showMenu();
            System.out.print("Enter your option choice : ");
            int userOption = scanner.nextInt();

            switch (userOption) {
                case 1 -> user.viewAvailableMaterials(materials);
                case 2 -> borrowMaterial(user);
                case 3 -> returnMaterial(user);
                case 4 -> {
                    System.out.println("Logging out program, see yaa later.");
                    return;
                }
                default -> System.out.println("Invalid option. Please input the valid one");
            }
        }
    }

    public static void borrowMaterial(NormalUser user) {
        System.out.print("Enter material UUID that you want to borrow : ");
        String materialId = scanner.nextLine();
        UUID materialUuid = UUID.fromString(materialId);
        user.borrowMaterial(materials, materialUuid);
    }

    public static void returnMaterial(NormalUser user) {
        System.out.print("Enter material UUID that you want to return : ");
        String materialId = scanner.nextLine();
        UUID materialUuid = UUID.fromString(materialId);
        user.returnMaterial(materialUuid);
    }
}
