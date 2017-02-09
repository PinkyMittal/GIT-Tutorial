package com;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubTest {

	@Test
	
	public void test() {
		Sub a = new Sub();
		 int out = a.sub(5,3);
	 System.out.println(out);
	           Assert.assertEquals (2, out);
	}
	public static void main(String args[])
	{
		SubTest b = new SubTest();
		b.test();
	}

}
