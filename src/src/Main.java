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

            if (userInput.equals("1")) {
                System.out.println("You selected: Customer - Order a song for Valentine’s Day");
                System.out.println("Order a song for Valentine’s Day...\n" +
                        "Select the song from this list:\n" +
                        "1 - \"Can't Help Falling in Love\" by Elvis Presley\n" +
                        "2 - \"At Last\" by Etta James\n" +
                        "3 - \"Unchained Melody\" by The Righteous Brothers\n" +
                        "4 - \"Perfect\" by Ed Sheeran\n" +
                        "5 - \"All of Me\" by John Legend\n" +
                        "6 - \"A Thousand Years\" by Christina Perri\n" +
                        "7 – \"Make You Feel My Love\" by Adele\n" +
                        "Your choice (1 – 7):\n");
                userInput = scanner.nextLine();
                switch (userInput) {
                    case "1":
                        System.out.println("You selected: 1 - \"Can't Help Falling in Love\" by Elvis Presley");
                        break;
                    case "2":

                        break;
                    case "3":

                        break;
                    case "4":

                        break;
                    case "5":

                        break;
                    case "6":

                        break;
                    case "7":

                        break;
                    default:
                        System.out.println("Enter valid options though 1-7");
                }

            } else if (userInput.equals("2")) {
                System.out.println("You selected: Club members – Get a report of requests for your song");

            } else if (userInput.equals("3")) {
                System.out.println("You selected: Club members – Report back that your songs are done");

            } else if (userInput.equals("4")) {
                System.out.println("You selected: Admin - Show data for all club members");

            } else {
                System.out.println("Enter valid options though 1-4");
            }

        }
    }
}