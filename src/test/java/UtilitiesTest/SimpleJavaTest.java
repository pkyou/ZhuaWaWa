package UtilitiesTest;

import org.junit.Assert;
import org.junit.Test;

public class SimpleJavaTest {

	@Test
	public void EquelTest(){
		Integer i = 128;
		Integer j = 128;
		Assert.assertEquals(true, i != j);
	}
}
