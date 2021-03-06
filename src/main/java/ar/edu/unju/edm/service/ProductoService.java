package ar.edu.unju.edm.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;

@Service
public interface ProductoService {
	
	public void guardarP(Producto unProducto);
	public Producto obtenerUnP(String nombreP);
	public ArrayList<Producto> obtenerTodosP();
	public Producto obtenerNuevoP();
	Producto obtenerUltimoP();
	
}
