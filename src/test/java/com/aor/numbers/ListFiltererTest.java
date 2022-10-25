package com.aor.numbers;

import com.sun.tools.javac.jvm.Gen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFiltererTest {
    List<Integer> list;
    ListFilterer filterer;

    @BeforeEach
    public void method() {
        list = Arrays.asList(-1,0,3,2,4,6,7);

    }

    @Test
    public void filterTest1(){
        List<Integer> expected = Arrays.asList(2,4,6);
        GenericListFilter filter = Mockito.mock(GenericListFilter.class);
        Mockito.when(filter.accept(-1)).thenReturn(false);
        Mockito.when(filter.accept(0)).thenReturn(false);
        Mockito.when(filter.accept(3)).thenReturn(false);
        Mockito.when(filter.accept(2)).thenReturn(true);
        Mockito.when(filter.accept(4)).thenReturn(true);
        Mockito.when(filter.accept(6)).thenReturn(true);
        Mockito.when(filter.accept(7)).thenReturn(false);
        filterer = new ListFilterer(filter);
        Assertions.assertEquals(expected,filterer.filter(list));
    }

    @Test
    public void filterTest2(){
        List<Integer> expected = Arrays.asList(3,2,4,6,7);
        GenericListFilter filter = Mockito.mock(GenericListFilter.class);
        Mockito.when(filter.accept(-1)).thenReturn(false);
        Mockito.when(filter.accept(0)).thenReturn(false);
        Mockito.when(filter.accept(3)).thenReturn(true);
        Mockito.when(filter.accept(2)).thenReturn(true);
        Mockito.when(filter.accept(4)).thenReturn(true);
        Mockito.when(filter.accept(6)).thenReturn(true);
        Mockito.when(filter.accept(7)).thenReturn(true);

        filterer = new ListFilterer(filter);

        Assertions.assertEquals(expected,filterer.filter(list));
    }

}