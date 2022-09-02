import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExemploCTG {

    @Test
    @DisplayName("Quando pegar o site principal, então devo ver o título")
    public void verificaHomePage () {

        WebDriver driver = new ChromeDriver();
        String basePage = "https://viniciuspessoni.com/";

        driver.get(basePage);
        driver.close();
    }

}
