package personInformation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directory directory = new Directory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nDirectory Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Display all entries");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter telephone number (if available, with STD code): ");
                    String telephoneNumber = sc.nextLine();

                    System.out.print("Enter mobile number (if available): ");
                    String mobileNumber = sc.nextLine();

                    System.out.print("Enter head of the family: ");
                    String headOfFamily = sc.nextLine();

                    System.out.print("Enter unique ID: ");
                    String uniqueId = sc.nextLine();

                    Person entry = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueId);
                    directory.addEntry(entry);
                    break;
                case 2:
                    System.out.print("Enter the unique ID of the entry to edit: ");
                    String editUniqueId = sc.nextLine();
                    directory.editEntry(editUniqueId);
                    break;
                case 3:
                    directory.displayEntries();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
	

}
