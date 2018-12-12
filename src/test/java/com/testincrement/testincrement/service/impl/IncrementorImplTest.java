package com.testincrement.testincrement.service.impl;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IncrementorImplTest {

    @Test
    public void onlyGetNumber() {
        final IncrementorImpl incrementor = new IncrementorImpl(5,3);
        assertThat(incrementor.getNumber(), is(5));
    }

//    @Test
//    public void whenCheckCountMaxMoreThanCount() {
//        final IncrementorImpl incrementor = new IncrementorImpl(5,3);
//        incrementor.checkCount();
//        assertThat(incrementor.getNumber(), is(0));
//    }
//
//    @Test
//    public void whenCheckCountMaxLessThanCount() {
//        final IncrementorImpl incrementor = new IncrementorImpl(3,5);
//        incrementor.checkCount();
//        assertThat(incrementor.getNumber(), is(3));
//    }

    @Test
    public void whenIncrementNumber() {
        final IncrementorImpl incrementor = new IncrementorImpl(3,5);
        incrementor.incrementNumber();
        assertThat(incrementor.getNumber(), is(4));
    }

    @Test
    public void whenCallSetMaximumValue() {
        final IncrementorImpl incrementor = new IncrementorImpl(3,5);
        incrementor.setMaximumValue(25);
        assertThat(incrementor.getMaxValueCount(), is(25));
    }
}