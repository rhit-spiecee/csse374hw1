public class Order {
    private String emailAddress;
    private String creditCardNumber;
    private String sweetHeartName;
    private String songName;

    public Order(String emailAddress, String creditCardNumber, String sweetHeartName, String songName) {
        this.emailAddress = emailAddress;
        this.creditCardNumber = creditCardNumber;
        this.sweetHeartName = sweetHeartName;
        this.songName = songName;
    }

    public void orderSong(Song song){

    }

    @Override
    public String toString() {
        return "Order: " + "Email Address: " + emailAddress + ", Credit Card Number: " + creditCardNumber + ", Sweetheart Name: " + sweetHeartName;
    }
}
