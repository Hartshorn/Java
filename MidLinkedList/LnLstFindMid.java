package MidLinkedList;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class LnLstFindMid {
    
    public static void main(String[] args)
    {
        LnListFunctions midFinder = new LnListFunctions();
        
        LinkedList<Integer> lnlst = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
        
        Integer midEasy = midFinder.findMidEasy(lnlst);
        Integer midPointer = midFinder.findMidPointers(lnlst);
        
        System.out.println("The mid of lnlst: " + midEasy);
        
        System.out.println("The mid of lnlst: " + midPointer);
    }
}