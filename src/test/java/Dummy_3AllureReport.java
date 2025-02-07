import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dummy_3AllureReport {

    @Test
    public void TextBoxValidation_Testcase1() {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        //Thread.sleep(5000);

        //Text box
        driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("SAURABH");
        driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("SRIVASTAVA");
    }

    @Test
    public void CheckBoxValidation_Testcase2() {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@value,'Automation Tester')]")).click();
        driver.findElement(By.xpath("//input[contains(@value,  'Manual Tester')]")).click();
        driver.findElement(By.xpath("//input[contains(@value,'Selenium Webdriver')]")).click();
    }

    @Test
    public void SelectDropdownvalidation_Testcase3() {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        //Selct dropdown by selct method
        Select continents = new Select(driver.findElement(By.id("continents")));
        //continents.selectByVisibleText("Australia");
        continents.selectByIndex(3);
    }

    @Test
    public void Uploadfile_Testcase4() {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        //upload file button
        //driver.findElement(By.xpath("//input[contains(@id,'photo')]")).click();
        WebElement upload = driver.findElement(By.xpath("//input[contains(@type,  'file')]"));
        upload.sendKeys("C:\\Users\\SAURABH\\Downloads\\zoomsample");
        System.out.println("File uploaded successfully");

    }
}
