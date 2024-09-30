public class Carro {
        int ano; 
        String cor, fabricante, modelo;
       
       void desligarCarro(){
           System.out.println("Carro desligado com sucesso.");
       }
       void verCarro(){
           System.out.println("Carro: " +modelo+ "| Ano:" +ano); 
           System.out.println("Cor: " + cor);
           System.out.println("Fabricane: " + fabricante);
       }
}
     