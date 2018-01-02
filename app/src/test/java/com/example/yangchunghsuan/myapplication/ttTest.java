package com.example.yangchunghsuan.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yangchunghsuan on 2018/1/2.
 */
public class ttTest {
    tt a;
    @Before
    public void setUp() throws Exception {
        a = new tt();
    }

    @Test
    public void test1() throws Exception {
        assertEquals(3,a.test(1,2));
    }

}