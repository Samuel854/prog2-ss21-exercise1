import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CheckPasswordTest {

    @BeforeAll
    static void init(){}

    @BeforeEach
    void setUp(){}

    @Test
    void validPassword1_Length(){ //Length should be >= 8.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Length("Helloworld");
        assertTrue(actual);

    }

    @Test
    void validPassword1_Too_Long(){ //Length over 25 characters.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Length("HelloworldBlablablbalbalablabala");
        assertFalse(actual);

    }

    @Test
    void validPassword1_Not_Too_Long(){ //Password is not too long/ > 25.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Length("Helloworld");
        assertTrue(actual);

    }

    @Test
    void validPassword1_Not_Too_Short(){ //Password is too short/ < 8.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Length("Helloworld124#");
        assertTrue(actual);

    }

    @Test
    void validPassword1_Too_Short(){ //Password is too short/ < 8.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Length("Hello1#");
        assertFalse(actual);

    }

    @Test
    void validPassword1_Number_Digit(){ //Password needs at least one Digit/Number.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Digit("Helloworld124#");
        assertTrue(actual);

    }

    @Test
    void validPassword1_No_Number_Digit(){ //Password needs at least one Digit/Number.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Digit("Helloworld#");
        assertFalse(actual);

    }

    @Test
    void validPassword3_Uppercase() { //Uppercase?
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Upper("Helloworld124#");
        assertTrue(actual);
    }

    @Test
    void validPassword3_No_Uppercase() { //Uppercase?
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Upper("helloworld124#");
        assertFalse(actual);
    }

    @Test
    void validPassword5_LowerCase() { //Lowercase?
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Lower("Helloworld124#");
        assertTrue(actual);
    }

    @Test
    void validPassword5_No_LowerCase() { //Lowercase?
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Lower("HELLOWORLD124#");
        assertFalse(actual);
    }

    @Test
    void validPassword6_Special_Characters() { //Use of given special characters.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Special("Helloworld124#");
        assertTrue(actual);
    }

    @Test
    void validPassword6_No_Special_Characters() { //Use of given special characters.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Special("Helloworld");
        assertFalse(actual);
    }

    @Test
    void validPassword6_Forbidden_Special_Characters() { //Use of given special characters.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_No_Special("Helloworld124+");
        assertTrue(actual);
    }

    @Test
    void validPassword6_No_Number_Order() { //Use of given special characters.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Order("Helloworld124#");
        assertTrue(actual);
    }

    @Test
    void validPassword6_Number_Order() { //Use of given special characters.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Order("Helloworld456#");
        assertFalse(actual);
    }

    @Test
    void validPassword6_Number_Row() { //Use of given special characters.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Row("Helloworld4444#");
        assertFalse(actual);
    }

    @Test
    void validPassword6_No_Number_Row() { //Use of given special characters.
        CheckPassword checkPassword = new CheckPassword();
        boolean actual = checkPassword.validPassword_Row("Helloworld444#");
        assertTrue(actual);
    }




// https://users.csc.calpoly.edu/~djanzen/courses/405W13/presentations/tdd.pdf
// https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/
// https://www.agilealliance.org/glossary/tdd#q=~(infinite~false~filters~(postType~(~'page~'post~'aa_book~'aa_event_session~'aa_experience_report~'aa_glossary~'aa_research_paper~'aa_video)~tags~(~'tdd))~searchTerm~'~sort~false~sortDirection~'asc~page~1)
// http://www.luv2code.com/category/test-driven-development/page/2/
// https://www.geeksforgeeks.org/program-to-check-the-validity-of-a-password/
// https://stackoverflow.com/questions/42967934/java-regex-to-not-allow-string-special-characters
// https://stackoverflow.com/questions/17715388/regex-java-matching-strings-012123234345456567678789890


}
