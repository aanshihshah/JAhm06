package personInformation;
import java.util.Scanner;
public class Directory {
	
	private Person[] entries;
    private int entryCount;
    private final int MAX_ENTRIES = 100;

    public Directory() {
        entries = new Person[MAX_ENTRIES];
        entryCount = 0;
    }

    public void addEntry(Person entry) {
        if (entryCount >= MAX_ENTRIES) {
            System.out.println("Directory is full!");
            return;
        }
        for (int i = 0; i < entryCount; i++) {
            if (entries[i].getUniqueId().equals(entry.getUniqueId())) {
                System.out.println("Unique ID already exists!");
                return;
            }
        }
        entries[entryCount++] = entry;
        System.out.println("Entry added successfully.");
    }

    public void editEntry(String uniqueId) {
        for (int i = 0; i < entryCount; i++) {
            if (entries[i].getUniqueId().equals(uniqueId)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Editing entry: " + entries[i]);

                System.out.print("Enter new name (or press Enter to keep current): ");
                String name = sc.nextLine();
                if (!name.isEmpty()) entries[i].setName(name);

                System.out.print("Enter new address (or press Enter to keep current): ");
                String address = sc.nextLine();
                if (!address.isEmpty()) entries[i].setAddress(address);

                System.out.print("Enter new telephone number (or press Enter to keep current): ");
                String telephoneNumber = sc.nextLine();
                if (!telephoneNumber.isEmpty()) entries[i].setTelephoneNumber(telephoneNumber);

                System.out.print("Enter new mobile number (or press Enter to keep current): ");
                String mobileNumber = sc.nextLine();
                if (!mobileNumber.isEmpty()) entries[i].setMobileNumber(mobileNumber);

                System.out.print("Enter new head of family (or press Enter to keep current): ");
                String headOfFamily = sc.nextLine();
                if (!headOfFamily.isEmpty()) entries[i].setHeadOfFamily(headOfFamily);

                System.out.println("Entry updated successfully.");
                return;
            }
        }
        System.out.println("Entry not found.");
    }

    public void displayEntries() {
        if (entryCount == 0) {
            System.out.println("No entries in the directory.");
            return;
        }
        for (int i = 0; i < entryCount; i++) {
            System.out.println(entries[i]);
        }
    }

}
