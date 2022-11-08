package hwg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingletonTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetNum() {
		  phase2 nm = new phase2();
		    int expection = 1234;
		    nm.setNum(1234);
		    int result = nm.getNum();
		    assertEquals(expection, result);
	}

	@Test
	void testSetNum() {
		int Number = 1234;
	    phase2 instance = new phase2();
	    instance.setNum(Number);
	   
	    assertEquals(instance.getNum(), Number);;;;
	}

}
