package com.owainlewis.dsa.datastructures.binarysearchtree;

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

    public void insert (T data) {
        if (root == null) {
            root = new BinaryTreeNode<>(data);
            return;
        }

        int cmp = root.getData().compareTo(data);

        if (cmp == 0) {
            return;
        } else if (cmp < 0) {
            return;
        } else {
            return;
        }
    }

}
