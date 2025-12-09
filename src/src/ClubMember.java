import java.util.ArrayList;
import java.util.Objects;

public class ClubMember extends Person {
    private String id;

    public ClubMember(String emailAddress, String id) {
        super(emailAddress);
        this.id = id;
    }

    public String toString(){
        return "Email: " + super.getEmail() + " ID: " + this.id;
    }

    public void generateSongReport(ArrayList<Song> songs) {
        for (Song song : songs) {
            if(Objects.equals(song.memberId, this.id)){
                System.out.println(song.toString());
                song.updateIsBeingSung();
            }
        }
    }

    public boolean reportSongDelivered(Song song){
        song.clearRequests();
        return true;
    }

    public String  getID() {
        return this.id;
    }
}
