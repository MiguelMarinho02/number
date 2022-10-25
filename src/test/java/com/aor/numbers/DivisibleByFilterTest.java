package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleByFilterTest {

    @Test
    public void test1(){
        DivisibleByFilter d_filter = new DivisibleByFilter(2);
        Integer num = 4;
        boolean expected = true;
        boolean actual;

        actual = d_filter.accept(num);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void test2(){
        DivisibleByFilter d_filter = new DivisibleByFilter(7);
        Integer num = 4;
        boolean expected = false;
        boolean actual;

        actual = d_filter.accept(num);

        Assertions.assertEquals(expected,actual);

    }


}