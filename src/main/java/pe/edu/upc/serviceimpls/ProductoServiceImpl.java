package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IProductoDao;
import pe.edu.upc.entities.Producto;
import pe.edu.upc.serviceinterfaces.IProductoService;
	@Named
	@RequestScoped
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
		pDao.delete(idProducto);
	}

	@Override
	public List<Producto> findByNameProduct(Producto p) {
		// TODO Auto-generated method stub
		return pDao.findByNameProduct(p);
	}
	
}
