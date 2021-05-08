import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class UtilitiesTest {


    @Test
    public void validPPS() {
        assertTrue(Utilities.validPPS(("1234567ab")));    // normal
        assertTrue(Utilities.validPPS(("1234567AB")));    // checking different incorrect positions
        assertFalse(Utilities.validPPS(("1234567ab1")));
        assertFalse(Utilities.validPPS(("a234567ab")));
        assertFalse(Utilities.validPPS(("1a34567ab")));
        assertFalse(Utilities.validPPS(("12a4567ab")));
        assertFalse(Utilities.validPPS(("123a567ab")));
        assertFalse(Utilities.validPPS(("1234a67ab")));
        assertFalse(Utilities.validPPS(("12345a7ab")));
        assertFalse(Utilities.validPPS(("123456aab")));
        assertFalse(Utilities.validPPS(("12345671b")));
        assertFalse(Utilities.validPPS(("1234567a1")));
    }

    @Test
    public void max10Chars() {
        assertTrue( Utilities.max10Chars("1234567890"));  //normal
        assertFalse(Utilities.max10Chars("1234567890-123"));  //abnormal
        assertTrue(Utilities.max10Chars(""));  //normal but unusual
    }
    @Test
    public void max30Chars() {
        assertTrue( Utilities.max30Chars("123456789012345678901234567890"));  //normal
        assertFalse(Utilities.max30Chars("123456789012345678901234567890-123"));  //abnormal
        assertTrue(Utilities.max30Chars(""));  //normal but unusual
    }


    @Test
    public void validIntRange() {
        assertTrue(Utilities.validIntRange(1, 10, 5));
        assertTrue(Utilities.validIntRange(1, 10, 1));
        assertTrue(Utilities.validIntRange(1, 10, 10));
        assertFalse(Utilities.validIntRange(1, 10, 0));
        assertFalse(Utilities.validIntRange(1, 10, 11));

    }

    @Test
    public void validLecturerLevel() {
        assertTrue(Utilities.validLecturerLevel(1));
        assertTrue(Utilities.validLecturerLevel(2));
        assertTrue(Utilities.validLecturerLevel(3));
        assertFalse(Utilities.validLecturerLevel(0));
        assertFalse(Utilities.validLecturerLevel(11));

    }

    @Test
    public void validMangerLevel() {
        assertTrue(Utilities.validMangerLevel(1));
        assertTrue(Utilities.validMangerLevel(4));
        assertTrue(Utilities.validMangerLevel(7));
        assertFalse(Utilities.validMangerLevel(0));
        assertFalse(Utilities.validMangerLevel(11));

    }

    @Test
    public void validAdminLevel() {
        assertTrue(Utilities.validAdminLevel(1));
        assertTrue(Utilities.validAdminLevel(4));
        assertTrue(Utilities.validAdminLevel(2));
        assertFalse(Utilities.validAdminLevel(0));
        assertFalse(Utilities.validAdminLevel(11));

    }

    @Test
    public void validIntNonNegative() {
        assertTrue(Utilities.validIntNonNegative(0));
        assertTrue(Utilities.validIntNonNegative(1));
        assertTrue(Utilities.validIntNonNegative(1000));
        assertFalse(Utilities.validIntNonNegative(-1));


    }

    @Test
    public void validDoubleNonNegative() {
        assertTrue(Utilities.validDoubleNonNegative(0));
        assertTrue(Utilities.validDoubleNonNegative(1));
        assertTrue(Utilities.validDoubleNonNegative(1000));
        assertFalse(Utilities.validDoubleNonNegative(-1));


    }

    @Test
    public void validIndex() {
        ArrayList<String> newName = new ArrayList<String>();
        newName.add("Mairead");
        newName.add("Jack");
        newName.add("Cathal");
        assertTrue(Utilities.validIndex(1, newName));
        assertTrue(Utilities.validIndex(2, newName));
        assertTrue(Utilities.validIndex(0, newName));
        assertFalse(Utilities.validIndex(11, newName));
        assertFalse(Utilities.validIndex(-1, newName));

    }

    public void getSalaryForLecturerLevel() {
        assertEquals(1000, Utilities.getSalaryForLecturerLevel(1), .01);
        assertEquals(2000, Utilities.getSalaryForLecturerLevel(2), .01);
        assertEquals(3000, Utilities.getSalaryForLecturerLevel(3), .01);
        assertEquals(-1, Utilities.getSalaryForLecturerLevel(0), .01);
        assertEquals(-1, Utilities.getSalaryForLecturerLevel(4), .01);

    }

    public void getSalaryForAdminGrade() {
        assertEquals(700, Utilities.getSalaryForAdminGrade(1), .01);
        assertEquals(1400, Utilities.getSalaryForAdminGrade(2), .01);
        assertEquals(2100, Utilities.getSalaryForAdminGrade(3), .01);
        assertEquals(-1, Utilities.getSalaryForAdminGrade(0), .01);
        assertEquals(-1, Utilities.getSalaryForAdminGrade(4), .01);

    }
}
