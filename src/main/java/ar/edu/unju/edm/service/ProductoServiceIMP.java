package ar.edu.unju.edm.service;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;

@Service
public class ProductoServiceIMP implements ProductoService{
	
	private static final Log LOGGER = LogFactory.getLog(ProductoServiceIMP.class);
	
	@Autowired
	Producto unProducto;
	
	ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	
	@Override
	public void guardarP(Producto unProducto) {
		// TODO Auto-generated method stub
		System.out.println(unProducto.getNombreP());
		listaDeProductos.add(unProducto);
		System.out.println(listaDeProductos.size());
		
		LOGGER.info("METHOD: Ingresando a Guardar Producto");
		LOGGER.info("RESULT: guardado" + listaDeProductos.get(listaDeProductos.size()-1).getNombreP());
	}

	@Override
	public Producto obtenerUnP(String nombreP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Producto> obtenerTodosP() {
		// TODO Auto-generated method stub
		return listaDeProductos;
	}

	@Override
	public Producto obtenerNuevoP() {
		// TODO Auto-generated method stub
		return unProducto;
	}
	
	@Override
	public Producto obtenerUltimoP() {
		// TODO Auto-generated method stub
		int i = listaDeProductos.size() - 1;
		return listaDeProductos.get(i);
	}
	
}
