import com.google.gson.internal.$Gson$Preconditions;

import java.util.ArrayList;

public class Order {
    private String id;
    private String date;
    User user;

 public ArrayList< Item > items = new ArrayList < Item > ();

     // Getter Methods

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Item> getItems() {
        return items; }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setUser(User userObject) {
        this.user = userObject;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}


