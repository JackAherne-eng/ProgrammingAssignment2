import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Test Class for the Lecturer class
 * @author Siobhan Drohan & Mairead Meagher
 * @version 11/20
 */
public class AdminWorkerTest {
    private AdminWorker AdminWorkerValid, AdminWorkerInvalid;

    @Before
    public void setUp() throws Exception {
        AdminWorkerValid = new AdminWorker("Jim", "Pickens", "1234567pp", 5);
        AdminWorkerInvalid = new AdminWorker("Mr.", "Men", "12xx567ooo", 8);
    }

    @Test
    public void testConstructor() {
        assertEquals(5, AdminWorkerValid.getGrade());
        assertEquals(1, AdminWorkerInvalid.getGrade());
    }

    @Test
    public void setGrade() {
        assertEquals(5, AdminWorkerValid.getGrade());
        AdminWorkerValid.setGrade(5);
        assertEquals(5, AdminWorkerValid.getGrade());
        AdminWorkerValid.setGrade(8);
        assertEquals(5, AdminWorkerValid.getGrade());
        AdminWorkerValid.setGrade(4);
        assertEquals(4, AdminWorkerValid.getGrade());
        AdminWorkerValid.setGrade(8);
        assertEquals(4, AdminWorkerValid.getGrade(), 0.01);
    }

    @Test
    public void calculateSalary() {
        assertEquals(3700, AdminWorkerValid.calculateSalary(), 0.01);
        assertEquals(900, AdminWorkerInvalid.calculateSalary(), 0.01);
    }

    @Test
    public void testEquals() {
        assertTrue(AdminWorkerValid.equals(AdminWorkerValid));
        AdminWorker otherAdminWorker = new AdminWorker("Jim", "Pickens", "1234567pp", 5);
        assertTrue(AdminWorkerValid.equals(otherAdminWorker));
        otherAdminWorker.setGrade(1);
        assertFalse(AdminWorkerValid.equals(otherAdminWorker));
    }

    @Test
    public void testToString() {
        assertTrue(AdminWorkerValid.toString().contains("Jim"));
        assertTrue(AdminWorkerValid.toString().contains("1234567pp"));
        assertTrue(AdminWorkerValid.toString().contains("5"));

    }
}