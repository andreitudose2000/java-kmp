/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 08 17:33:50 GMT 2024
 */

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.KMP;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KMP_ESTest extends KMP_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KMP kMP0 = new KMP();
      int[] intArray0 = kMP0.findAllOccurrences("etethMgI.x.Qi.|Q'8", "etethMgI.x.Qi.|Q'8");
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KMP kMP0 = new KMP();
      int[] intArray0 = kMP0.findAllOccurrences("etethMgI.x.Qi.|Q'8", "Mv");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KMP kMP0 = new KMP();
      int[] intArray0 = kMP0.findAllOccurrences("PPxY<Q", ",{#V|p1~:fJo~EFwX");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KMP kMP0 = new KMP();
      int[] intArray0 = kMP0.findAllOccurrences("", "=g/P0H?.G");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KMP kMP0 = new KMP();
      // Undeclared exception!
      try { 
        kMP0.findAllOccurrences("=*{[U|$C3bYT", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pattern can not be null
         //
         verifyException("org.example.KMP", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      KMP kMP0 = new KMP();
      // Undeclared exception!
      try { 
        kMP0.findAllOccurrences((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Text can not be null
         //
         verifyException("org.example.KMP", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      KMP kMP0 = new KMP();
      int[] intArray0 = kMP0.findAllOccurrences("", "");
      assertEquals(0, intArray0.length);
  }
}