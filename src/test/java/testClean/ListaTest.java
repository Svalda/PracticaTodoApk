package testClean;

import activity.lista.MainActivity;
import activity.lista.MyListActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class ListaTest {

    MainActivity mainActivity = new MainActivity();
    MyListActivity myListActivity = new MyListActivity();

    @Test
    public void verifyCreateList() throws MalformedURLException {

        //String listTitle = "Reunion de trabajo";

        mainActivity.addListButton.click();
        myListActivity.listTitle.type("Reunion de trabajo");
        myListActivity.listNote.type("Preparar informes y presentacion");
        myListActivity.saveButton.click();

        //verificacion

        String expectedResult = "Reunion de trabajo";
        Assert.assertTrue("Error, la lista no fue creada",mainActivity.isDisplayedList(expectedResult));

    }
    /*
    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
*/
}
