package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IProductoDao;
import pe.edu.upc.entities.Producto;
import pe.edu.upc.serviceinterfaces.IProductoService;
	@Named
public class ProductoServiceImpl implements IProductoService{
	@Inject	
	private IProductoDao pDao;
	@Override
	public void insert(Producto p) {
		// TODO Auto-generated method stub
		pDao.insert(p);
	}

	@Override
	public List<Producto> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}

	@Override
	public void delete(int idProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idProducto) {
		// TODO Auto-generated method stub
		pDao.eliminar(idProducto);
		
	}

	
}
