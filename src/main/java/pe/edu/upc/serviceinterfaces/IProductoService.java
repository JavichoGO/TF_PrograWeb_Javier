package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Producto;

public interface IProductoService {
	public void insert(Producto p);
	public List<Producto> list();
	public void delete(int idProducto);
	public void eliminar(int idProducto);
}
