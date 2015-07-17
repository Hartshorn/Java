package MidLinkedList;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class LnListFunctions {
    
    public Integer findMidEasy(LinkedList<Integer> lnlst)
    {
        int mid = lnlst.size() / 2;
        
        return lnlst.get(mid);
    }
    
    public Integer findMidPointers(LinkedList<Integer> lnlst)
    {
        Integer result = 0;
        
        for (int i = 0, j = 0; j < lnlst.size(); i++, j += 2) {
            
            if (lnlst.get(j) >= lnlst.size()) {
                result = lnlst.get(i);
            }
        }
        return result;
    }
}