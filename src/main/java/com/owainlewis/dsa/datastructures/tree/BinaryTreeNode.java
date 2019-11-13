package com.owainlewis.dsa.datastructures.tree;

public interface BinaryTreeNode<T> {
    /** Returns the data stored in this node. */
    T getData();

    /** Set the data stored in this node. */
    void setData(T data);

    /** Returns the parent of this node, or null if this node is a root. */
    BinaryTreeNode<T> getParent();

    /** Returns the left child of this node, or null if it does not have one. */
    BinaryTreeNode<T> getLeft();

    /**
     * Removes child from its current parent and inserts it as the left child of this node. If this
     * node already has a left child it is removed.
     *
     * @exception IllegalArgumentException if the child is an ancestor of this node, since that
     *     would make a cycle in the tree.
     */
    void setLeft(BinaryTreeNode<T> child);

    /** Returns the right child of this node, or null if it does not have one. */
    BinaryTreeNode<T> getRight();

    /**
     * Removes child from its current parent and inserts it as the right child of this node. If this
     * node already has a right child it is removed.
     *
     * @exception IllegalArgumentException if the child is an ancestor of this node, since that
     *     would make a cycle in the tree.
     */
    void setRight(BinaryTreeNode<T> child);

    /**
     * Removes this node, and all its descendants, from whatever tree it is in. Does nothing if this
     * node is a root.
     */
    void remove();
}
