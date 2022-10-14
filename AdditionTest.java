package com.blz.junit;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
	@Test
 public void addTest()
 {
	 Addition add=new Addition();
	 Assert.assertEquals(10, add.add(5, 5));
 }
}
