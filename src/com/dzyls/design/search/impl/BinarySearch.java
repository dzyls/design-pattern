package com.dzyls.design.search.impl;

import com.dzyls.design.search.Search;

/**
 * Binary Search
 **/
public class BinarySearch implements Search {

    @Override
    public int search(int[] array, int target) {
        return search(array,target,0,array.length);
    }

    private int search(int []array,int target,int begin,int end){
        int midIndex = (begin+end)/2;
        if(midIndex > 0){
            if (array[midIndex] > target){
                return search(array, target, begin, midIndex);
            }else if (array[midIndex] == target){
                return midIndex;
            }else {
                return search(array, target, midIndex, end);
            }
        }else if (midIndex == 0){
            if (array[midIndex] == target){
                return 0;
            }
            return -1;
        }else {
            return -1;
        }
    }


    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        Search search = new BinarySearch();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(search.search(arr,arr[i]));
        }
    }

}
