package ArrayDuplicates;


public class DupInArray {

    /**
     * Main - demonstrates a method to check 
     * for duplicates in an array of Strings
     **/
    public static void main(String[] args)
    {
        DuplicateFunctions checker = new DuplicateFunctions();
        
        String[] noDup = { "One", "Two", "Three" };
        String[] yesDup = { "One", "Two", "Three", "Three" };
        
        int[] noDupInt = { 1,2,3 };
        int[] yesDupInt = { 1,2,3,4,5,6,7,1,8,9 };
        
        Boolean result1 = checker.checkForDupsStr(noDup);
        Boolean result2 = checker.checkForDupsStr(yesDup);
        
        Boolean result3 = checker.checkForDupsInt(noDupInt);
        Boolean result4 = checker.checkForDupsInt(yesDupInt);
        
        System.out.println("result1 has dup? "   + result1 + 
                           "\nresult2 has dup? " + result2);
        
        System.out.println("result3 has dup? "   + result3 + 
                           "\nresult4 has dup? " + result4);
    }
}