import java.util.ArrayList;

public class Song {
    private final String name;
    private final String artist;
    private ArrayList<Order> requests;
    private boolean isBeingSung;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
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
    public String toString() {
        if (!requests.isEmpty()) {
            return this.name + " by " + this.artist + ": singing to " + getRequest();
        }else{
            return "No Requests Found for " + this.name + " by " + this.artist;
        }
    }
}
