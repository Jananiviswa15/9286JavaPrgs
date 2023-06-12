import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TestFile {

	String name = "janani";
	String name1 = "janani";
	String nullVal = null;
	int num = 7;
	
	//@AfterClass
	@BeforeClass
	static void checkBeforeClass() {
		System.out.println(" class loading ");
	}
	
	@BeforeAll
	static void testBeforeAll() {
		System.out.println("happen only once before all the test cases");
	}
	
	
	@BeforeEach
	void checkBeforeEach() {
		System.out.println(" i will execute before each and every test case separately");
	}
	@Test
	void testAssertMethods() {
		assertNotNull(name);
		assertNull(nullVal);
		assertEquals(name, name1);
		assertNotEquals(name, null);
		assertSame(name, name1);
		assertNotSame(name, null);
		assertTrue(5 <= num);
		assertFalse(5 >= num);
		int fact = Factorial.toGetFactorial(5);
		assertEquals(120, fact);
	}
	
	
	@Test
	void testMethod2() {
		System.out.println(" in a class u can have n number of test cases ");
	}
	
	@AfterAll
	static void checkAfterAll() {
		System.out.println(" after all test cases, only once");
	}
	
	@AfterEach
	void checkAfterEach() {
		System.out.println(" after each test case");
	}
	
//	@Timeout
//	@Test(timeout = 90)
	
	@Ignore
	void checkIgnored() {
		System.out.println(" this method will never execute");
	}
	
	@Timeout(9)
	void testTimeout() {
		System.out.println("if time taken is more than 9 se it ll fail");
	}
	

}
