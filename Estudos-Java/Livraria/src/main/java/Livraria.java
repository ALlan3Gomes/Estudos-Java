public class Livraria {
    public static void main(String[] args) {
        // Criando autores
        Autor autor1 = new Autor("ChuGong", "g1@fulano.com");
        Autor autor2 = new Autor("George R.R. Martin", "grrm@winterfell.com");

        // Criando livros
        Livro livro1 = new Livro(autor1.getNome());
        livro1.setNome("Solo Leveling");
        livro1.setDescricao("Aventura");
        livro1.setIsbn("ISBN123");
        livro1.setValor(50.0);

        Livro livro2 = new Livro(autor2.getNome());
        livro2.setNome("A Game of Thrones");
        livro2.setDescricao("Fantasia");
        livro2.setIsbn("ISBN456");
        livro2.setValor(40.0);

        // Criando ebooks
        Ebook ebook1 = new Ebook(autor1.getNome());
        ebook1.setNome("Overgeared");
        ebook1.setDescricao("Ficcao");
        ebook1.setIsbn("ISBN789");
        ebook1.setValor(30.0);

        Ebook ebook2 = new Ebook(autor2.getNome());
        ebook2.setNome("A Clash of Kings");
        ebook2.setDescricao("Fantasia");
        ebook2.setIsbn("ISBN1011");
        ebook2.setValor(35.0);

        // Mostrando detalhes dos livros
        System.out.println("Detalhes do livro 1:");
        livro1.mostrarDetalhes();
        System.out.println();
        livro1.aplicaDescontoDe(30);
        
        System.out.println("Detalhes do livro 2:");
        livro2.mostrarDetalhes();
        System.out.println();
        livro2.aplicaDescontoDe(30);
        
        // Mostrando detalhes dos ebooks
        System.out.println("Detalhes do ebook 1:");
        ebook1.mostrarDetalhes();
        System.out.println();
        ebook1.aplicaDescontoDe(15);
        
        System.out.println("Detalhes do ebook 2:");
        ebook2.mostrarDetalhes();
        ebook2.aplicaDescontoDe(15);
    }
}
