package com.fieldju.java;

import org.apache.log4j.Logger;

public class Handler {

    private final Logger log = Logger.getLogger(getClass());

    public void handle() {
        log.info("Hello World from Java!");
    }

}
