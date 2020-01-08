package Domain;

import javafx.beans.property.SimpleStringProperty;

public class Search {

    private SimpleStringProperty title;
    private SimpleStringProperty category;

    public String getTitle() {
        return title.get();
    }


    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getCategory() {
        return category.get();
    }


    public void setCategory(String category) {
        this.category.set(category);
    }



    public Search(String title, String category){
        this.title = new SimpleStringProperty(title);
        this.category = new SimpleStringProperty(category);



    }

}
