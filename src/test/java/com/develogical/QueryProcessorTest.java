package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

 /* @Test
  public void knowsWhoWroteRomeoAndJuliet() throws Exception {
    assertThat(queryProcessor.process("Who wrote Romeo And Juliet"), containsString("This game is interesting"));
  }

  @Test
  public void isNotCaseSensitive() throws Exception {
    assertThat(queryProcessor.process("who wrote romeo and juliet"), containsString("This game is interesting"));
  }

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is("Still this game is interesting"));
  }*/
}
