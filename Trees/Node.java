package Trees;

/**
 * A class representing a node on a binary tree.  Each node has left and right
 * branches for values greather than or less than the stored value.
 **/
public class Node {
    
    Integer value       = null;
    Node    leftBranch  = null;
    Node    rightBranch = null;
    
    
    /**
     * Default and defined constructors
     **/
    public Node() {}
    public Node(Integer n) { this.value = n; }
    
    
    /**
     * Simple getters and setters
     **/
    public void setValue(Integer v) { this.value = v; }
    
    public Integer    getValue() { return this.value;       }
    public Node getRightBranch() { return this.rightBranch; }
    public Node  getLeftBranch() { return this.leftBranch;  }
    
    
    /**
     * setLeftBranch() takes a Node as a parameter and either sets it to the
     * current branch, or attempts to set the node of the current branch.
     * @param Node n
     **/
    public void setLeftBranch(Node n)
    {
        if (n.getValue() > this.value) {
            
            if (this.rightBranch != null) {
                
                this.rightBranch.setRightBranch(n);
                
            } else {
                
                this.rightBranch = n;
            }
        } else {
            
            if (this.leftBranch != null) {
                
                this.leftBranch.setLeftBranch(n);
                
            } else {
                
            this.leftBranch = n;
            }
        }
    }
    
    
    /**
     * setRightBranch() takes a Node as a parameter and either sets it to the
     * current branch, or attempts to set the node of the current branch.
     * @param Node n
     **/
    public void setRightBranch(Node n)
    {
        if (n.getValue() > this.value) {
            
            if (this.rightBranch != null) {
                
                this.rightBranch.setRightBranch(n);
                
            } else {
                
                this.rightBranch = n;
                
            }
            
        } else {
            
            if (this.leftBranch != null) {
                
                this.leftBranch.setLeftBranch(n);
                
            } else {
                
                this.leftBranch = n;
            }
        }
    }
    
    
    /**
     * A print method for Nodes - allows for simple viewing of the tree layout
     **/
    public void printNode()
    {
        if (this.value == null) {
            
            System.out.println("null");
            
        } else {
            
            System.out.printf("Value: %d\n", this.value);
            
            if (this.leftBranch == null) {
                
                System.out.print("L: null\n");
                
            } else {
                
                this.leftBranch.printNode();
                
            }
            if (this.rightBranch == null) {
                
                System.out.print("R: null\n");
                
            }else {
                
                this.rightBranch.printNode();
            }
        }
    }
    
    
    /**
     * find() will look at the value of this node and any branches it contains
     * recursing down if possible.
     * @param Integer n
     * @return Node n
     **/
    public Node find(Integer n)
    {
        Node ret = new Node();
        
        if (this.value == n) {
            
            ret = this;
            
        } else {
            
            if (n > this.value) {
                
                if (this.rightBranch != null) {
                    
                    this.rightBranch.find(n);
                    
                } else {
                    
                    return ret;
                }
            } else {
                
                if (this.leftBranch != null) {
                    
                    this.leftBranch.find(n);
                    
                } else {
                    
                    return ret;
                }
            }
        }
        return ret;
    }
}