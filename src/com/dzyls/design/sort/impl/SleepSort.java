package com.dzyls.design.sort.impl;

import com.dzyls.design.sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 睡眠排序
 */
public class SleepSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        List<Integer> resultList = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(array.length);
        for (int i : array) {
            new SleepThread(i, resultList, countDownLatch).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return resultList.stream().mapToInt(Integer::valueOf).toArray();
    }

    class SleepThread extends Thread{

        private int sleepTime;
        private List<Integer> resultList;
        private CountDownLatch latch;

        public SleepThread(int sleepTime,List<Integer> resultList,CountDownLatch latch){
            this.sleepTime = sleepTime;
            this.resultList = resultList;
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                TimeUnit.MILLISECONDS.sleep(sleepTime << 3);
                resultList.add(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                latch.countDown();
            }
        }

    }

    public static void main(String[] args) {
        int []array = {7,8,5,6,3,4,9,1,0};
        Sort sort = new SleepSort();
        int[] result = sort.sort(array);
        System.out.println(Arrays.toString(result));
    }

}
