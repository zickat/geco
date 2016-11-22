package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by benjidu11 on 21/11/2016.
 */
public class LoginGeneratorTest {

    private LoginGenerator aLoginGenerator;

    @Before
    public void setUp() throws Exception {
        String[] start = new String[]{ "JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"};
        aLoginGenerator = new LoginGenerator(new LoginService(start));
    }

    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals("PDUR",login);
    }

    @Test
    public void generateLoginForJRAL2() throws Exception {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertEquals("JRAL2",login);
    }

    @Test
    public void loginPDUR2() {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertEquals("PDUR",login);
    }

    @Test
    public void loginJROLNumber() {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertEquals("JROL1",login);
    }

}