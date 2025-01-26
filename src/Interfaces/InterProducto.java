package Interfaces;

import java.util.List;

import model.TblProducto;

public interface InterProducto {
	
	//declaramos los metodos..
	
		void RegistrarProducto(TblProducto tblproducto);
		void ActualizarProducto(TblProducto tblproducto);
		void EliminarProducto(TblProducto tblproducto);
		TblProducto BuscarProducto(TblProducto tblproducto);
		List<TblProducto> ListadoProductos();

} // fin de la interfaz
