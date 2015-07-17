package Trees;

/**
 * A binary tree class - constructs a tree containing Nodes
 * including the size of the tree
 **/
public class BinaryTree implements Tree<Integer> {
    
    int size = 0;
    Node root = null;
    
    /**
     * addValue(Integer n) will put a new Node on the tree containing
     * the value n. If there is no root, it will create one, otherwise
     * it will begin adding down the left or right branches.
     * @param Integer n
     * @return Boolean success
     **/
    @Override
    public Boolean addValue(Integer n)
    {
        if (this.size != 0) {
            
            Node new_node = new Node(n);
            
            this.size += 1;
            
            if (n > this.root.getValue()) {
                
                this.root.setRightBranch(new_node);
                
            } else {
                
                this.root.setLeftBranch(new_node);
            }
        } else {
            
            this.root = new Node(n);
            this.size+= 1;
        }
        return false;
    }
    
    
    /**
     * hasValue() will return true if the value n exists in the tree.
     * @param Integer n
     * @return Boolean success
     **/
    @Override
    public Boolean hasValue(Integer n)
    {
        if (size > 0) {
            
            return (this.root.getValue() == n) ? 
                true : 
                this.root.rightBranch.find(n).getValue() != null ||
                this.root.leftBranch.find(n).getValue()  != null;
                
        } else {
            
            return false;
        }
    }
    
    
    /**
     * size() will return the value of the size variable, which is increased
     * as new nodes are added.
     **/
    @Override
    public int size()
    {
        return size;
    }
    
    public void printTree()
    {
        if (root != null) {
            
            this.root.printNode();
            
        } else {
            
            System.out.printf("Empty Tree!\n");
        }
    }
}