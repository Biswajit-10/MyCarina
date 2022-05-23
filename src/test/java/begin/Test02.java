package begin;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.DriverHelper;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class Test02 implements IAbstractTest, IMobileUtils{
	
	@Test()
	public void test002() {

		DriverHelper driverHelper = new DriverHelper(getDriver());
		ExtendedWebElement btn9 = driverHelper.findExtendedWebElement(By.id("com.miui.calculator:id/btn_6_s"));
		Assert.assertTrue(btn9.isElementPresent(), "Btn 9 is not present" );
		btn9.click();
		ExtendedWebElement multiply = driverHelper.findExtendedWebElement(By.id("com.miui.calculator:id/btn_mul_s"));
		Assert.assertTrue(multiply.isElementPresent(), "Btn Multiply is not present" );
	    multiply.click();
		ExtendedWebElement btn6 = driverHelper.findExtendedWebElement(By.id("com.miui.calculator:id/btn_5_s"));
		btn6.click();
		ExtendedWebElement equals = driverHelper.findExtendedWebElement(By.id("com.miui.calculator:id/btn_equal_s"));
		equals.click();

	}

	
}
