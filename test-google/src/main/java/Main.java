import me.bramar.undetectedselenium.UndetectedChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.out.println("Starting Chrome...");

        UndetectedChromeDriver driver = null;

        try {

            driver = UndetectedChromeDriver.builder().build();

            System.out.println("Chrome started.");

            driver.get("https://www.instagram.com");

            System.out.println("Instagram opened.");
            System.out.println("Title: " + driver.getTitle());

            Thread.sleep(30000);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (driver != null) {
                driver.quit();
            }
        }
    }
}