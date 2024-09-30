public class Livro {
    // Atributos
    private String nome;
    private String descricao;
    private String isbn;
    private double valor;
    private String autor;

    // Construtor que recebe o autor do livro como parâmetro
    public Livro(String autor) {
        this.autor = autor;
    }

    // Métodos getter e setter para os atributos
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para mostrar detalhes do livro
    public void mostrarDetalhes() {
        System.out.println("Titulo: " + this.getNome());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("ISBN: " + this.getIsbn());
        System.out.printf("Preco: %.2f\n", this.getValor());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("----------------------------");
       
    }

    // Método para aplicar desconto
    public void aplicaDescontoDe(double porcentagem) {
        if (porcentagem <= 30) {
            valor -= valor * (porcentagem / 100);
        } else {
            System.out.println("Desconto max. de 30%");
            porcentagem = 30;
            valor -= valor * (porcentagem / 100);
        }
    }
}
