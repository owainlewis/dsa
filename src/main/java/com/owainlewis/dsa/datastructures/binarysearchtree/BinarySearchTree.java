package com.owainlewis.dsa.datastructures.binarysearchtree;

import java.util.Comparator;

/**
 * A binary search tree (BST) is a data structure which has the following properties:
 *
 * 1.) The left subtree of a node contains only nodes with keys less than the node's key.
 * 2.) The right subtree of a node contains only nodes with keys greater than the node's key.
 * 3.) Both the left and right subtrees must also be binary search trees.
 * <p>
 * @see <a href="https://en.wikipedia.org/wiki/Binary_search_tree">Binary Search Tree (Wikipedia)</a>
 * <br>
 * @author Owain Lewis <owain@owainlewis.com>
 */
public final class BinarySearchTree<T extends Comparable<T>> {

    private BinaryTreeNode<T> root;

    private Comparator<T> comparator;

    public BinarySearchTree(Comparator<T> c) {
        root = null;
        comparator = c;
    }

    private int compare(T x, T y) {
        if (comparator == null) return x.compareTo(y);
        return comparator.compare(x,y);
    }

    /**
     * Insert a value into the tree
     *
     * @param value A value to insert
     */
    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private BinaryTreeNode<T> insertRecursive(BinaryTreeNode<T> current, T value) {
        if (current == null)
            return new BinaryTreeNode<>(value);
        int comparision = compare(value, current.getData());
        if (comparision == 0)
            return current;
        if (comparision < 0)
            current.setLeft(insertRecursive(current.getLeft(), value));
        else
            current.setRight(insertRecursive(current.getRight(), value));
        return current;
    }

    public int height() {
        return height(root);
    }

    private int height(BinaryTreeNode<T> tree) {
        if (tree == null) return -1;
        return 1 + Math.max(height(tree.getLeft()), height(tree.getRight()));
    }
}
