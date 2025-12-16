import java.util.ArrayList;

//Written by Ethan

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
