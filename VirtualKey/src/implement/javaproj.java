package implement;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class javaproj {

	public static void main(String[] args) {
		System.out.println("Welcome to the File Directory Application");
        System.out.println("Developed by [Developer Name]");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. View current file names in ascending order");
            System.out.println("2. File options menu");
            System.out.println("3. Close the application");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    ArrayList<String> fileList = getCurrentFileList();
                    System.out.println("\nCurrent File List:");
                    for (String file : fileList) {
                        System.out.println(file);
                    }
                    break;
                case 2:
                    System.out.println("\nSelect a file option:");
                    System.out.println("1. Add a file to the directory list");
                    System.out.println("2. Delete a file from the directory list");
                    System.out.println("3. Search a file from the directory list");
                    System.out.println("4. Navigate back to the main context");

                    int fileOption = scanner.nextInt();
                    switch (fileOption) {
                        case 1:
                            System.out.println("Enter the file name to add:");
                            String fileName = scanner.next();
                            addFile(fileName);
                            break;
                        case 2:
                            System.out.println("Enter the file name to delete:");
                            String fileToDelete = scanner.next();
                            deleteFile(fileToDelete);
                            break;
                        case 3:
                            System.out.println("Enter the file name to search:");
                            String fileToSearch = scanner.next();
                            searchFile(fileToSearch);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid option selected");
                    }
                    break;
                case 3:
                    System.out.println("Closing the application");
                    System.exit(0);
                default:
                    System.out.println("Invalid option selected");
            }
        }
    }

    public static ArrayList<String> getCurrentFileList() {
        File file = new File(".");
        String[] fileList = file.list();
        ArrayList<String> sortedList = new ArrayList<String>();
        for (String name : fileList) {
            sortedList.add(name);
        }
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void addFile(String fileName) {
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println(fileName + " added to the directory list");
            } else {
                System.out.println(fileName + " already exists in the directory list");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println(fileName + " deleted from the directory list");
        } else {
            System.out.println("File not found");
        }
    }

    public static void searchFile(String fileName) {
        File file = new File(".");
        String[] fileList = file.list();
        boolean found = false;
        for (String name : fileList) {
            if (name.equalsIgnoreCase(fileName)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(fileName + " found in the directory list");
        } else {
            System.out.println(fileName + " not found in the directory list");
        }
   
	}

}
