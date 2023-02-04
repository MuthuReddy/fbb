package com.junit;

import org.junit.Ignore;
import org.junit.Test;

public class ClassA {
	
	@Test
	public void tc_1() {
		System.out.println("ClassB tc_1");
	}
	
	@Test
	public void tc_2() {
		System.out.println("ClassB tc_2");
	}
	
@Ignore
	@Test
	public void tc_3() {
		System.out.println("ClassB tc_3");
	}

	@Test
	public void a() {
		System.out.println("ClassB a");
	}

	@Test
	public void c() {
		System.out.println("ClassB c");
	}

	@Test
	public void b() {
		System.out.println("ClassB b");
	}


}
