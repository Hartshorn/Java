package Trees;

/**
 * Generic Tree interface - can be used to create a tree (e.g. binary tree)
 **/
public interface Tree<T> {
    
    Boolean addValue(T t);
    Boolean hasValue(T t);
    int size();
}