package activity.lista;

import appiumControl.Button;
import appiumControl.Control;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class MyListActivity {
    public TextBox listTitle;
    public TextBox listNote;
    public Button saveButton;
    public Control resultLabel;

    public MyListActivity(){
        listTitle = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        listNote = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Guardar\"]"));
    }
}
