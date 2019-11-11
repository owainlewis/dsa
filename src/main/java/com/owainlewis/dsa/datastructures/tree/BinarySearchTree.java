package com.owainlewis.dsa.datastructures.tree;

import java.util.Comparator;

/**
 * A binary search tree (BST) is a data structure which has the following properties:
 *
 * <p>1.) The left subtree of a node contains only nodes with keys less than the node's key. 2.) The
 * right subtree of a node contains only nodes with keys greater than the node's key. 3.) Both the
 * left and right subtrees must also be binary search trees.
 *
 * <p>
 *
 * @author Owain Lewis <owain@owainlewis.com>
 * @see <a href="https://en.wikipedia.org/wiki/Binary_search_tree">Binary Search Tree
 *     (Wikipedia)</a> <br>
 */
public final class BinarySearchTree<T extends Comparable<T>> {

    private BinaryTreeNode<T> root;

    private Comparator<T> comparator;

    public BinarySearchTree() {}

    public BinarySearchTree(Comparator<T> c) {
        this.comparator = c;
    }

    private int compare(T x, T y) {
        if (comparator == null) return x.compareTo(y);
        return comparator.compare(x, y);
    }

    /**
     * Insert a value into the tree
     *
     * @param value A value to insert
     */
    public void insert(T value) {
        root = this.insertRecursive(root, value);
    }

    private BinaryTreeNode<T> insertRecursive(BinaryTreeNode<T> current, T value) {
        if (current == null) return new BinaryTreeNode<>(value);
        int comparision = this.compare(value, current.getData());
        if (comparision == 0) return current;
        if (comparision < 0) current.setLeft(insertRecursive(current.getLeft(), value));
        else current.setRight(insertRecursive(current.getRight(), value));
        return current;
    }

    public boolean contains(T item) {
        return this.search(this.root, item);
    }

    private boolean search(BinaryTreeNode<T> node, T item) {
        if (node == null) return false;
        if (this.compare(item, node.getData()) == 0) {
            return true;
        }

        if (this.compare(item, node.getData()) < 0) {
            return this.search(node.getLeft(), item);
        }

        return this.search(node.getRight(), item);
    }

    public int height() {
        return this.height(root);
    }

    private int height(BinaryTreeNode<T> tree) {
        if (tree == null) return -1;
        return 1 + Math.max(height(tree.getLeft()), height(tree.getRight()));
    }
}
