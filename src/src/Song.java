import java.util.ArrayList;

public class Song {
    private final String name;
    private final String artist;
    private ArrayList<Order> requests;
    public String memberId;
    private boolean isBeingSung;

    public Song(String name, String artist, String memberId) {
        this.name = name;
        this.artist = artist;
        this.memberId = memberId;
        this.requests = new ArrayList<>();
        this.isBeingSung = false;
    }

    public void addRequest(Order newOrder) {
        this.requests.add(newOrder);
    }

    public void clearRequests() {
        this.requests.clear();
        this.isBeingSung = false;
    }

    public void updateIsBeingSung() {
        this.isBeingSung = true;
    }

    public String getName() {
        return this.name;
    }

    public String getRequest() {
        return this.requests.toString();
    }

    @Override
    public String toString(){
        return this.name + " by " + this.artist + ": singing to " + getRequest();
    }
}
