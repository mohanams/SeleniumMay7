package Day7;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	public static void main(String[] args) {
		
	    List<Item> itemList = new ArrayList<Item>();
	    double totalinventoryvalue=0.0;
	    itemList.add(new Item("pencil", 5.0, 5));
	    itemList.add(new Item("pen", 10.0, 10));
	    itemList.add(new Item("Eraser", 2.0, 15));
		System.out.println(String.format("%-10s%-10s%-10s%-10s", "Name", "Price", "Quantity","InventoryValue"));
        for(Item i : itemList)
        {
            System.out.println(String.format("%-10s%-10s%-10s%-10s", i.getName(),i.getPrice(),i.getQuantity(),i.getValue()));
            totalinventoryvalue=totalinventoryvalue+i.getValue();
        }
        System.out.println("total inventory value of the store is "+totalinventoryvalue);
	}

}
