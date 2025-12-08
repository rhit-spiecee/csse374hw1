import java.util.ArrayList;

public class ClubMember extends Person {
    private String id;

    public ClubMember(String emailAddress, String id) {
        super(emailAddress);
        this.id = id;
    }

    public String toString(){
        return "";
    }

    public void generateSongReport(ArrayList<String> requests){
        for (String request : requests) {
            if (request.equals(this.id)) {
                System.out.println(request);
            }
        }
    }

    public void reportSongDelivered(String nameOfSong, String sweetheartName){

    }
}
