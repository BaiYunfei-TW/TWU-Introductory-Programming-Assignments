package com.thoughtworks.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactor {
    public List<Integer> generate(int n) {
        List<Integer> resultList = new ArrayList<>();
        int prime = 2;
        while (n != 1){
            while (n % prime == 0){
                resultList.add(prime);

                n = n / prime;
            }
            prime++;
        }
        return resultList;
    }
}
