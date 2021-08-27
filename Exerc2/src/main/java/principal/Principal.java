package principal;

import conexao.DAO;

public class Principal {
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.conectar();
		
		// Inserção de um produto dentro da tabela
		Produto produto1 = new Produto(4, "Amazon Alexa", 350.00, 15);
		if(dao.inserirProduto(produto1) == true) {
			System.out.println("Inserção com sucesso -> " + produto1.toString());
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
		System.out.println("\n==== Mostrar produtos (Após atualização) === ");		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
			System.out.println("\n");
		}
		
		/*	Método para excluir do BD, porém não quis excluir executando
		 * 
		 * Excluir produto
		 * dao.excluirProduto(produto1.getCodigo());
		 * 
		 */
		
		dao.close();
		
	}
}