package Hooks;

import Pages.BasePage;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @After
    public static void EliminarDriver(){
        BasePage.cerrarNavegador();
    }
}
