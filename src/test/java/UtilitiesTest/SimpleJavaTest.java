package UtilitiesTest;

import org.junit.Assert;
import org.junit.Test;

public class SimpleJavaTest {

	@Test
	public void equelTest(){
		Integer i = 128;
		Integer j = 128;
		Integer k = 127;
		Integer l = 127;
		Assert.assertEquals(true, i != j);
		Assert.assertEquals(true, k == l);
	}
}
