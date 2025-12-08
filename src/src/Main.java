import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Person> listOfPeople = new ArrayList<Person>();
    private ArrayList<Song> listOfSongs = new ArrayList<Song>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean mainLoopRunning = true;
        while (mainLoopRunning) {
            System.out.print("Welcome to the Serenaders’ Music Club Valentine’s Song System!\n" +
                    "Select the action to do:\n" +
                    "1 - Customers – Order a song for Valentine’s Day\n" +
                    "2 – Club members – Get a report of requests for your song\n" +
                    "3 – Club members – Report back that your songs are done\n" +
                    "4 - Admin - Show data for all club members\n" +
                    "Enter 1, 2, 3 or 4:\n");

            String userInput = scanner.nextLine();

            if (userInput == "1") {
                System.out.println("You selected: Customer - Order a song for Valentine’s Day");

            }
            if (userInput == "2") {
                System.out.println("You selected: Club members – Get a report of requests for your song");

            }
            if (userInput == "3") {
                System.out.println("You selected: Club members – Report back that your songs are done");

            }
            if (userInput == "4") {
                System.out.println("You selected: Admin - Show data for all club members");

            }
            System.out.println("Enter valid options though 1-4");


        }
    }
}