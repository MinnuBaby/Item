import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


    public class Item {
    	 private int itemid;
    	    private String shortDescription;
    	    private double price;
    	    private String brand;
    
    
     Item(int itemid, String shortDescription, double price, String brand) {
	    	   this.itemid=itemid;
	    	   this.shortDescription=shortDescription;
	    	   this.price=price;
	    	   this.brand=brand;
	    	   
			}
    @Override
	public String toString() {
		return "Item [itemid=" + itemid + ", shortDescription=" + shortDescription + ", price=" + price + ", brand="
				+ brand + "]";
	}
	public int getId() {
        return itemid;
    }

    public String getDescription() {
        return shortDescription;
    }
    public double getprice() {
        return price;
    }
    public String getbrand() {
        return brand;
    }

  
   }
     class itemmanager
     {
		public static void main(String[] args)
	    {
	        List<Item> Itemnew =new ArrayList();
	        		
	        Itemnew.add(new Item(1,"UV MARKER PENS", 700.0,"UV MARKER"));
	        Itemnew.add(new Item(2,"TOMBOW PENS", 600.0,"TOMBOW"));
	        Itemnew.add(new Item(3,"WATERMAN PENS", 100.0,"WATERMAN"));
	        Itemnew.add(new Item(4,"YARD-O-LED PENS", 200.0,"YARD-O-LED"));
	        Itemnew.add(new Item(5,"ESSELTE PENS", 300.0,"ESSELTE"));
	        Itemnew.add(new Item(6,"DUNHILL PENS", 400.0,"DUNHILL"));
	        Itemnew.add(new Item(7,"CAMLIN PENS", 600.0,"CAMLIN"));
	        Itemnew.add(new Item(8,"BEROL PENS", 700.0,"BEROL"));
	        Itemnew.add(new Item(9,"ANOTO PENS", 800.0,"ANOTO"));
	        Itemnew.add(new Item(10,"CARTIER PENS", 900.0,"CARTIER"));
	        
	        List<Item> itemBrandstartwithT = Itemnew
	        		  .stream()
	        		  .filter(c -> c.getbrand().startsWith("T"))
	        		  .sorted((item1,item2)-> Double.compare(item1.getprice(), item2.getprice()))
	        		  .collect(Collectors.toList());
	        
	        List<Item> itembysortedprice = Itemnew
	        		  .stream()
	        		  .sorted((item1,item2)-> item1.getprice()<item2.getprice()?1:-1)
	        		  .collect(Collectors.toList());
	        System.out.println("item  Brand starts with T");
	        itemBrandstartwithT.forEach(word -> System.out.println(word));
	        System.out.println("item  Sorted by highest price");
	        itembysortedprice.forEach(word -> System.out.println(word));	

	        
	     }
     }


