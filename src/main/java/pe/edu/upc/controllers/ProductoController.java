package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Producto;
import pe.edu.upc.serviceinterfaces.IProductoService;
@Named
@RequestScoped
public class ProductoController {
	@Inject
	private IProductoService pService;
	
	
	//atributos
	private Producto p;
	List <Producto> listaProductos;
	
	//metodos
	@PostConstruct
	public void init() {
		this.listaProductos = new ArrayList<Producto>();
		this.p = new Producto();
		this.list();
	}
	
	public String newProducto() {
		this.setP(new Producto());
		return "producto.html";
	}
	
	public void insert()
	{
		try {
			pService.insert(p);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ocurrio en el controlador de producto al insertar !!");
		}
	}
	public void list() {
		try {
			listaProductos = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar productos en el controller !!");	
			// TODO: handle exception
		}
	}
	public void eliminar(Producto pro) {
		
			pService.eliminar(pro.getIdProducto());
			list();
	}
	//getters and setters
	public Producto getP() {
		return p;
	}
	public void setP(Producto p) {
		this.p = p;
	}
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	
	
	
	
	
}
