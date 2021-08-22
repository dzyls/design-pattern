package com.dzyls.design.tree;

import com.dzyls.design.tree.impl.BinarySearchTree;

import java.util.List;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2020-12-9 09:24
 * @Version 1.0.0
 * @Description:
 */
public class MainApplication {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //List.of(6,2,7,9,1,3,5,19,14,12,13,11,17,18,16,26,23,25,29,28).forEach(i -> binarySearchTree.add(i));
        //List.of(5,6,4,3,2,1).forEach(i -> binarySearchTree.add(i));
        System.out.println(binarySearchTree.midOrder());

        Node search = binarySearchTree.searchParentNode(4);
        if (search != null){
            System.out.println(search.value);
        }

        //boolean b = binarySearchTree.delNode(7);
        System.out.println(binarySearchTree.midOrder());
        //System.out.println(binarySearchTree.root.value);
        System.out.println(binarySearchTree.getDepth());

    }

}
