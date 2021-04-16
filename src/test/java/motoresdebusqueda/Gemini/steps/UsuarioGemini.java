package motoresdebusqueda.Gemini.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import motoresdebusqueda.Gemini.pageobject.GeminiIngreso;
import motoresdebusqueda.Gemini.pageobject.pageDashBoard;
import net.thucydides.core.annotations.Steps;

public class UsuarioGemini {
    String actor;

    GeminiIngreso paginaPrincipal;
    pageDashBoard paginaDashBoard;

    @Given("^El usuario entra a la URL Gemini$")
    public void ingresarGemini() {
        paginaPrincipal.setDefaultBaseUrl("http://processa6.ongemini.com/account/login");
        paginaPrincipal.open();
    }

    @When("^El usuario debe ingresar a la plataforma Gemini$")
    public void ingresarLogin() throws InterruptedException {
        paginaPrincipal.login();
    }

    @Then("^El usuario debe poder ingrear al DashBoard y ejecutar distintas acciones$")
    public void ingresarDashBoard() throws InterruptedException {
        paginaDashBoard.Dashboard();
    }


}
