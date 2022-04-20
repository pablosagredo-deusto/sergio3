package donations.server;

import donations.serialization.User;

import java.util.ArrayList;
import java.util.List;


public class DonationCollector {

   protected List<User> listUser = new ArrayList<>();
   protected User user1 = new User("sergio", "1234");
   protected User user2 = new User("pablo", "1234");

    listUser.add(new User("sergio", "1234"));

    private static boolean check = false;
    //here is proccessed info on methods
    public boolean login(String username, String password) {
        synchronized(this) {
                System.out.println("entered in donation collector login method");


                return true;
        }
    }

    public User getUserInfo() {
        User user = new User("prueba","sergio");
        return user;
    }
}