package principal;

import conexao.DAO;

public class Principal {
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.conectar();
		
		// Inser��o de um produto dentro da tabela
		Produto produto1 = new Produto(4, "Amazon Alexa", 350.00, 15);
		if(dao.inserirProduto(produto1) == true) {
			System.out.println("Inser��o com sucesso -> " + produto1.toString());
		}

		Produto[] produtos = dao.getProdutos();
		
		// Mostrar produtos
		produtos = dao.getProdutos();
		System.out.println("\n==== Mostrar produtos === ");		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
			System.out.println("\n");
		}
		
		// Atualizar estoque da loja 
		produto1.setQuantidadeEstoque(14);
		dao.atualizarProduto(produto1);
		
		// Mostrar produtos
		produtos = dao.getProdutos();
		System.out.println("\n==== Mostrar produtos (Ap�s atualiza��o) === ");		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
			System.out.println("\n");
		}
		
		/*	M�todo para excluir do BD, por�m n�o quis excluir executando
		 * 
		 * Excluir produto
		 * dao.excluirProduto(produto1.getCodigo());
		 * 
		 */
		
		dao.close();
		
	}
}