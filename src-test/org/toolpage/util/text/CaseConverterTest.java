package org.toolpage.util.text;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaseConverterTest {

	private String testValue;
	
	@Before
	public void setUp() throws Exception {
		testValue = "This is a TEST (oh, really?)";
	}

	@Test
	public void testConvertToUpperCase() {
		assertEquals("THIS IS A TEST (OH, REALLY?)", 
				CaseConverter.convertToUpperCase(this.testValue));
	}

	@Test
	public void testConvertToLowerCase() {
		assertEquals("this is a test (oh, really?)", 
				CaseConverter.convertToLowerCase(this.testValue));	}

	@Test
	public void testConvertToStartCase() {
		assertEquals("This Is A Test (Oh, Really?)", 
				CaseConverter.convertToStartCase(this.testValue));		
	}

	@Test
	public void testConvertToAlternatingCase() {
		assertEquals("ThIs Is A tEsT (oH, rEaLlY?)", 
				CaseConverter.convertToAlternatingCase(this.testValue));
		assertEquals("tHiS iS a TeSt (Oh, ReAlLy?)", 
				CaseConverter.convertToAlternatingCase(this.testValue, false));
	}

	@Test
	public void testConvertToCamelCase() {
		assertEquals("ThisIsATestOhReally", 
				CaseConverter.convertToCamelCase(this.testValue));
	}
	
	@Test
	public void testConvertToSnakeCase() {
		assertEquals("This_Is_A_Test_Oh_Really", 
				CaseConverter.convertToSnakeCase(this.testValue));
	}
	
	@Test
	public void testConvertToKebabCase() {
		assertEquals("this-is-a-test-oh-really", 
				CaseConverter.convertToKebabCase(this.testValue));
	}
	
	@Test
	public void testInvertCase() {
		assertEquals("tHIS IS A test (OH, REALLY?)", 
				CaseConverter.invertCase(this.testValue));
	}

}
