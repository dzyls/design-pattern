package com.dzyls.design.tree.impl;

import com.dzyls.design.tree.Node;
import com.dzyls.design.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 **/
public abstract class AbstructTree implements Tree {

    public Node root;

    public void postOrder(Node root, List<Integer> nodeList) {
        if (root == null) {
            return;
        }
        postOrder(root.left, nodeList);
        postOrder(root.right, nodeList);
        nodeList.add(root.value);
    }

    public List<Integer> midOrder() {
        ArrayList<Integer> nodeList = new ArrayList<>();
        if (root != null) {
            midOrder(root, nodeList);
        }
        return nodeList;
    }

    private void midOrder(Node root, List<Integer> nodeList) {
        if (root != null) {
            midOrder(root.left, nodeList);
            nodeList.add(root.value);
            midOrder(root.right, nodeList);
        }
    }

    public List<Integer> preOrder() {
        List<Integer> nodeList = new ArrayList<>();
        if (root == null) {
            return nodeList;
        }
        preOrder(root, nodeList);
        return nodeList;
    }

    private void preOrder(Node root, List<Integer> nodeList) {
        if (root != null) {
            nodeList.add(root.value);
            preOrder(root.left, nodeList);
            preOrder(root.right, nodeList);
        }
    }

    public int getDepth(){
        return getDepth0(root);
    }

    private int getDepth0(Node node){
        if (node != null){
            int rightDepth = getDepth0(node.right);
            int leftDepth = getDepth0(node.left);
            return 1 + (rightDepth > leftDepth ? rightDepth : leftDepth);
        }
        return 0;
    }

}
