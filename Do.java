import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Do {
    private WebDriver driver;
    public static void setProperty(){
        System.setProperty("webdriver.chrome.driver", "/Users/hofcoral/IdeaProjects/ObjectsTesting/src/DriverFolder/chromedriver");
    }
    public static void space(int times){
        for(int i = 0; i < times; i++){
            System.out.println();
        }
    }
    public static ChromeOptions options(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        return chromeOptions;
    }
    public static void waitSec(int value) throws InterruptedException {
        TimeUnit.SECONDS.sleep(value);
    }

    public static int random(int lowerBound, int upperBound) {
        Random ran = new Random();
        return ran.nextInt(upperBound - lowerBound) + lowerBound;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        IntStream r = ran.ints();
        System.out.println(r);
    }
}
