package ArrayDuplicates;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayDuplicatesTest {
    
    @Test
    public void testDupString() {
        
        DuplicateFunctions testChecker = new DuplicateFunctions();
        
        String[] testNoDup = { "One", "Two", "Three" };
        String[] testYesDup = { "One", "Two", "Three", "One" };
        
        Boolean testResultNoDup = testChecker.checkForDupsStr(testNoDup);
        Boolean testResultYesDup = testChecker.checkForDupsStr(testYesDup);
        
        assertTrue(testResultNoDup);
        assertFalse(testResultYesDup);
    }
}