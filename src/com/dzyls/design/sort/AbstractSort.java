package com.dzyls.design.sort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 **/
public abstract class AbstractSort implements Sort{

    public boolean checkSort(List<Integer> result){
        return checkSort(result.stream().mapToInt(Integer::valueOf).toArray());
    }

    public boolean checkSort(int []result){
        for (int i = 1; i < result.length; i++) {
            if (result[i] < result[i-1]){
                return false;
            }
        }
        return true;
    }

}
