import java.util.ArrayList;

public class Song {
    private String name;
    private String artist;
    private ArrayList<String> requests;
    private int memberId;

    public Song(String name, String artist, int memberId) {
        this.name = name;
        this.artist = artist;
        this.memberId = memberId;
        requests = new ArrayList<>();
    }

    public void addRequest(String sweetheartName) {
        requests.add(sweetheartName);
    }
}
