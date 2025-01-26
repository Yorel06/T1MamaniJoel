package Test;

import java.util.List;

import Dao.TblUsuarioImp;
import model.TblUsuario;

public class TestUsuario {

	public static void main(String[] args) {
		
		// realizamos nuestras respectivas instancias
		
		TblUsuario tbluser = new TblUsuario();
		TblUsuarioImp tbluserimp = new TblUsuarioImp();
		
	//**********testeamos el metodo registrar
						
		/*tbluser.setUsuariot1("pluton");						
		tbluser.setPasswordt1("7875");
				
		//invocamos el metodo registrar
		
		tbluserimp.RegistrarUsuario(tbluser);
		 //emitimos mensaje por consola
		
		System.out.println("Dato registrado correctamente");*/
		
		
	//***********testeamos el metodo actualizar
		/*tbluser.setIdusuariot1(6);
		tbluser.setUsuariot1("modificado");						
		tbluser.setPasswordt1("7875");
		
		//invocamos el metodo actualizar
		tbluserimp.ActualizarUsuario(tbluser);
		
		//emitimos mensaje por consola		
		System.out.println("Dato Actualizado correctamente");*/
		
		
	//************testeamos para eliminar numero 5
		tbluser.setIdusuariot1(6);
		
		//invoco el metodo a elimnar
		tbluserimp.EliminarUsuario(tbluser);
		
		//emitimos mensaje por consola
		System.out.println("Dato eliminado correctamente");
		
		
	//************testeamos el metodo buscar producto
		//buscar producto 5
		/*tbluser.setIdusuariot1(5);
		TblUsuario tblusuario = tbluserimp.BuscarUsuario(tbluser);
		//imprimimos por pantalla
		System.out.println("Codigo......: " + tblusuario.getIdusuariot1() + "\n" +
						   "Usuario.....: " + tblusuario.getUsuariot1() + "\n" +						   
						   "Constraseña.: " + tblusuario.getPasswordt1());*/
		
		
	//************testeamos el metodo listar
		List<TblUsuario> listado = tbluserimp.ListadoUsuarios();
		
		for(TblUsuario lis:listado){
			//imprimimos por pantalla
			
			System.out.println("Codigo......: " + lis.getIdusuariot1() + "\n" +
					   		   "Usuario.....: " + lis.getUsuariot1() + "\n" +						   
					   		   "Constraseña.: " + lis.getPasswordt1() + "\n" +					   		   
							   "-----------------------------");					
	
		} // fin del bucle

} //fin del metodo
}
