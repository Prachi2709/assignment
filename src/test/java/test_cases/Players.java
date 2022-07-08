package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base_methods.Methods;

public class Players extends Methods{

	@Test
	public void foreignPlayerTest() throws EncryptedDocumentException, IOException {
		int actual_value = foreignPlayer();
		Assert.assertEquals(actual_value, 4);
	}
	
	@Test
	public void wicketKeeperTest() throws EncryptedDocumentException, IOException {
		String actual_value = wicketKeeper();
		Assert.assertEquals(actual_value, "Wicket-Keeper");
	}
	
}
