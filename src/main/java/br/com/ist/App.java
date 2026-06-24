package br.com.ist;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* ITEM 1 */
		ItemCardapio item1;
        item1 = new ItemCardapio();
		String nome1 = "Refresco do Chaves";
        item1.setNome(nome1);

		String descricao1 = "Suco de limão que parece de tamarino e tem gosto de groselha.";
        item1.setDescricao(descricao1);

		double preco1 = 2.99;
        item1.setPreco(preco1);

		double precoComDesconto1 = 2.77;
		item1.setPrecoComDesconto(precoComDesconto1);

		item1.setEmPromocao(true);
		if(item1.isEmPromocao()) {
			item1.setPrecoComDesconto(precoComDesconto1);
		}

		long id1 = 1L;
		item1.setId(id1);

		int categoria1 = 4;
		item1.setCategoria(categoria1);

		System.out.println(
				"######Cardápio 1######\n" +
				"Nome: " + item1.getNome() + "\n" +
				"Categoria: " + item1.mostrarCategoria() + "\n" +
				"Descrição: " + item1.getDescricao() + "\n" +
				"Em promoção: " + item1.isEmPromocao() + "\n" +
				"Preço: R$ " + item1.getPreco() + "\n" +
				"Preço com Desconto: R$ " + item1.getPrecoComDesconto() + "\n" +
				"Valor do desconto: R$" + String.format("%.2f",(preco1 - precoComDesconto1)) + "\n" +
				"Desconto aplicado: " + String.format("%.2f", item1.calcularPorcentagemDesconto() * 100) + "%\n" +
				"Id: " + item1.getId() + "\n" +
				"Categoria: " + item1.getCategoria() + "\n" +
				"------------------"
		);

        /* ITEM 2 */
		ItemCardapio item2;
        item2 = new ItemCardapio();

		String nome2 = "Sanduiche de presunto do chaves.";
		item2.setNome(nome2);

		String descricao2 = "Sanduiche de presunto simples, mas feito com muito amor.";
        item2.setDescricao(descricao2);

		double preco2 = 3.50;
		item2.setPreco(preco2);

        /* CORREÇÃO: Ativa a promoção usando o método setter correto */
		item2.setEmPromocao(true);

		double precoComDesconto2;
		precoComDesconto2 = 3.10;
		if(item2.isEmPromocao()) {
			item2.setPrecoComDesconto(precoComDesconto2);
		}

		long id2;
		id2 = 2L;
		item2.setId(id2);

		int categoria2;
		categoria2 = 2;
		item2.setCategoria(categoria2);
		System.out.println(
				"######Cardápio 2######\n" +
						"Nome: " + item2.getNome() + "\n" +
						"Categoria: " + item2.mostrarCategoria() + "\n" +
						"Descrição: " + item2.getDescricao() + "\n" +
						"Em promoção: " + item2.isEmPromocao() + "\n" +
						"Preço: R$ " + item2.getPreco() + "\n" +
						"Valor do desconto: R$" + String.format("%.2f",(preco2 - precoComDesconto2)) + "\n" +
						"Preço com Desconto: R$ " + item2.getPrecoComDesconto() + "\n" +
						"Desconto aplicado: " + String.format("%.2f", item2.calcularPorcentagemDesconto() * 100) + "%\n" +
						"Id: " + item2.getId() + "\n" +
						"Categoria: " + item2.getCategoria() + "\n"
		);
	}
}

