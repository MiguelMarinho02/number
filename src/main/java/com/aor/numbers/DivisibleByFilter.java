package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    Integer number;
    public DivisibleByFilter(Integer num){
        number = num;
    }

    public boolean accept(Integer number){
        if(number % this.number == 0){
            return true;
        }
        return false;
    }
}
