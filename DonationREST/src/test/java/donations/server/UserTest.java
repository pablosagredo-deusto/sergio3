package donations.server;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import donations.serialization.User;


public class UserTest {

    private DonationCollector donationCollector;
    private User user;

    @Before
    public void setUp() {

        donationCollector = new DonationCollector();
        user =new User();
    }

    @Test
    public void testEmptyDonation() {
        User user=donationCollector.getUserInfo();
        assertEquals("",user.getUsername());
        assertEquals("",user.getPassword());
    }
}