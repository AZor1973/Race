package ru.azor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class RaceService {
    private static final CountDownLatch countDownLatch = new CountDownLatch(MainClass.CARS_COUNT);
   private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(MainClass.CARS_COUNT+1);

    public static CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public static CyclicBarrier getCyclicBarrier() {
        return cyclicBarrier;
    }
}
