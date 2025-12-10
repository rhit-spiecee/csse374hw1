import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<ClubMember> listOfClubMember = new ArrayList<ClubMember>();
    private static ArrayList<Customer> listOfCustomer = new ArrayList<Customer>();
    private static ArrayList<Admin> listOfAdmin = new ArrayList<Admin>();
    private static ArrayList<Song> listOfSongs = new ArrayList<Song>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean mainLoopRunning = true;

        //initializing clubmembers into list of person to associate with song that they are singing
        //initializing options of songs and associating it with the memeber who sings the song.
        initializeList();

        while (mainLoopRunning) {
            System.out.println();
            System.out.print("Welcome to the Serenaders’ Music Club Valentine’s Song System!\n" +
                    "Select the action to do:\n" +
                    "1 - Customers – Order a song for Valentine’s Day\n" +
                    "2 – Club members – Get a report of requests for your song\n" +
                    "3 – Club members – Report back that your songs are done\n" +
                    "4 - Admin - Show data for all club members\n" +
                    "Enter 1, 2, 3 or 4:\n");

            String userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("You selected: Customer - Order a song for Valentine’s Day");

                String cusEmailAddr;
                String cusCreditCardNum;
                String cusSweetheartName;

                System.out.println("Enter your email address: ");
                userInput = scanner.nextLine();
                while (userInput.isBlank()) {
                    System.out.println("Enter valid Email Address");
                    userInput = scanner.nextLine();
                }
                cusEmailAddr = userInput;
                System.out.println("you entered: " + cusEmailAddr);
                System.out.println("Enter your Credit Card Number: ");
                userInput = scanner.nextLine();
                while (userInput.isBlank()) {
                    System.out.println("Enter valid Credit Card Number");
                    userInput = scanner.nextLine();
                }
                cusCreditCardNum = userInput;
                System.out.println("you entered: " + cusCreditCardNum);
                System.out.println("Enter your Sweetheart's Name: ");
                userInput = scanner.nextLine();
                while (userInput.isBlank()) {
                    System.out.println("Enter valid Sweet Heart's Name");
                    userInput = scanner.nextLine();
                }
                cusSweetheartName = userInput;
                System.out.println("you entered: " + cusSweetheartName);
                System.out.println("You have entered all the required information!");
                System.out.println();

                System.out.println("Order a song for Valentine’s Day...\n" +
                        "Select the song from this list:\n" +
                        "1 - \"Can't Help Falling in Love\" by Elvis Presley\n" +
                        "2 - \"At Last\" by Etta James\n" +
                        "3 - \"Unchained Melody\" by The Righteous Brothers\n" +
                        "4 - \"Perfect\" by Ed Sheeran\n" +

                        "Your choice (1 – 4):\n");
                userInput = scanner.nextLine();
                switch (userInput) {
                    case "1":
                        System.out.println("You selected: 1 - \"Can't Help Falling in Love\" by Elvis Presley");
                        for (Song s : listOfSongs) {
                            if (s.getName().equals("Can't Help Falling in Love")) {
                                s.addRequest(cusSweetheartName);
                                //System.out.println(s.getRequest());
                            }
                        }
                        break;
                    case "2":
                        System.out.println("You selected: 2 - \"At Last\" by Etta James");
                        for (Song s : listOfSongs) {
                            if (s.getName().equals("At Last")) {
                                s.addRequest(cusSweetheartName);
                                //System.out.println(s.getRequest());
                            }
                        }
                        break;
                    case "3":
                        System.out.println("You selected: 3 - \"Unchained Melody\" by The Righteous Brothers");
                        for (Song s : listOfSongs) {
                            if (s.getName().equals("Unchained Melody")) {
                                s.addRequest(cusSweetheartName);
                                //System.out.println(s.getRequest());
                            }
                        }
                        break;
                    case "4":
                        System.out.println("You selected: 4 - \"Perfect\" by Ed Sheeran");
                        for (Song s : listOfSongs) {
                            if (s.getName().equals("Perfect")) {
                                s.addRequest(cusSweetheartName);
                                //System.out.println(s.getRequest());
                            }
                        }
                        break;
                    default:
                        System.out.println("Enter valid options though 1-4");
                }
                System.out.println("Hit Enter to return to menu");
                userInput = scanner.nextLine();


            } else if (userInput.equals("2")) {
                System.out.println("You selected: Club members – Get a report of requests for your song");
                System.out.println("Please Enter your User ID");
                userInput = scanner.next();
                for (ClubMember person : listOfClubMember) {
                    if (person.getID().equals(userInput)) {
                        person.generateSongReport(listOfSongs);
                    }

                }

            } else if (userInput.equals("3")) {
                System.out.println("You selected: Club members – Report back that your songs are done");
                System.out.println("Please Enter your User ID");
                userInput = scanner.next();
                for (ClubMember person : listOfClubMember) {
                    if (person.getID().equals(userInput)) {
                        System.out.println("Please enter the name of the song you delivered");
                        userInput = scanner.next();
                        for (Song s : listOfSongs) {
                            if (s.getName().contains(userInput)) {
                                if (person.reportSongDelivered(s)) {
                                    System.out.println("Successfully delivered the song");
                                } else {
                                    System.out.println("Failed to deliver the song");
                                }
                            }
                        }
                    }
                }

            } else if (userInput.equals("4")) {
                System.out.println("You selected: Admin - Show data for all club members");
                Admin admin = listOfAdmin.get(0);
                admin.showDataForAllClubMembers(listOfClubMember);


            } else {
                System.out.println("Enter valid options though 1-4");
            }

        }
    }

    private static void initializeList() {
        createClubMembers("david");
        createClubMembers("eric");
        createClubMembers("john");
        createClubMembers("anny");

        Customer newCustomer = new Customer("newCustomer@email.com");
        listOfCustomer.add(newCustomer);

        Song cantHelpFallingInLove = new Song("Can't Help Falling in Love", "Elvis Presley", "david1");
        listOfSongs.add(cantHelpFallingInLove);
        Song atLeast = new Song("At Last", "Etta James", "eric1");
        listOfSongs.add(atLeast);
        Song unchainedMelody = new Song("Unchained Melody", "The Righteous Brothers", "john1");
        listOfSongs.add(unchainedMelody);
        Song perfect = new Song("Perfect", "Ed Sheeran", "anny1");
        listOfSongs.add(perfect);

        listOfAdmin.add(new Admin("admin@email.com"));


        //System.out.println("testing arraylists: " + listOfSongs.toString() + " " + listOfPeople.toString());
    }

    private static void createClubMembers(String name) {
        ClubMember newMember = new ClubMember(name + "@email.com", name + "1");
        listOfClubMember.add(newMember);
    }


    private static void getCustomerInfo(Scanner scanner) {


    }
}