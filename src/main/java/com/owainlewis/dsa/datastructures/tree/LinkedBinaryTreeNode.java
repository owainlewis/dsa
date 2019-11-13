package com.owainlewis.dsa.datastructures.tree;

public final class LinkedBinaryTreeNode<T> implements BinaryTreeNode<T> {
    private T data;
    private LinkedBinaryTreeNode<T> parent;
    private LinkedBinaryTreeNode<T> left;
    private LinkedBinaryTreeNode<T> right;

    LinkedBinaryTreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode<T> getParent() {
        return this.parent;
    }

    public BinaryTreeNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(BinaryTreeNode<T> child) {
        for (LinkedBinaryTreeNode<T> n = this; n != null; n = n.parent) {
            if (n == child) {
                throw new IllegalArgumentException();
            }
        }
        LinkedBinaryTreeNode<T> childNode = (LinkedBinaryTreeNode<T>) child;
        if (this.left != null) {
            left.parent = null;
        }
        if (childNode != null) {
            childNode.remove();
            childNode.parent = this;
        }
        this.left = childNode;
    }

    public BinaryTreeNode<T> getRight() {
        return null;
    }

    public void setRight(BinaryTreeNode<T> child) {
        // Ensure the child is not an ancestor.
        for (LinkedBinaryTreeNode<T> n = this; n != null; n = n.parent) {
            if (n == child) {
                throw new IllegalArgumentException();
            }
        }
        LinkedBinaryTreeNode<T> childNode = (LinkedBinaryTreeNode<T>) child;
        if (right != null) {
            right.parent = null;
        }
        if (childNode != null) {
            childNode.remove();
            childNode.parent = this;
        }
        this.right = childNode;
    }

    public void remove() {
        if (parent != null) {
            if (parent.left == this) {
                parent.left = null;
            } else if (parent.right == this) {
                parent.right = null;
            }
            this.parent = null;
        }
    }
}
