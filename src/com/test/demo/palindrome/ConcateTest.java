package com.test.demo.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcateTest {

	@Test
	void testMain() {
		
		PalindromeDemo demo=new PalindromeDemo();
		assertTrue(demo.isPalindrome("madam"));
		
	}

}
