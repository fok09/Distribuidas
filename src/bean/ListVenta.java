package bean;

import java.util.List;
import java.util.ArrayList;

public class ListVenta {
	
		private List<Venta> ventas;
		
		public ListVenta()
		{
			ventas= new ArrayList<Venta>();
			
			}
		
		public List<Venta> getVentas() {
			return ventas;
		}
		
		public void setVentas(List<Venta> ventas) {
			this.ventas = ventas;
		}
		
		public void addVenta(Venta venta){
			ventas.add(venta);
			
		}
		
		public boolean removeProdcuto(Venta venta) {
			return ventas.remove(venta);
		}
		
		public Venta getVentaPorId(int id){
			for(Venta u : ventas){
				if(u.getId()==id)
					return u;
			}
			return null;
		}
		
		public int size(){
			return ventas.size();
		}
		
	

}
