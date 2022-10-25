package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveFilterTest {

    @Test
    public void test1(){
        PositiveFilter d_filter = new PositiveFilter();
        Integer num = 4;
        boolean expected = true;
        boolean actual;

        actual = d_filter.accept(num);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void test2(){
        PositiveFilter d_filter = new PositiveFilter();
        Integer num = 0;
        boolean expected = false;
        boolean actual;

        actual = d_filter.accept(num);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void test3(){
        PositiveFilter d_filter = new PositiveFilter();
        Integer num = -2;
        boolean expected = false;
        boolean actual;

        actual = d_filter.accept(num);

        Assertions.assertEquals(expected,actual);

    }

}