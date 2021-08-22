package com.dzyls.design.sort.impl;

import com.dzyls.design.sort.AbstractSort;
import com.dzyls.design.sort.Sort;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 **/
public class RandomSort extends AbstractSort {

    private Random random = new SecureRandom();

    @Override
    public int[] sort(int[] array) {
        List<Integer> integers = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>(integers);
        while (!checkSort(result)){
            result = new ArrayList<>(integers);
            result = randomSort(result);
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }

    public List<Integer> randomSort(List<Integer> list){
        List<Integer> copy = new ArrayList<>(list);
        list.clear();
        boolean []set = new boolean[copy.size()];
        int i = 0;
        while (i < copy.size()) {
            int rand = randomInt(copy.size());
            if (set[rand]){
                continue;
            }
            i++;
            set[rand] = true;
            Integer nextInt = copy.get(rand);
            /*if (list.size() > 0 && nextInt > list.get(list.size() - 1)){
                randomSort(copy);
            }*/
            list.add(nextInt);
        }
        return list;
    }

    public int randomInt(int bound){
        return random.nextInt(bound);
    }

    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;
        while(true){
            i ++;
        }
    }

}
