import java.util.ArrayList;
import java.util.Objects;

public class ClubMember extends Person {
    private String id;

    public ClubMember(String emailAddress, String id) {
        super(emailAddress);
        this.id = id;
    }

    public String toString(){
        return "";
    }

    public void generateSongReport(ArrayList<Song> songs) {
        for (Song song : songs) {
            if(Objects.equals(song.memberId, this.id)){
                System.out.println(song.toString());
                song.updateIsBeingSung();
            }
        }
    }

    public void reportSongDelivered(Song song){
        song.clearRequests();
    }

    public String  getID() {
        return this.id;
    }
}
