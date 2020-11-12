package com.example;

import org.apache.kafka.streams.processor.Processor;
import org.apache.kafka.streams.processor.ProcessorContext;

public class SayHelloProcessor implements Processor<Void, String> {
  @Override
  public void init(ProcessorContext context) {
    // no special initialization needed in this example
  }

  @Override
  public void process(Void key, String value) {
    System.out.println("(Processor API) Hello, " + value);
  }

  @Override
  public void close() {
    // no special clean up needed in this example
  }
}
