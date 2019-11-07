package com.owainlewis.dsa.datastructures.tree;

/**
 * BinaryTreeNode represents a single node in a binary tree
 *
 * @param <T>*
 */
public final class BinaryTreeNode<T extends Comparable<? super T>> {

    private T data;

    private BinaryTreeNode<T> left;

    private BinaryTreeNode<T> right;

    /**
     * Create a BST node with the given data.
     *
     * @param data the value of this node
     */
    public BinaryTreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode<T> getLeft() {
        return this.left;
    }

    public BinaryTreeNode<T> getRight() {
        return this.right;
    }

    public void setLeft(BinaryTreeNode<T> node) {
        this.left = node;
    }

    public void setRight(BinaryTreeNode<T> node) {
        this.right = node;
    }
}
