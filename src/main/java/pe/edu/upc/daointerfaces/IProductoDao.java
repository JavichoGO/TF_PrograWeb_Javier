package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Producto;

public interface IProductoDao {
	public void insert(Producto p);
	public List<Producto> list();

	public void eliminar(int idProducto);
	
}
