package com.fieldju.scala

import org.apache.log4j.Logger

class Handler {

  val log = Logger.getLogger(getClass)

  def handle(): Unit = {
    log.info("Hello World from Scala!")
  }

}
