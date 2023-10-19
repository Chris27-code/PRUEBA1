package Hooks;

import Pages.BasePage;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public static void CrearDriver(){
        BasePage.abrirNavegador();
    }
    @After
    public static void EliminarDriver(){
        BasePage.cerrarNavegador();
    }
}
