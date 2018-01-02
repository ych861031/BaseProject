package com.example.yangchunghsuan.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yangchunghsuan on 2018/1/2.
 */
public class testTest {
    test a;
    @Before
    public void setUp() throws Exception {
        a = new test();
    }

    @Test
    public void t() throws Exception {
        assertEquals(1,a.t(1));
    }

}