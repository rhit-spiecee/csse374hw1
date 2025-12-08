import java.util.ArrayList;

public class Song {
    private final String name;
    private final String artist;
    private ArrayList<String> requests;
    public String memberId;
    private boolean isBeingSung;

    public Song(String name, String artist, String memberId) {
        this.name = name;
        this.artist = artist;
        this.memberId = memberId;
        this.requests = new ArrayList<>();
        this.isBeingSung = false;
    }

    public void addRequest(String sweetheartName) {
        this.requests.add(sweetheartName);
    }

    public void clearRequests() {
        this.requests.clear();
        this.isBeingSung = false;
    }
}
