public class Ebook extends Livro {
    // Atributo adicional
    private String waterMark;

    // Construtor que chama o construtor da superclasse
    public Ebook(String autor) {
        super(autor);
    }

    // Getter e setter para waterMark
    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    // Método para aplicar desconto máximo de 15%
    @Override
    public void aplicaDescontoDe(double porcentagem) {
        if (porcentagem <= 15) {
            double valorComDesconto = getValor() - (getValor() * porcentagem / 100);
            setValor(valorComDesconto);
        } else {
            System.out.println("Desconto máximo de 15%");
        }
    }
}

