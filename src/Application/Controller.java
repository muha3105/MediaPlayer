package Application;


import Domain.Search;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;
import java.net.URL;
import java.util.ResourceBundle;
import Domain.DB;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextArea;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class Controller implements Initializable {

    @FXML
    TableView<Search> tbData, tbData2;
    @FXML
    TableColumn<Search, String> title;

    @FXML
    TableColumn<Search, String> category;

    @FXML
    TableColumn<Search, String> title2;

    @FXML
    TableColumn<Search, String> category2;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        title.setCellValueFactory(new PropertyValueFactory<>("Title"));
        category.setCellValueFactory(new PropertyValueFactory<>("Category"));

        title2.setCellValueFactory(new PropertyValueFactory<>("Title"));
        category2.setCellValueFactory(new PropertyValueFactory<>("Category"));

        tbData.setItems(search);
    }

    private ObservableList<Search> search = FXCollections.observableArrayList(
            new Search("Chandalier","Music"),
            new Search("hello", "adele")
    );

    public void select() {
        Search selection = tbData.getSelectionModel().getSelectedItem();

        if (selection != null) {

            tbData2.getItems().add(new Search(selection.getTitle(), selection.getCategory()));
        }
    }
}







