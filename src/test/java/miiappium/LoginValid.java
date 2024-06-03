package miiappium;

//import java.net.MalformedURLException;

import org.testng.Assert;
//import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

//import io.appium.java_client.AppiumDriver;


public class LoginValid extends Mii {


@Test
public void Login_Valid() 
{
	  
	        // Login valid
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"id.binar.fp.secondhand:id/btn_login\"]")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"id.binar.fp.secondhand:id/et_email\"]")).sendKeys("syafradha@gmail.com");
     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"id.binar.fp.secondhand:id/et_password\"]")).sendKeys("meditran5");
     driver.findElement(AppiumBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.widget.Button[1]]")).click();
     
     //verifi label akun
    
 	//keluar
 	 driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"id.binar.fp.secondhand:id/logout\"]")).click();
		
	       
	    }


@Test

public void Login_invalid_Email_wrong() 
{
	
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"id.binar.fp.secondhand:id/btn_login\"]")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"id.binar.fp.secondhand:id/et_email\"]")).sendKeys("syafradha@gmail.com");
     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"id.binar.fp.secondhand:id/et_password\"]")).sendKeys("meditran5");
     driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"id.binar.fp.secondhand:id/btn_login\"]]")).click();
     
     //Assert
     Assert.assertTrue(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/tv_name\"]")).isDisplayed());
     String menuText =	driver.findElement(AppiumBy.id("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/tv_name\"]")).getText();
 	Assert.assertEquals(menuText, "budi");
		
    
 }

	
		



@Test
public void Login_invalid_Password_wrong() 


{
	
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"id.binar.fp.secondhand:id/btn_login\"]")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"id.binar.fp.secondhand:id/et_email\"]")).sendKeys("syafradha@gmail.com");
     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"id.binar.fp.secondhand:id/et_password\"]")).sendKeys("meditran5");
     driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"id.binar.fp.secondhand:id/btn_login\"]]")).click();
     
     //Assert
     Assert.assertTrue(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/tv_name\"]")).isDisplayed());
     String menuText =	driver.findElement(AppiumBy.id("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/tv_name\"]")).getText();
 	Assert.assertEquals(menuText, "budi");
		
		
}

@Test
public void Login_invalid_Email_Blank() 


{
	
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Masuk\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Email']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Password']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'MasukLogin\']")).click();
     
     //Assert
     Assert.assertTrue(driver.findElement(AppiumBy.id("android:id/title")).isDisplayed());
     String menuText =	driver.findElement(AppiumBy.id("android:id/title")).getText();
 	Assert.assertEquals(menuText, "Sample menu");
		
}
@Test
public void Login_invalid_Password_Blank() 


{
	
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"id.binar.fp.secondhand:id/btn_login\"]")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"id.binar.fp.secondhand:id/et_email\"]")).sendKeys("syafradha@gmail.com");
     driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"id.binar.fp.secondhand:id/et_password\"]")).sendKeys("meditran5");
     driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"id.binar.fp.secondhand:id/btn_login\"]]")).click();
     
     //Assert
     Assert.assertTrue(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/tv_name\"]")).isDisplayed());
     String menuText =	driver.findElement(AppiumBy.id("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/tv_name\"]")).getText();
 	Assert.assertEquals(menuText, "budi");
		
}

@Test
public void Login_invalid_Email_Password_Blank()


{
	
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Masuk\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Email']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Password']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'MasukLogin\']")).click();
     
     //Assert
     Assert.assertTrue(driver.findElement(AppiumBy.id("android:id/title")).isDisplayed());
     String menuText =	driver.findElement(AppiumBy.id("android:id/title")).getText();
 	Assert.assertEquals(menuText, "Sample menu");
		
}
@Test
public void Login_invalid_Email()


{
	//not use @
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Masuk\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Email']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Password']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'MasukLogin\']")).click();
     
     //Assert
     Assert.assertTrue(driver.findElement(AppiumBy.id("android:id/title")).isDisplayed());
     String menuText =	driver.findElement(AppiumBy.id("android:id/title")).getText();
 	Assert.assertEquals(menuText, "Sample menu");
		
}
@Test
public void Login_invalid_Password() 

{
	// kurang dari 8 karakter
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Masuk\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Email']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Password']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'MasukLogin\']")).click();
     
     //Assert
     Assert.assertTrue(driver.findElement(AppiumBy.id("android:id/title")).isDisplayed());
     String menuText =	driver.findElement(AppiumBy.id("android:id/title")).getText();
 	Assert.assertEquals(menuText, "Sample menu");
		
}
@Test
public void Login_invalid_Password1() 

{
	// tidak ada uppercase
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Masuk\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Email']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Password']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'MasukLogin\']")).click();
     
     //Assert
     Assert.assertTrue(driver.findElement(AppiumBy.id("android:id/title")).isDisplayed());
     String menuText =	driver.findElement(AppiumBy.id("android:id/title")).getText();
 	Assert.assertEquals(menuText, "Sample menu");
		
}

@Test
public void Login_invalid_Password2() throws InterruptedException


{
	// tidak ada spesial character
	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Akun\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'Masuk\']")).click();
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Email']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextField[@text='Password']")).sendKeys("Rahul Shetty");
     driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"id.binar.fp.secondhand:id/navigation_bar_item_small_label_view\" and @text=\'MasukLogin\']")).click();
     
     //Assert
     Assert.assertTrue(driver.findElement(AppiumBy.id("android:id/title")).isDisplayed());
     String menuText =	driver.findElement(AppiumBy.id("android:id/title")).getText();
 	Assert.assertEquals(menuText, "Sample menu");
		
}




}