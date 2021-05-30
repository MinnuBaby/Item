package course_api.springbootstarter.item;
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
	
	@RequestMapping("/item-details/items/")
	public List<Item> getallitems() 
	{
		return business_service.getallitems();
	}
	
	@RequestMapping("/item-details/items/{id}")
	public Item GetSingleItem(@PathVariable String id)
	{
		return business_service.get_item(id);
	}
	@RequestMapping(method = RequestMethod.POST,value = "/item-details/items/")
	public void addItem(@RequestBody Item item)
	{
		business_service.addItem(item);
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/item-details/items/{id}")
	public void UpdateItem(@RequestBody Item item,@PathVariable String id)
	{
		business_service.UpdateItem(item,id);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/item-details/items/{id}")
	public void DeleteItem(@PathVariable String id)
	{
		business_service.deleteItem(id);
	}
}
