/*
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.io.IOException; import java.time.Duration; import java.util.List; import
 * java.util.Set;
 * 
 * import javax.swing.Action; import
 * javax.swing.text.html.HTMLDocument.Iterator;
 * 
 * import org.apache.commons.io.FileUtils; import org.openqa.selenium.*; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.FluentWait; import
 * org.openqa.selenium.support.ui.Select; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * import graphql.org.antlr.v4.runtime.ParserInterpreter;
 * 
 * public class SeleniumPractices {
 * 
 * public static void main(String[] args) throws IOException,
 * InterruptedException { // TODO Auto-generated method stub
 * WebDriverManager.chromedriver().setup(); WebDriver driver= new
 * ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().deleteAllCookies();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
 * 
 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 * 
 * 
 * List<WebElement> options=
 * driver.findElements(By.cssSelector("[class='radioButton']"));
 * 
 * 
 * for(WebElement option:options) { option.click(); }
 * 
 * 
 * driver.findElement(By.
 * cssSelector("[placeholder=\"Type to Select Countries\"]")).sendKeys("India");
 * driver.findElement(By.xpath("(//div[@class=\"ui-menu-item-wrapper\"])[2]")).
 * click(); Select sel = new
 * Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
 * driver.findElement(By.cssSelector("#dropdown-class-example")).click();
 * 
 * System.out.println(sel.isMultiple()); sel.selectByIndex(0); List<WebElement>
 * ls=sel.getOptions();
 * 
 * for(WebElement option: options) { option.click();
 * System.out.println(sel.getFirstSelectedOption());
 * 
 * }
 * 
 * 
 * List<WebElement> opts = driver.findElements(By.
 * cssSelector("#checkbox-example input[type=\"checkbox\"]"));
 * 
 * for(WebElement opt :opts) { System.out.println(opt.getText());
 * System.out.println(opt.isDisplayed()); System.out.println(opt.isEnabled());
 * System.out.println(opt.isSelected()); opt.click();
 * System.out.println(opt.isDisplayed()); System.out.println(opt.isEnabled());
 * System.out.println(opt.isSelected()); }
 * 
 * driver.findElement(By.cssSelector("#openwindow")).click();
 * 
 * Set<String> st = driver.getWindowHandles(); java.util.Iterator<String>
 * itr=st.iterator();
 * 
 * String mainWindow = itr.next(); String childwindow = itr.next();
 * 
 * 
 * driver.switchTo().window(childwindow);
 * 
 * System.out.println(driver.findElement(By.cssSelector("[class=\"cont\"] span")
 * ).getText());
 * 
 * driver.close();
 * 
 * driver.switchTo().window(mainWindow);
 * 
 * 
 * driver.findElement(By.cssSelector(".cen-align #opentab")).click();
 * 
 * Set<String> st1 = driver.getWindowHandles(); java.util.Iterator<String> itr1
 * = st1.iterator(); String main = itr1.next(); String child = itr1.next();
 * Thread.sleep(2000); driver.switchTo().window(child);
 * 
 * driver.close();
 * 
 * driver.switchTo().window(main);
 * 
 * driver.findElement(By.cssSelector("#name")).sendKeys("Abhijeet");
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.cssSelector("#alertbtn")).click(); Alert alerts =
 * driver.switchTo().alert(); System.out.println(alerts.getText());
 * alerts.dismiss();
 * driver.findElement(By.cssSelector("#name")).sendKeys("Abhijeet");
 * driver.findElement(By.cssSelector("#confirmbtn")).click();
 * System.out.println(alerts.getText()); alerts.accept();
 * 
 * 
 * System.out.println(driver.findElement(By.
 * cssSelector(".right-align  .totalAmount")).getSize());
 * 
 * 
 * JavascriptExecutor js = (JavascriptExecutor)driver;
 * 
 * js.executeScript("window.scrollBy(0,500);");
 * 
 * List<WebElement> opts =
 * driver.findElements(By.cssSelector("#product tbody tr"));
 * java.util.Iterator<WebElement> itr=opts.iterator();
 * 
 * for(WebElement opt:opts) { System.out.println(opt.getText()); }
 * 
 * List<WebElement> optss =
 * driver.findElements(By.cssSelector(".tableFixHead table tbody tr"));
 * 
 * java.util.Iterator<WebElement> itrr = optss.iterator();
 * 
 * for(WebElement optt:optss) {
 * 
 * System.out.println(optt.getText()); } WebElement row =
 * driver.findElement(By.xpath("//*[@Class='tableFixHead']//table//tbody//tr[9]"
 * ));
 * 
 * js.executeScript("arguments[0].scrollIntoView(true);", row);
 * 
 * List<WebElement> prices =
 * driver.findElements(By.xpath("//*[@class=\"tableFixHead\"]//table//td[4]"));
 * java.util.Iterator<WebElement> itr11 =prices.iterator();
 * 
 * int sum = 0 ;
 * 
 * 
 * for(WebElement price:prices) { String priceof = price.getText();
 * 
 * int priceofproduct = Integer.parseInt(priceof);
 * 
 * sum = sum + priceofproduct;
 * 
 * 
 * } System.out.println(sum);
 * 
 * Actions action = new Actions(driver);
 * action.moveToElement(driver.findElement(By.cssSelector("#mousehover"))).build
 * ().perform();
 * 
 * driver.switchTo().frame("courses-iframe"); //dr
 * 
 * mousehover List<WebElement> li =
 * driver.findElements(By.cssSelector("#product tbody tr "));
 * 
 * 
 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
 * wait.until(ExpectedConditions.visibilityOf(null));
 * 
 * 
 * FluentWait <WebDriver> wait1 = new FluentWait<>(driver)
 * 
 * .withTimeout(Duration.ofSeconds(0)) .pollingEvery(Duration.ofSeconds(0))
 * .ignoring(NoSuchElementException.class);
 * 
 * 
 * File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 * 
 * File src = new File("Path"+"jpeg"); FileUtils.copyFile(file, src);
 * 
 * 
 * 
 * 
 * 
 * 
 * //Data Driven --> For this we need to add POI and OOXML dependecncy
 * 
 * 
 * FileInputStream fis = new FileInputStream("Path");
 * 
 * 
 * WorkBook workbook = WorkbookFactory.create()
 * 
 * 
 * }
 * 
 * private static int ParserInterpreter(String priceof) { // TODO Auto-generated
 * method stub return 0; } //}
 */