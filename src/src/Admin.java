import java.util.ArrayList;

public class Admin extends Person {
    public Admin(String emailAddress) {
        super(emailAddress);
    }

    public void showDataForAllClubMembers(ArrayList<ClubMember> listOfClubMember){
        for (ClubMember cm : listOfClubMember) {
            System.out.println(cm.toString());
        }
    }
}
