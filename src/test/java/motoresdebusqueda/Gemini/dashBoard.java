package motoresdebusqueda.Gemini;

import motoresdebusqueda.Gemini.steps.UsuarioGemini;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class dashBoard {

    @Steps
    UsuarioGemini Jason;

    @Managed
    WebDriver driver;

    @Test
    public void S2_Gemini() throws InterruptedException {
        Jason.ingresarGemini();
        Jason.ingresarLogin();
        Jason.ingresarDashBoard();
    }
}
