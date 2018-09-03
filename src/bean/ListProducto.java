package bean;

import java.util.ArrayList;
import java.util.List;



public class ListProducto {

	private List<Producto> productos;
	
	public ListProducto()
	{
		productos= new ArrayList<Producto>();
		
		}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void addProducto(Producto producto){
		productos.add(producto);
		
	}
	
	public boolean removeProdcuto(Producto producto) {
		return productos.remove(producto);
	}
	
	public Producto getProductoPorId(int id){
		for(Producto u : productos){
			if(u.getId()==id)
				return u;
		}
		return null;
	}
	
	public int size(){
		return productos.size();
	}
	
}
