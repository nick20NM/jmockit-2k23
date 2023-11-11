package com.alpha.www.JMockit.example1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mockit.Injectable;
import mockit.Mocked;

public class SubClassTest {

	@Injectable
	SubClass subClass;
	
//	@Mocked
//	SuperClass superClass;
	
	@Test
	void test() {
		subClass = new SubClass("hello");
		assertEquals(subClass.getData(), "hello");
	}
}
