package com.fieldju.groovy

import org.apache.log4j.Logger

class Handler {

    def log = Logger.getLogger(getClass())

    def handle() {
        log.info('Hello World from Groovy!')
    }
}
