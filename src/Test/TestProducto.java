package Test;

import java.util.Date;
import java.util.List;

import Dao.TblProductoImp;
import model.TblProducto;

public class TestProducto {

	public static void main(String[] args) {
		
			// realizamos nuestras respectivas instancias
		
				TblProducto tblprod = new TblProducto();
				TblProductoImp tblprodimp = new TblProductoImp();
				
			//**********testeamos el metodo registrar
								
				/*tblprod.setNombret1("Escritorio");
				tblprod.setPreciot1(600);				
				tblprod.setDescripciont1("Grande");
				tblprod.setEstadot1("Viejo");				
				
				Date fecha = new Date();
				Date fechasql = new Date(fecha.getTime());
				tblprod.setFechavencit1(fechasql);
				tblprod.setFechafabrit1(fechasql);
				
				//invocamos el metodo registrar
				
				tblprodimp.RegistrarProducto(tblprod);
				 //emitimos mensaje por consola
				
				System.out.println("Dato registrado correctamente");*/
				
				
			//***********testeamos el metodo actualizar
				/*tblprod.setIdproductot1(5);
				tblprod.setNombret1("Escritorio");
				tblprod.setPreciot1(600);				
				tblprod.setDescripciont1("Modificado");
				tblprod.setEstadot1("Viejo");				
				
				Date fecha = new Date();
				Date fechasql = new Date(fecha.getTime());
				tblprod.setFechavencit1(fechasql);
				tblprod.setFechafabrit1(fechasql);
				
				//invocamos el metodo actualizar
				tblprodimp.ActualizarProducto(tblprod);
				
				//emitimos mensaje por consola		
				System.out.println("Dato Actualizado correctamente");*/
				
				
			//************testeamos para eliminar numero 5
				/*tblprod.setIdproductot1(5);
				
				//invoco el metodo a elimnar
				tblprodimp.EliminarProducto(tblprod);
				
				//emitimos mensaje por consola
				System.out.println("Dato eliminado correctamente");*/
				
				
			//************testeamos el metodo buscar producto
				//buscar producto 4
				/*tblprod.setIdproductot1(4);
				TblProducto tblproducto = tblprodimp.BuscarProducto(tblprod);
				//imprimimos por pantalla
				System.out.println("Codigo..............: " + tblproducto.getIdproductot1() + "\n" +
								   "Nombre del producto.: " + tblproducto.getNombret1() + "\n" +
								   "Precio del producto.: " + tblproducto.getPreciot1() + "\n" +
								   "Descripcion.........: " + tblproducto.getDescripciont1() + "\n" +
								   "Estado..............: " + tblproducto.getEstadot1() + "\n" +
								   "Fecha de vencimiento: " + tblproducto.getFechavencit1() + "\n" +
								   "Fecha de fabricacion: " + tblproducto.getFechafabrit1());*/
				
				
			//************testeamos el metodo listar
				List<TblProducto> listado = tblprodimp.ListadoProductos();
				
				for(TblProducto lis:listado){
					//imprimimos por pantalla
					
					System.out.println("Codigo..............: " + lis.getIdproductot1() + "\n" +
							   		   "Nombre del producto.: " + lis.getNombret1() + "\n" +
							   		   "Precio del producto.: " + lis.getPreciot1() + "\n" +
							   		   "Descripcion.........: " + lis.getDescripciont1() + "\n" +
							   		   "Estado..............: " + lis.getEstadot1() + "\n" +
							   		   "Fecha de vencimiento: " + lis.getFechavencit1() + "\n" +
							   		   "Fecha de fabricación: " + lis.getFechafabrit1() + "\n" +
									   "-----------------------------");					
			
				} // fin del bucle
		

	} //fin del metodo

}
