package com.app.ioc;

public class UsuarioImplOracle implements IUsuario {

	@Override
	public void insertaUsuario() {
		// TODO Auto-generated method stub
		System.out.println("Instertando usuario en Oracle");
	}

	@Override
	public void eliminaUsuarioByID(int id) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando usuario en Oracle: " + id);
	}

}
