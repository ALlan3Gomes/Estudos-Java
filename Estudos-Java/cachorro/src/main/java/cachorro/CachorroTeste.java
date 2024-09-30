package cachorro;

public class CachorroTeste {

    public static void main(String[] args) {
       
        // Criando um objeto da classe Cachorro chamado pipoca
        Cachorro pipoca = new Cachorro();
        pipoca.raca = "Lhasa"; // Corrigindo a atribuição do atributo "raca"
        pipoca.peso = 8; 
        
        // Criando outro objeto da classe Cachorro chamado top
        Cachorro top = new Cachorro(); // Corrigindo a declaração do objeto
        top.raca = "Vira-Lata"; // Corrigindo a atribuição do atributo "raca"
        top.peso = 18;
        
        Cachorro pandora = new Cachorro();
        pandora.cor = "Branco";
        pandora.raca = "Lulu";
        pandora.peso = 6;
        pandora.Idade = 5;  
        
        
            System.out.println("A raça do cachorro é: " + pandora.raca); 
            System.out.println("A cor do cachorro é: " + pandora.cor);
            System.out.println("A idade do cachorro é: " + pandora.Idade);
            System.out.println("O peso do cachorro é: " + pandora.peso);
    }
}
