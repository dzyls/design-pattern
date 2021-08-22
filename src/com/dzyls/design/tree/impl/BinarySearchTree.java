package com.dzyls.design.tree.impl;

import com.dzyls.design.tree.Node;
import com.dzyls.design.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 **/
public class BinarySearchTree extends AbstructTree {


    public BinarySearchTree() {
    }

    public BinarySearchTree(int rootValue) {
        root = new Node(rootValue);
    }


    @Override
    public Node add(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return node;
        }
        Node curNode = root;
        Node parentNode = root;
        boolean isLeftNode = true;
        while (curNode != null) {
            parentNode = curNode;
            if (curNode.value > value) {
                curNode = curNode.left;
                isLeftNode = true;
            } else {
                curNode = curNode.right;
                isLeftNode = false;
            }
        }
        if (isLeftNode) {
            parentNode.left = node;
        } else {
            parentNode.right = node;
        }
        return node;
    }

    @Override
    public Node search(int value) {
        Node curNode = root;
        while (curNode != null && curNode.value != value) {
            if (value > curNode.value) {
                curNode = curNode.right;
            } else {
                curNode = curNode.left;
            }
        }
        return curNode;
    }


    public List<Integer> postOrder() {
        List<Integer> nodeList = new ArrayList<>();
        if (root != null) {
            postOrder(root.left, nodeList);
            postOrder(root.right, nodeList);
            nodeList.add(root.value);
        }
        return nodeList;
    }

    @Override
    public Node searchParentNode(int value) {
        Node curNode = root;
        Node parentNode = null;
        while (curNode != null && curNode.value != value) {
            parentNode = curNode;
            if (curNode.value > value) {
                curNode = parentNode.left;
            } else {
                curNode = parentNode.right;
            }
        }
        if (curNode == null || curNode.value != value){
            return null;
        }
        return parentNode;
    }


    /**
     * 删除节点分为以下四种情况：
     * 1.删除的是叶子节点
     * 2.删除的节点有左子节点
     * 3.删除的节点有右子节点 ： 以子节点替代被删除的节点
     * 4.删除的节点既有右子节点又有左子节点 ： 使用被删节点的右子树的最左节点或左子树的最右节点
     * @param value
     * @return
     */
    @Override
    public boolean delNode(int value){
        Node delNode = search(value);
        if (delNode == null) {
            return false;
        }
        Node searchParentNode = searchParentNode(value);
        if (delNode.left == null && delNode.right == null){
            if (root == delNode){
                root = null;
                return true;
            }
            if (searchParentNode.left == delNode){
                searchParentNode.left = null;
            }else {
                searchParentNode.right = null;
            }
            return true;
        }else if (delNode.left == null || delNode.right == null){
            if (root == delNode){
                root = getOnlyLeafNode(root);
                return true;
            }
            if (delNode == searchParentNode.left){
                searchParentNode.left = getOnlyLeafNode(delNode);
            }else {
                searchParentNode.right = getOnlyLeafNode(delNode);
            }
            return true;
        }else {
            Node directPostNode = getDirectPostNode(delNode);
            // 替换被删节点
            directPostNode.right = delNode.right;
            directPostNode.left = delNode.left;
            if (root == delNode){
                root = directPostNode;
                return true;
            }
            if (searchParentNode.left == delNode) {
                searchParentNode.left = directPostNode;
            }else {
                searchParentNode.right = directPostNode;
            }
            delNode = null;
        }
        return true;
    }

    public Node getDirectPostNode(Node delNode){
        Node directPostNode = delNode;
        Node parentNode = directPostNode;
        Node curNode = delNode.right;
        while (curNode != null){
            parentNode = directPostNode;
            directPostNode = curNode;
            curNode = curNode.left;
        }
        if (directPostNode != delNode.right){
            parentNode.left = directPostNode.right;
            directPostNode.right = null;
        }else {
            delNode.right = directPostNode.right;
            directPostNode.right = null;
        }
        return directPostNode;
    }

    public Node getOnlyLeafNode(Node parentNode){
        return parentNode.right == null?parentNode.left:parentNode.right;
    }

}
