package com;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Usuario usuario = new Usuario(4, "Gustavo", "123456",'M');
		if(dao.inserirUsuario(usuario) == true) {
			System.out.println("Inser??o com sucesso -> " + usuario.toString());
		}
		
		//Mostrar usu?rios do sexo masculino		
		System.out.println("==== Mostrar usu?rios do sexo masculino === ");
		Usuario[] usuarios = dao.getUsuariosMasculinos();
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}

		//Atualizar usu?rio
		usuario.setSenha("gay212");
		dao.atualizarUsuario(usuario);

		//Mostrar usu?rios do sexo masculino
		System.out.println("==== Mostrar usu?rios === ");
		usuarios = dao.getUsuarios();
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
		//Excluir usu?rio
// 	      dao.excluirUsuario(usuario.getCodigo());
		
		//Mostrar usu?rios
		usuarios = dao.getUsuarios();
		System.out.println("==== Mostrar usu?rios === ");		
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
		dao.close();
	}
}
