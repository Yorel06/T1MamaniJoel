package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.InterProducto;
import model.TblProducto;

public class TblProductoImp implements InterProducto {

	@Override
	public void RegistrarProducto(TblProducto tblproducto) {
		
		// nos conectamos para poder registra datos en la BD
				
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em=emf.createEntityManager();
				
		try{
		//iniciamos la transaccion
		em.getTransaction().begin();
					
		//invocamos el metodo registrar
		
		em.persist(tblproducto);
					
		//confirmamos
		em.getTransaction().commit();
					
		}catch(RuntimeException e){
		e.getMessage();
					
		}finally{
		//cerrramos
		em.close();
					
		}		
				
	} //fin del metodo

	@Override
	public void ActualizarProducto(TblProducto tblproducto) {
		
		//actualizar los registros
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em = emf.createEntityManager();
				
		try{
		//iniciamos la transaccion			
		em.getTransaction().begin();
					
		//invocamos el metodo actualizar
		em.merge(tblproducto);
					
		//confirmamos
		em.getTransaction().commit();
					
		}catch(RuntimeException e){
		//en caso de error
		e.getMessage();
					
		}finally{
		
		em.close();
		}
				
	} //fin del metodo

	@Override
	public void EliminarProducto(TblProducto tblproducto) {
		
		// eliminar registros de la bd
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em = emf.createEntityManager();
				
		try{
		//iniciamos la transaccion			
		em.getTransaction().begin();
					
		//recuperamos el codigo a eliminar
		TblProducto eliminarproduc = em.find(TblProducto.class, tblproducto.getIdproductot1());
								
		//aplicamos una condicion
		if(tblproducto!=null){
		//eliminamos el codigo
		em.remove(eliminarproduc);
						
		//confirmemos
		em.getTransaction().commit();
		}
					
		}catch(RuntimeException e){
		//en caso de error
		if(em.getTransaction().isActive()) em.getTransaction().rollback();			
		e.getMessage();
					
		}finally{
		//cerramos
		em.close();
		}// fin del finally
				
				
	} //fin del metodo

	@Override
	public TblProducto BuscarProducto(TblProducto tblproducto) {
		
		//para realizar la busqueda
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em = emf.createEntityManager();
				
		//hacemos la respectva instancia
		TblProducto buscarprod = null;
				
			try{
			//iniciamos la transaccion
			em.getTransaction().begin();
					
			//buscamos el respectivo codigo
			buscarprod = em.find(TblProducto.class, tblproducto.getIdproductot1());
					
			//confirmamos
			em.getTransaction().commit();
					
			}catch(RuntimeException e){
			//aplicamos una condicion
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
					
			//emitimos un mensaje
			e.getMessage();
					
		}finally{
		//cerramos
		em.close();
					
		}//fin del finally
				
		return buscarprod;
				
		
	} //fin del metodo

	@Override
	public List<TblProducto> ListadoProductos() {
		
		//para realizar el listado de productos
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em = emf.createEntityManager();
				
		List<TblProducto> listado = null;
				
		try{
				//iniciamos la transaccion
			em.getTransaction().begin();
					
			//aplicamos consultas JPQL
			listado = em.createQuery("select c from TblProducto c", TblProducto.class).getResultList();
					
			//confirmamos
			em.getTransaction().commit();
					
		}catch(RuntimeException e){
			//aplicamos una condicion
		if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
					
		}finally{
		//cerramos
		em.close();
					
		}//fin del finally
						
		return listado;
		} //fin del meotodo listar producto	
		
		

}
