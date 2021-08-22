package com.dzyls.design.search;

public interface Search {


    /**
     * 返回指定值在数组中的下标
     * return -1 if not exists
     * @param array
     * @return
     */
    int search(int []array,int target);


}
