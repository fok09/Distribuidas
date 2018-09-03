package bean;

import java.util.ArrayList;
import java.util.List;


public class ListItemVenta {
	
	private List<ItemVenta> items;
	
	public ListItemVenta()
	{
		items= new ArrayList<ItemVenta>();
		
	}
	
	public List<ItemVenta> getListItemVentas() {
		return items;
	}
	
	public void setListItemVentas(List<ItemVenta> items) {
		this.items = items;
	}
	
	public void addListItemVenta(ItemVenta item){
		items.add(item);
		
	}
	
	public boolean removeProdcuto(ItemVenta item) {
		return items.remove(item);
	}
	
	public ItemVenta getItemVentaPorId(int id){
		for(ItemVenta u : items){
			if(u.getId()==id)
				return u;
		}
		return null;
	}
	
	public int size(){
		return items.size();
	}
	
}
