package springIntro2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testMsSqlCustomerDal {
	
	ICustomerDAL interfaceObject;
	
	@Before
	public void Before() {
		interfaceObject = new MsSqlCustomerDal();
	}
	
	@Test
	public void testAddMethod() {
		
		Assert.assertNotNull(interfaceObject);
	}
	

	
}
