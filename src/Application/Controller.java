package Application;

import Domain.DB;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextArea;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    ListView listView;
    @FXML
    TextArea textArea;


    public void initialize() {
        DB.selectSQL("Select title from tblVideos");



        for (int i = 0; i < 2; i++) {
            listView.getItems().addAll(DB.getDisplayData());
        }

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);




        }


        public void listViewButtonPushed(){
        String textAreaString = "";
            ObservableList listOfItems = listView.getSelectionModel().getSelectedItems();

            for (Object item : listOfItems)
            {
                textAreaString += String.format("%s%n",(String) item);
            }
            this.textArea.setText(textAreaString);
        }
    }







