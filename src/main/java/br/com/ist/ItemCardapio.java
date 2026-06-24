package br.com.ist;

public class ItemCardapio {
    private long id;
    private String nome;
    private String descricao;
    private double preco;
    private double precoComDesconto;
    private boolean emPromocao;
    private int categoria;

    // Construtor padrão
    public ItemCardapio() {}
    
    // 2. Construtor completo (com parâmetros)
    public ItemCardapio(long id, String nome, String descricao, double preco, double precoComDesconto, int categoria, boolean emPromocao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.precoComDesconto = precoComDesconto;
        this.categoria = categoria;
        this.emPromocao = emPromocao;
    }

    // Método solicitado para retornar o nome da categoria com base no ID numérico
    public String mostrarCategoria() {
        switch (this.categoria) {
            case 1:  return "Entradas";
            case 2:  return "Pratos principais";
            case 3:  return "Sobremesas";
            case 4:  return "Bebidas";
            default: return "Categoria não encontrada...";
        }
    }

    // Método para calcular a porcentagem de desconto para evitar erros na main
    public double calcularPorcentagemDesconto() {
        if (preco > 0 && emPromocao) {
            return (preco - precoComDesconto) / preco;
        }
        return 0.0;
    }

    // Getters e Setters necessários para a classe App
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public double getPrecoComDesconto() { return precoComDesconto; }
    public void setPrecoComDesconto(double precoComDesconto) { this.precoComDesconto = precoComDesconto; }

    public boolean isEmPromocao() { return emPromocao; }
    public void setEmPromocao(boolean emPromocao) { this.emPromocao = emPromocao; }

    public int getCategoria() { return categoria; }
    public void setCategoria(int categoria) { this.categoria = categoria; }
}
