package Notes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesApp {


		// TODO Auto-generated method stub

		    private static final String FILE_NAME = "notes.txt";

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        boolean running = true;

		        System.out.println("=== Notes App ===");

		        while (running) {
		            System.out.println("\n1. Write Note");
		            System.out.println("2. View Notes");
		            System.out.println("3. Exit");
		            System.out.print("Choose option: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    writeNote(scanner);
		                    break;
		                case 2:
		                    readNotes();
		                    break;
		                case 3:
		                    running = false;
		                    System.out.println("Exiting. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid option. Try again.");
		            }
		        }

		        scanner.close();
		    }

		    private static void writeNote(Scanner scanner) {
		        System.out.print("Enter your note: ");
		        String note = scanner.nextLine();

		        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
		            writer.write(note + System.lineSeparator());
		            System.out.println("Note saved.");
		        } catch (IOException e) {
		            System.out.println("Error writing to file: " + e.getMessage());
		        }
		    }

		    private static void readNotes() {
		        System.out.println("\n--- Your Notes ---");

		        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
		            String line;
		            boolean hasContent = false;
		            while ((line = reader.readLine()) != null) {
		                System.out.println("- " + line);
		                hasContent = true;
		            }

		            if (!hasContent) {
		                System.out.println("(No notes yet)");
		            }
		        } catch (FileNotFoundException e) {
		            System.out.println("No notes found. Start by writing one.");
		        } catch (IOException e) {
		            System.out.println("Error reading file: " + e.getMessage());
		        }
		    

	}

}
