public class Person {

    private String emailAddress;

    public Person(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    protected String getEmail() {
        return this.emailAddress;
    }
}
