package principal;

import conexao.DAO;

public class Principal {
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.conectar();

		
		// Inser��o de um produto dentro da tabela
		Produto produto1 = new Produto(3, "PC Gamer", 8500.00, 15);
		if(dao.inserirProduto(produto1) == true) {
			System.out.println("Inser��o com sucesso -> " + produto1.toString());
		}

		Produto[] produtos = dao.getProdutos();
		
		//Mostrar usu�rios
		produtos = dao.getProdutos();
		System.out.println("\n==== Mostrar usu�rios === ");		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
			System.out.println("\n");
		}
		
		dao.close();
		
	}
}