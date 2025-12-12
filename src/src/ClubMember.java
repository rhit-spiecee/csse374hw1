import java.util.ArrayList;
import java.util.Objects;

public class ClubMember{
    private String id;
    private String emailAddress;
    private Song song;

    public ClubMember(String emailAddress, String id, Song song) {
        this.emailAddress = emailAddress;
        this.id = id;
        this.song = song;
    }

    public String toString(){
        return "Email: " + this.emailAddress + " ID: " + this.id + " Song Info: " + song.toString();
    }

    public void generateSongReport() {
        System.out.println(this.song.toString());
    }

    public boolean reportSongDelivered(){
        if (this.song.getRequest().isBlank()){
            return false;
        }
        this.song.clearRequests();
        System.out.println("Credit cards charged and emails sent");
        return true;
    }

    public String  getID() {
        return this.id;
    }
}
