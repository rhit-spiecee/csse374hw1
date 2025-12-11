import java.util.ArrayList;

public class Admin {
    private String emailAddress;

    public Admin(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void showDataForAllClubMembers(ArrayList<ClubMember> listOfClubMember){
        for (ClubMember cm : listOfClubMember) {
            System.out.println(cm.toString());
        }
    }
}
