package course_api.springbootstarter.item;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController 
{
	@Autowired
	private BusinessService business_service; // creating an instance to business class . all things can be written in business class
	
	@RequestMapping("/getAll")
	public List<Item> getallitems() 
	{
		return business_service.getallitems();
	}
	@RequestMapping("/getAll2")
	public List<Item> getallitems2() 
	{
		return Arrays.asList
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
				);
	}
	@RequestMapping("/getAll/{id}")
	public Item GetSingleItem(@PathVariable String id)
	{
		return business_service.get_item(id);
	}
	@RequestMapping(method = RequestMethod.POST,value = "/setItem")
	public void addItem(@RequestBody Item item)
	{
		business_service.addItem(item);
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updateItem/{id}")
	public void UpdateItem(@RequestBody Item item,@PathVariable String id)
	{
		business_service.UpdateItem(item,id);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deleteItem/{id}")
	public void DeleteItem(@PathVariable String id)
	{
		business_service.deleteItem(id);
	}
}
