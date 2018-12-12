package com.testincrement.testincrement.service.impl;

import com.testincrement.testincrement.service.Incrementor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class implements interface {@link Incrementor}
 */
final public class IncrementorImpl implements Incrementor {

    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicInteger maxValueCount = new AtomicInteger(10);

    /**
     * Create new instance of IncrementorImpl with default values:<br>
     * count = 0,<br>
     * maxValueCount = 10
     */
    public IncrementorImpl() {
    }

    /**
     * Create new instance of IncrementorImpl with new data
     * @param count
     * @param maxValueCount
     */
    public IncrementorImpl(int count, int maxValueCount) {
        this.count.set(count);
        this.maxValueCount.set(maxValueCount);
    }

    /** @return int count */
    @Override
    public int getNumber() {
        return this.count.get();
    }

    /** Method which set count in to 0, if count > maxValueCount */
    @Override
    public void incrementNumber() {
        this.count.incrementAndGet();
        if(this.count.get() > this.maxValueCount.get()){
            this.count.set(0);
        }
    }

    /**
     * Set new value for {@link #maxValueCount}
     * @param maximumValue parameter from client side input
     */
    @Override
    public void setMaximumValue(int maximumValue) {
        this.maxValueCount.set(maximumValue);
    }

    /**
     * This method only for @Test
     * @return int maxValueCount
     */
    public int getMaxValueCount() {
        return maxValueCount.get();
    }

}
