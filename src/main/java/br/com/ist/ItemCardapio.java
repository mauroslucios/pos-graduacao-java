package br.com.ist;

public class ItemCardapio {
    private long id;
    private String nome;
    private String descricao;
    private int categoria;
    private double preco;
    private boolean emPromocao;
    private double precoComDesconto;

    // Construtor padrão
    public ItemCardapio() {
    }

    // Método para calcular a porcentagem de desconto (retorna valor entre 0.0 e 1.0)
    public double calcularPorcentagemDesconto() {
        if (preco <= 0) {
            return 0.0;
        }
        return (preco - precoComDesconto) / preco;
    }

    // Getters e Setters
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

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEmPromocao() {
        return emPromocao;
    }

    public void setEmPromocao(boolean emPromocao) {
        this.emPromocao = emPromocao;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }
}
