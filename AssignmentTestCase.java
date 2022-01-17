package aspireAppTestCases;

import org.testng.annotations.Test;

import base.BaseClass_Assignment;
import pages.AssignmentHomePage;

public class AssignmentTestCase extends BaseClass_Assignment{

	@Test
	public void runAssignmentTestCases() throws InterruptedException {
		
		new AssignmentHomePage(driver)
		.clickInventory()
		.clickProducts()
		.clickCreate()
		.enterProductName()
		.clickSave()
		.clickUpdateQuantity()
		.clickCreate()
		.choseLocation()
		.chosePackage()
		.enterQuantity()
		.clickSave()
		.clickApplocationIcon()
		.clickManufacturing()
		.clickCreateManufactureButton()
		.selectProductType()
		.enterProductQuantity()
		.clickAddaLine()
		.clickConfirm()
		.clickMarkAsDone()
		.clickSaveOnOrders()
		.removeFilter()
		.searchCreatedOrder()
		.verifyOrderIsCreated();
	}
}