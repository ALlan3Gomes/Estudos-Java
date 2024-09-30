public class LivroFisico extends Livro {
    // Construtor que chama o construtor da superclasse
    public LivroFisico(String autor) {
        super(autor);
    }

    // Método para obter a taxa de impressão
    public double getTaxaImpressao() {
        return getValor() * 0.05; // 5% do valor do livro
    }
}
