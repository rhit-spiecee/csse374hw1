import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Mainly written by Seokhyun

public class Main {
    private static ArrayList<ClubMember> listOfClubMember = new ArrayList<ClubMember>();
    private static ArrayList<Admin> listOfAdmin = new ArrayList<Admin>();
    private static ArrayList<Song> listOfSongs = new ArrayList<Song>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mainLoopRunning = true;

        //initializing clubmembers into list of person to associate with song that they are singing
        //initializing options of songs and associating it with the memeber who sings the song.
        initializeList();

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


                System.out.println("Order a song for Valentine’s Day...\n" +
                        "Select the song from this list:\n" +
                        "1 - \"Can't Help Falling in Love\" by Elvis Presley\n" +
                        "2 - \"At Last\" by Etta James\n" +
                        "3 - \"Unchained Melody\" by The Righteous Brothers\n" +
                        "4 - \"Perfect\" by Ed Sheeran\n" +

                        "Your choice (1 – 4):\n");
                userInput = scanner.nextLine();
                String selectedSongName = "";
                String selectedSongArtist = "";
                String selectedNum = "";
                boolean userInputIsValid = false;
                while (!userInputIsValid) {
                    userInputIsValid = true;
                    switch (userInput) {
                        case "1":
                            selectedSongName = "Can't Help Falling in Love";
                            selectedSongArtist = "Elvis Presley";
                            selectedNum = "1";
                            break;
                        case "2":
                            selectedSongName = "At Last";
                            selectedSongArtist = "Etta James";
                            selectedNum = "2";
                            break;
                        case "3":
                            selectedSongName = "Unchained Melody";
                            selectedSongArtist = "The Righteous Brothers";
                            selectedNum = "3";
                            break;
                        case "4":
                            selectedSongName = "Perfect";
                            selectedSongArtist = "Ed Sheeran";
                            selectedNum = "4";
                            break;
                        default:
                            userInputIsValid = false;
                            System.out.println("Enter valid options though 1-4");
                            userInput = scanner.next();
                    }
                }
                System.out.println("You selected: " + selectedNum + " - \"" + selectedSongName + " \" by " + selectedSongArtist);
                for (Song s : listOfSongs) {
                    if (s.getName().equals("Can't Help Falling in Love")) {
                        if(!s.getIsBeingSung()){
                            s.addRequest(new Order(cusEmailAddr, cusCreditCardNum, cusSweetheartName, selectedSongName));
                        }else{
                            System.out.println("Song unavailable for purchase");
                        }
                        System.out.println(s.getRequest());
                    }
                }
                System.out.println("customer order success, going back to main...");
                System.out.println("_____________________________________________");


            } else if (userInput.equals("2")) {
                System.out.println("You selected: Club members – Get a report of requests for your song");
                System.out.println("Please Enter your User ID");
                boolean userIDIsValid = false;
                while(!userIDIsValid) {
                    userInput = scanner.next();
//                    System.out.println(userInput + " club memebers" + listOfClubMember );
                    for (ClubMember person : listOfClubMember) {
                        if (person.getID().equals(userInput)) {
                            person.generateSongReport();
                            userIDIsValid = true;
                            break;
                        }
                    }
                    if (!userIDIsValid){
                        System.out.println("Please Enter Valid User ID");
                        userIDIsValid = false;
                    }
                }
                System.out.println("Request report generated, going back to main...");
                System.out.println("_____________________________________________");

            } else if (userInput.equals("3")) {
                System.out.println("You selected: Club members – Report back that your songs are done");
                System.out.println("Please Enter your User ID");
                userInput = scanner.next();
                for (ClubMember person : listOfClubMember) {
                    if (person.getID().equals(userInput)) {
                        if(person.reportSongDelivered()){
                            System.out.println("Successfully delivered song");
                        }else{
                            System.out.println("Failed to deliver song");
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



        Song cantHelpFallingInLove = new Song("Can't Help Falling in Love", "Elvis Presley");
        listOfSongs.add(cantHelpFallingInLove);
        Song atLast = new Song("At Last", "Etta James");
        listOfSongs.add(atLast);
        Song unchainedMelody = new Song("Unchained Melody", "The Righteous Brothers");
        listOfSongs.add(unchainedMelody);
        Song perfect = new Song("Perfect", "Ed Sheeran");
        listOfSongs.add(perfect);

        createClubMembers("david", cantHelpFallingInLove);
        createClubMembers("eric", atLast);
        createClubMembers("john", unchainedMelody);
        createClubMembers("anny", perfect);
        listOfAdmin.add(new Admin("admin@email.com"));


        //System.out.println("testing arraylists: " + listOfSongs.toString() + " " + listOfPeople.toString());
    }

    private static void createClubMembers(String name, Song song) {
        ClubMember newMember = new ClubMember(name + "@email.com", name + "1", song);
        listOfClubMember.add(newMember);
    }
}