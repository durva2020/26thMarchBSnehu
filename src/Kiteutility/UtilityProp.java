package Kiteutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import KiteBase.Base;




public class UtilityProp extends Base {
  
	  public static void captureScreenshot(WebDriver driver,String TCID) throws IOException {
	  File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest =new File("D:\\Users\\shree\\Desktop\\screenshot\\MyScreenshot"+TCID+".png");
	  FileHandler.copy(src, dest);
		}
		public static String getDataFromPropertyFile(String key) throws IOException {
			Properties prop=new Properties();
			FileInputStream myfile=new FileInputStream("E:\\SeleniumProj\\KiteCredentials.properties");
			prop.load(myfile);
			String value=prop.getProperty(key);
			return value;
  }
}
