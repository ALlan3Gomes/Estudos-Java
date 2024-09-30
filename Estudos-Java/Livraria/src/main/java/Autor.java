public class Autor {
    // Atributos
    private String nome;
    private String email;

    // Construtor
    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Métodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
