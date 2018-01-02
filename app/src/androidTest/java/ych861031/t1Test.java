package ych861031;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yangchunghsuan on 2018/1/2.
 */
public class t1Test {
    t1 a;
    @Before
    public void setUp() throws Exception {
        a = new t1();
    }

    @Test
    public void t() throws Exception {
        assertEquals(1,a.t(1));
    }

}