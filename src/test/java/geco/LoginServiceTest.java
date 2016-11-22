package geco;

<<<<<<< HEAD
import org.junit.Assert;
=======
>>>>>>> 9688ac8c5f5f2a8474d92c7a932ba907ef448552
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
<<<<<<< HEAD
 * Created by benjidu11 on 21/11/2016.
 */
public class LoginServiceTest {
=======
 * Created by valen on 21/11/2016.
 */
public class LoginServiceTest {

>>>>>>> 9688ac8c5f5f2a8474d92c7a932ba907ef448552
    private static final String ANEM = "ANEM";
    private static final String ABIL = "ABIL";
    private LoginService ls;

    @Before
    public void setUp() throws Exception {
        String[] start = new String[1];
        start[0] = ANEM;
        ls = new LoginService(start);
    }

    @Test
    public void loginExists() throws Exception {
        boolean res = ls.loginExists(ANEM);
<<<<<<< HEAD
        Assert.assertTrue(res);
        res = ls.loginExists(ABIL);
        Assert.assertFalse(res);
=======
        assertTrue(res);
        res = ls.loginExists(ABIL);
        assertFalse(res);
>>>>>>> 9688ac8c5f5f2a8474d92c7a932ba907ef448552
    }

    @Test
    public void addLogin() throws Exception {
        ls.addLogin("AAA");
        ls.addLogin("AAA");
        List<String> allLogins = ls.findAllLogins();
<<<<<<< HEAD
        Assert.assertEquals(3, allLogins.size());
=======
        assertEquals(3, allLogins.size());
>>>>>>> 9688ac8c5f5f2a8474d92c7a932ba907ef448552
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        List<String> allLogins = ls.findAllLoginsStartingWith("A");
<<<<<<< HEAD
        Assert.assertEquals(1,allLogins.size());
        ls.addLogin("AAA");
        allLogins = ls.findAllLoginsStartingWith("A");
        assertEquals(2,allLogins.size());
        allLogins = ls.findAllLoginsStartingWith("B");
        assertEquals(0,allLogins.size());
=======
        assertEquals(1, allLogins.size());
        ls.addLogin("AAA");
        allLogins = ls.findAllLoginsStartingWith("A");
        assertEquals(2, allLogins.size());
        allLogins = ls.findAllLoginsStartingWith("B");
        assertEquals(0, allLogins.size());
>>>>>>> 9688ac8c5f5f2a8474d92c7a932ba907ef448552
    }

    @Test
    public void findAllLogins() throws Exception {
        List<String> allLogins = ls.findAllLogins();
<<<<<<< HEAD
        assertEquals(1,allLogins.size());
        ls.addLogin("AAA");
        allLogins = ls.findAllLogins();
        assertEquals(2,allLogins.size());
=======
        assertEquals(1, allLogins.size());
        ls.addLogin("AAA");
        allLogins = ls.findAllLogins();
        assertEquals(2, allLogins.size());
>>>>>>> 9688ac8c5f5f2a8474d92c7a932ba907ef448552
    }

}