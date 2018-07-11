package com.thoughtworks.intro;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;
import java.util.List;

public class TestPrimeFactor {

    private PrimeFactor primeFactor = new PrimeFactor();

    @Test
    public void should_return_result_list_when_given_30() {
        Integer[] resultArr = {2, 3, 5};
        List<Integer> excepted = Arrays.asList(resultArr);

        List<Integer> actual = primeFactor.generate(30);

        assertThat(actual, equalTo(excepted));
    }

    @Test
    public void should_return_result_list_when_given_10() {
        Integer[] resultArr = {2, 5};
        List<Integer> excepted = Arrays.asList(resultArr);

        List<Integer> actual = primeFactor.generate(10);

        assertThat(actual, equalTo(excepted));
    }

    @Test
    public void should_return_result_list_when_given_66() {
        Integer[] resultArr = {2,3,11};
        List<Integer> excepted = Arrays.asList(resultArr);

        List<Integer> actual = primeFactor.generate(66);

        assertThat(actual, equalTo(excepted));
    }

}
