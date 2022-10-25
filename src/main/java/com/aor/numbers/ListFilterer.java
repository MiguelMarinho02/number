package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {

    GenericListFilter filter;
    public ListFilterer(GenericListFilter filter){
        this.filter = filter;
    }

    public List<Integer> filter(List<Integer> list){
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i< list.size(); i++){
            if(filter.accept(list.get(i)) == true){
                l.add(list.get(i));
            }
        }
        return l;
    }
}
