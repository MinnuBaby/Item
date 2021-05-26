package course_api.springbootstarter.item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class BusinessService
{
	private List<Item> items = new ArrayList<>(Arrays.asList
				(
						new Item("Item1","UV MARKER","desc1",50),
						new Item("Item2","XYZ12345AS","desc2",100),
						new Item("Item3","EFG34567BF","desc3",150),
						new Item("Item4","XYZ135788S","desc4",200),
						new Item("Item5","TOMBOW","desc5",250),
						new Item("Item6","WATERMAN","desc6",300),
						new Item("Item7","ESSELTE","desc7",350),
						new Item("Item8","DUNHILL","desc8",400),
						new Item("Item9","DGH3488S","desc9",450),
						new Item("Item10","CAMLIN","desc10",500),
						new Item("Item11","WSX234RTY","desc11",550),
						new Item("Item12","ANOTO","desc12",600),
						new Item("Item13","VHGFYRUI","desc13",650),
						new Item("Item14","CARTIER","desc14",700),
						new Item("Item15","OPDWTYY","desc15",750),
						new Item("Item16","KIROF234","desc16",800),
						new Item("Item17","SQWEE123","desc17",850),
						new Item("Item18","SRTYUUIO","desc18",900),
						new Item("Item19","KASLLSW","desc19",950),
						new Item("Item20","KASERRW","desc20",120)						
				));
	
	public List<Item> getallitems() 
	{
		return items.stream().sorted().collect(Collectors.toList());
	}
	public Item get_item(String id)
	{
		return items.stream().filter(i->i.getId().equals(id)).findFirst().get();
	}
	public void addItem(Item item) 
	{
		items.add(item);
	}
	public void UpdateItem(Item item,String id) 
	{
		for(int i =0;i<items.size();i++)
		{
			Item t =items.get(i);
			if(t.getId().equalsIgnoreCase(id))
			{
				items.set(i,item);
				return;
			}
		}
	}
	public void deleteItem(String id)
	{
		items.removeIf(i->i.getId().equals(id))	;
	}
}
