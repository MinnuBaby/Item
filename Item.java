package course_api.springbootstarter.item;
import lombok.NonNull;
import lombok.Getter;
import lombok.Setter;


public class Item implements Comparable<Item>
{
	
	private String id;
	@Getter@Setter
	private String brand;
	@Getter@Setter
	private String description;
	@Getter@Setter
	private int price;
	
	
	 public String getId() 
	 {
		 return id;
	 } 
	 public void setId(String id) 
	 { 
		 this.id=id; 
	 }
	 
	
	  public String getBrand()
	  { return brand; }
	  public void setBrand(String brand)
	  { this.brand = brand; }
	  public String getDescription()
	  { return description; }
	  public void setDescription(String description) 
	  { this.description = description; }
	 
	
	  public int getPrice()
	  {
		  return price;
	  }
	  public void setPrice(int price) 
	  {
		  this.price = price; 
	  }
	 
	
	public Item(@NonNull String id, String brand, String description, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.description = description;
		this.price = price;
	}
	public Item() 
	{
		
	}
	@Override
	public int compareTo(Item arg0) 
	{
		if(arg0.getPrice() > this.price)
			return 1;
		else if(arg0.getPrice() < this.getPrice())
			return -1;
		else
			return 0;
	}
}
