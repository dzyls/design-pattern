package com.dzyls.design.tree.impl;

import com.dzyls.design.tree.Node;
import com.dzyls.design.tree.Tree;

/**
 * 平衡二叉搜索树
 **/
public class BalanceBinarySearchTree extends AbstructTree {

    public BalanceBinarySearchTree() {
    }

    public BalanceBinarySearchTree(int rootValue) {
        root = new Node(rootValue);
    }

    @Override
    public Node add(int value) {
        return null;
    }

    @Override
    public boolean delNode(int value) {
        return false;
    }

    @Override
    public Node search(int value) {
        return null;
    }

    @Override
    public Node searchParentNode(int value) {
        return null;
    }
}
