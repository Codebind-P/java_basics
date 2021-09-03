package TestScripts;

import org.testng.annotations.Test;

import TestSonar.TestJavaSourceFile;



public class TestNGExample {
  @Test
  public void testngexamplee() {
	  TestJavaSourceFile t= new TestJavaSourceFile();
	  t.main("demo");
	  System.out.println("test is called");
  }
}
