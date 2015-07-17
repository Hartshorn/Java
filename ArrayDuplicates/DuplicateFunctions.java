package ArrayDuplicates;

import java.util.Set;
import java.util.HashSet;

/**
 * These functions can be used to find duplicates in arrays of specified type
 **/
public class DuplicateFunctions {
        
    /**
     * checkForDupsStr() - a method that takes a String array and checks
     * it for duplicate entries.
     * @param String[] s
     * @return Boolean b
     **/
    public Boolean checkForDupsStr(String[] input)
    {
        for (int i = 0; i < input.length; i++) {
            
            for (int j = 0; j < input.length; j++) {
                
                if (input[i].equals(input[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
    /**
     * checkForDupsInt() - a method that takes an int array and 
     * checks for duplicate enteries by attempting to add values to
     * a Set, which only allows unique values.
     * @param int[] i
     * @return Boolean b
     **/
    public Boolean checkForDupsInt(int[] input)
    {
        Set<Integer> hold = new HashSet<>();
        
        for (int i: input) {
            
            if (!hold.add(i)) { // false if value already in set
            
                return true;
            }
        }
        return false;
    }
}