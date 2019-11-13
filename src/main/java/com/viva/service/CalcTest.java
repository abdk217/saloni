package com.viva.service;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalcTest {
	
	@Test
	public void addTest(){
		assertEquals(3,App.add(1,2));
	}
	
	@Test
	public void subTest(){
		assertEquals(-1,App.sub(1,2));
	}
	
	@Test
	public void mulTest(){
		assertEquals(2,App.mul(1,2));
	}
	
	@Test
	public void divTest(){
		assertEquals(0.5,App.div(1,2),0.02);
	}
	
}
