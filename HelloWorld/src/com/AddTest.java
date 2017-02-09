package com;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class AddTest {

	@Test
	public void test() {
		Add a = new Add();
		 int out = a.add(5,3);
	 System.out.println(out);
	           Assert.assertEquals (8, out);
	}
	public static void main(String args[])
	{
		AddTest b = new AddTest();
		b.test();
	}

}
