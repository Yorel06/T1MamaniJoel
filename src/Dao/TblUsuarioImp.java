package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.InterUsuario;
import model.TblUsuario;

public class TblUsuarioImp implements InterUsuario {

	@Override
	public void RegistrarUsuario(TblUsuario tblusuario) {
	
		// nos conectamos para poder registra datos en la BD
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em=emf.createEntityManager();
						
		try{
		//iniciamos la transaccion
		em.getTransaction().begin();
							
		//invocamos el metodo registrar
				
		em.persist(tblusuario);
							
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
	public void ActualizarUsuario(TblUsuario tblusuario) {
		
		//actualizar los registros
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em = emf.createEntityManager();
						
		try{
		//iniciamos la transaccion			
		em.getTransaction().begin();
							
		//invocamos el metodo actualizar
		em.merge(tblusuario);
							
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
	public void EliminarUsuario(TblUsuario tblusuario) {
		
		// eliminar registros de la bd
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em = emf.createEntityManager();
						
		try{
		//iniciamos la transaccion			
		em.getTransaction().begin();
							
		//recuperamos el codigo a eliminar
		TblUsuario eliminaruser = em.find(TblUsuario.class, tblusuario.getIdusuariot1());
										
		//aplicamos una condicion
		if(tblusuario!=null){
		//eliminamos el codigo
		em.remove(eliminaruser);
								
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
	public TblUsuario BuscarUsuario(TblUsuario tblusuario) {
		
		//para realizar la busqueda
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em = emf.createEntityManager();
						
		//hacemos la respectva instancia
		TblUsuario buscaruser = null;
						
		try{
		//iniciamos la transaccion
		em.getTransaction().begin();
							
		//buscamos el respectivo codigo
		buscaruser = em.find(TblUsuario.class, tblusuario.getIdusuariot1());
							
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
						
		return buscaruser;
						
				
		} //fin del metodo

	@Override
	public List<TblUsuario> ListadoUsuarios() {
		
		//para realizar el listado de productos
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_T1_MamaniVilcaJoel");
		EntityManager em = emf.createEntityManager();
						
		List<TblUsuario> listado = null;
						
		try{
		//iniciamos la transaccion
			em.getTransaction().begin();
							
		//aplicamos consultas JPQL
		listado = em.createQuery("select c from TblUsuario c", TblUsuario.class).getResultList();
							
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
