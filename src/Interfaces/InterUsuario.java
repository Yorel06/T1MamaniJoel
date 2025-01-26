package Interfaces;

import java.util.List;

import model.TblUsuario;


public interface InterUsuario {

	//declaramos los metodos..
	
			void RegistrarUsuario(TblUsuario tblusuario);
			void ActualizarUsuario(TblUsuario tblusuario);
			void EliminarUsuario(TblUsuario tblusuario);
			TblUsuario BuscarUsuario(TblUsuario tblusuario);
			List<TblUsuario> ListadoUsuarios();
	
} // fin de la interfaz
