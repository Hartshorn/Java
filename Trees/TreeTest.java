package Trees;

public class TreeTest {
    
    /**
     * A main method to test the BinaryTree class.
     **/
    public static void main(String[] args)
    {
        BinaryTree biTree = new BinaryTree();
        
        biTree.addValue(1);
        biTree.addValue(2);
        biTree.addValue(100);
        biTree.addValue(3);
        
        biTree.printTree();
        System.out.println("Size: " + biTree.size());
        
        Boolean ret = biTree.hasValue(100);
        
        System.out.println("has 100? " + ret);
        
    }
}