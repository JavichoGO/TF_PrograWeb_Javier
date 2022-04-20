package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IProductoDao;
import pe.edu.upc.entities.Producto;

public class ProductoImpl implements IProductoDao {
	@PersistenceContext(unitName = "TF_Javier")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Producto p) {
		// TODO Auto-generated method stub
		try {
			em.persist(p);
		} // OCURRIR UN ERROR
		catch (Exception e) {
			System.out.println("Error al insertar producto en DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> list() {
		List<Producto> listaProductos = new ArrayList<Producto>();
		try {
			Query jpql = em.createQuery("from Producto p");
			listaProductos = (List<Producto>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de Producto");
		}
		return listaProductos;
	}
@Transactional
	@Override
	public void eliminar(int idProducto) {
		Producto pro = em.find(Producto.class, idProducto);
			em.remove(pro);
	}

}
