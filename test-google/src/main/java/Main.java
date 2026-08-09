import me.bramar.undetectedselenium.UndetectedChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Starting Chrome...");

        UndetectedChromeDriver driver =
                UndetectedChromeDriver.builder().build();

        System.out.println("Chrome started.");

        driver.get("https://www.instagram.com");

        System.out.println("Instagram opened.");
        System.out.println("Title: " + driver.getTitle());

        System.out.println("LOGIN TO THE INSTAGRAM ACCOUNT");
        //---------------------------------------------------------------
        //                       STEP - 1 MAKING SURE U LOGGEDIN
        //---------------------------------------------------------------
        while (true) { 

            try {

                WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div/div[3]/span[1]/div/a/div"));

                System.out.println("Element found. Clicking...");

                element.click();

                break;

            } catch (Exception e) {

                System.out.println("Waiting for element...");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    break;
                }
            }
        }
        //---------------------------------------------------------------
        //                       STEP - 2 CLICKING ON SELECT
        //---------------------------------------------------------------
        try{
            driver.get("https://www.instagram.com/your_activity/interactions/likes/");
            int i = 0 ; 
            while(i<10){
                try{
                    WebElement select = driver.findElement(By.xpath("//span[normalize-space()='Select']"));
                    System.out.println("SELECT button Found . Clicking ...");
                    select.click();
                }
                catch(Exception e ){
                    Thread.sleep(1000);
                    i++;
                }
            }
        } catch(Exception e){
            System.out.println(e);
        }
        //---------------------------------------------------------------
        //                       STEP - 3 SELECTING IN LOOP
        //---------------------------------------------------------------
        try{
            while(true){
                int j = 0;
                while(j<10){
                    try{
                        WebElement select = driver.findElement(By.xpath("//span[normalize-space()='Select']"));
                        System.out.println("SELECT button Found . Clicking ...");
                        select.click();
                    }
                    catch(Exception e ){
                        Thread.sleep(1000);
                        j++;
                    }
                }
                WebElement button1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/main/div/article/div/div[2]/div/div/div[1]/div/div/div/div/div/div[3]/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div"));
                button1.click();
                Thread.sleep(100);
                WebElement button2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/main/div/article/div/div[2]/div/div/div[1]/div/div/div/div/div/div[3]/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div[2]/div/div/div"));
                button2.click();
                Thread.sleep(100);
                WebElement button3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/main/div/article/div/div[2]/div/div/div[1]/div/div/div/div/div/div[3]/div/div/div[2]/div[1]/div[5]/div[2]/div/div/div/div[2]/div/div/div"));
                button3.click();
                Thread.sleep(100);
                WebElement button4 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/main/div/article/div/div[2]/div/div/div[1]/div/div/div/div/div/div[3]/div/div/div[2]/div[3]/div[1]/div[2]/div/div/div/div[2]/div/div/div"));
                button4.click();
                Thread.sleep(100);
                WebElement button5 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/main/div/article/div/div[2]/div/div/div[1]/div/div/div/div/div/div[3]/div/div/div[2]/div[3]/div[3]/div[2]/div/div/div/div[2]/div/div/div"));
                button5.click();
                Thread.sleep(100);
                WebElement button6 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/main/div/article/div/div[2]/div/div/div[1]/div/div/div/div/div/div[3]/div/div/div[2]/div[3]/div[5]/div[2]/div/div/div/div[2]/div/div/div"));
                button6.click();
                Thread.sleep(100);
                WebElement unlike = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/section/main/div/article/div/div[2]/div/div/div[1]/div/div/div/div/div/div[4]/div/div/div[2]/div/div/div[2]/div/div/div/div"));
                unlike.click();
                WebElement conformation = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/button[1]"));
                conformation.click();
                // Thread.sleep(5000);
            }
        }catch(Exception e){
            System.out.println(e);
        }













        System.out.println("Finished.");
    }
}