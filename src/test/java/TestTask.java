
import com.google.gson.Gson;
import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestTask<address> {
    Order order;

    // Getter Methods

    public Order getOrder() {
        return order;
    }

    // Setter Methods

    public void setOrder(Order orderObject) {
        this.order = orderObject;
    }

    public static void main(String[] args) {

        TestTask.Test1();
        TestTask.Test2();

    }

    private static void Test1() {
        System.out.println("Test1 is starting");
        TestTask type = new TestTask();
        ArrayList<Item> test1 = type.ifExistItem("computer appliences");
        for (Item result : test1) {
            System.out.println("Items with type ---computer appliences--- : " + result.getTitle());
        }
        }


    private static void Test2() {
        System.out.println("Test2 is starting");
        TestTask type = new TestTask();
        ArrayList<Order> test2 = type.ifExistAdress("Moldova");
        for (Order result : test2)
            System.out.println("Users with order from country ---Moldova--- : " + result.getUser().getUsername() );
    }

    private ArrayList<Item> ifExistItem(String s){
        ArrayList<Item> items = new ArrayList<Item>();
        ArrayList<Order> orders = TestTask.JsonReader();
        for (Order order : orders) {
            for (Item item : order.getItems()) {
                if (item.getType().equals(s)) {
                    items .add(item);

                }
            }
        }
        return items;
    }

    private ArrayList<Order> ifExistAdress(String s){
        ArrayList<Order> address = new ArrayList<Order>();
        ArrayList<Order> orders = TestTask.JsonReader();
        for (Order order : orders) {
            if (order.getUser().getAddress().getCountry().equals(s)) {
                    address.add(order);

                }
            }
        return address;
        }




    private static ArrayList<Order> JsonReader() {
        ArrayList<Order> orders = new ArrayList<Order>();
        String[] fileNames = {"Order.json", "Order2.json", "Order3.json", "Order4.json"};
        for (String fileName : fileNames) {
            Gson gson = new Gson();

            try {
                Reader reader = new FileReader(fileName);
                // Convert JSON File to Java Object
                TestTask newObject = gson.fromJson(reader, TestTask.class);
                orders.add(newObject.order);

                // print staff
                //System.out.println(newObject.getOrder().getUser().getAddress().getStreet());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return orders;
    }


}
