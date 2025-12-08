import java.util.ArrayList;

public class Admin extends Person {
    public Admin(String emailAddress) {
        super(emailAddress);
    }

    public void showDataForAllClubMembers(ArrayList<Person> listOfPeople){
        for (Person p : listOfPeople) {
            if (p instanceof ClubMember clubMember) {
                System.out.println(clubMember.toString());
            }
        }
    }
}
