package pack1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankUnitTest {
	private static Bank b;
	
	@BeforeClass
	public static void setUp() throws IOException{
		b = new Bank(1,1000,"sonu");
		System.out.println("tests started");		
	}
	
	@AfterClass
	public static void tearDown() throws Exception{
		System.out.println("tests ended");
	}
	
	@Test
	public void testCheckBalance() {
		assertEquals(500,b.checkBalance());
	}
	
	@Test
	public void testWithdraw(){
		assertTrue(b.withdraw(500));
	}
	
	@Test
	public void testCustomerDetails() {
		assertTrue(b.verifyCustomerDetails(1, "sonu"));
	}

}
