package java_hm_7.task_1;

import java.util.List;

public class main {
    public static void main(String[] args) {
     Warehouse<String> warehouse = new Warehouse<>();
        System.out.println("Add items");
        warehouse.addItem("Computer");
        warehouse.addItem("Laptop");
        System.out.println("Items in warehouse: " + warehouse.veiwItems());
        System.out.println("Number of items");
        System.out.println("Number: " + warehouse.getItemCount());
        System.out.println("Check warehouse");
        System.out.println("Warehouse is empty: " + warehouse.isEmpty());
        System.out.println("Veiw item");
        System.out.println(warehouse.veiwItems());
        System.out.println("Take all the item");
        List<String> items = warehouse.retrieveAll();
        System.out.println("Taken items: " + items);
        System.out.println("Audit after retrieveAll");
        System.out.println("Warehouse empty: " + warehouse.isEmpty());
        System.out.println("Add new items");
        warehouse.addItem("Playstation");
        warehouse.addItem("Xbox");
        System.out.println("Items: " + warehouse.veiwItems());
        System.out.println("Claer warehouse");
        warehouse.clear();
        System.out.println("Warehouse is clear: " + warehouse.isEmpty());
    }
}
