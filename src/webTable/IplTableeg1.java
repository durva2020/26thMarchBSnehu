package webTable;

//import java.util.Iterator;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IplTableeg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.iplt20.com/points-table/men/2022");
        Thread.sleep(2000);
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ih-td-tab table table-striped']//tr"));
        int totalNumOfRows=rows.size();
        System.out.println("Total number of rows in table " + totalNumOfRows);
        
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='ih-td-tab table table-striped']//tr[1]//th"));
        int totalNumOfColumns=columns.size();
        System.out.println("Total number of columns in table " + totalNumOfColumns);
        for(WebElement header:columns)
        {
        	System.out.println(header.getText() +" ");
        	 	
        }
        List<WebElement> allrowsData=driver.findElements(By.xpath("((//table//tr[@class='team0 ng-scope'])[1]//td//div)[3]"));
         
      Iterator<WebElement> it = allrowsData.iterator();
        while(it.hasNext())
        {
        	System.out.print(it.next().getText()+"      ");
        	System.out.println();
        }
      

	}

}
