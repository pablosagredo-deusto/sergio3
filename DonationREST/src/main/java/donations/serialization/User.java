package donations.serialization;

public class User {
    private String name;
    private String lastName;
    private String username;
    private String password;
    private String adress;
    private String cardNumber;
    private String phoneNumber;


    public User(String name, String lastName, String username, String password, String adress, String cardNumber, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.adress = adress;
        this.cardNumber = cardNumber;
        this.phoneNumber = phoneNumber;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
        this.name = "";
        this.lastName = "";
        this.username = "";
        this.password = "";
        this.adress = "";
        this.cardNumber = "";
        this.phoneNumber = "";
    }



    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
