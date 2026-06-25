package br.com.ist.model;

import br.com.ist.enums.CategoriaCardapio;

public class ItemCardapio {
    private long id;
    private String nome;
    private String descricao;
    private double preco;
    private double precoComDesconto;
    private boolean emPromocao;
    private CategoriaCardapio categoria;

    // Construtor padrão
    public ItemCardapio() {
    }

    // 2. Construtor completo (com parâmetros)
    public ItemCardapio(long id, String nome, String descricao, double preco, double precoComDesconto, CategoriaCardapio categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.precoComDesconto = precoComDesconto;
        this.categoria = categoria;
    }

    // Método solicitado para retornar o nome da categoria com base no ID numérico
    public CategoriaCardapio mostrarCategoria() {
        return categoria;
    }

    // Método para calcular a porcentagem de desconto para evitar erros na main
    public double calcularPorcentagemDesconto() {
        if (preco > 0 && emPromocao) {
            return (preco - precoComDesconto) / preco;
        }
        return 0.0;
    }

    // Getters e Setters necessários para a classe App
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }

    public boolean isEmPromocao() {
        return emPromocao;
    }

    public void setEmPromocao(boolean emPromocao) {
        this.emPromocao = emPromocao;
    }

    // OBSERVAÇÃO: Correção do método para aceitar a atribuição e o retorno correto
    public CategoriaCardapio getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCardapio categoria) {
        this.categoria = categoria;
    }
}