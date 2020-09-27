package activity.lista;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addListButton;
    public TextBox listTitle;
    public TextBox listNote;
    public Button saveButton;

    public MainActivity(){
        addListButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        listTitle = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        listNote = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton =new Button(By.xpath("//android.widget.TextView[@content-desc=\"Guardar\""));
    }



    public boolean isDisplayedList(String listTitle){
        //String locator = "com.vrproductiveapps.whendo:id/home_list_item_text";
        Label list = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
        return list.isDisplayed();
    }



}
