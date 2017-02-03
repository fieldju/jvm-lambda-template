package com.fieldju.scala

import org.junit.{Before, Test}

/**
  * Created by jfiel2 on 2/3/17.
  */
class HandlerIntegrationTest {

  var handler: Handler = _

  @Before
  def before(): Unit ={
    handler = new Handler
  }

  @Test
  def run_handle(): Unit = {
    handler.handle()
  }

}
