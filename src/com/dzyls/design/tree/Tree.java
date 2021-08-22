package com.dzyls.design.tree;

public interface Tree {

    Node add(int value);

    boolean delNode(int value);

    Node search(int value);

    Node searchParentNode(int value);

}
