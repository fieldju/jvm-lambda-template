package com.fieldju.java;

import org.junit.Before;
import org.junit.Test;

public class HandlerIntegrationTest {

    private Handler handler;

    @Before
    public void before() {
        handler = new Handler();
    }

    @Test
    public void run_handle() {
        handler.handle();
    }
}
