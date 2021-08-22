package com.dzyls.design.tree;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020-12-8 17:27
 * @Version 1.0.0
 * @Description: https://www.cnblogs.com/Michaelwjw/p/6384428.html
 */
public class Node {

    public int value;
    public Node left;
    public Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

}
