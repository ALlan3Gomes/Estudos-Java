
public class CarroTeste {

    public static void main(String[] args) {
      Carro c1 = new Carro();
      c1.ano = 2024;
      c1.cor = "Vermelho";
      c1.fabricante = "Xiaomi"; 
      c1.modelo = "SU7";   
      
      Carro c2 = new Carro();
      c2.ano = 2024;
      c2.cor = "Vermelho";
      c2.fabricante = "Xiaomi"; 
      c2.modelo = "SU7";   
      
      Carro c3 = new Carro();
      c3.ano = 2024;
      c3.cor = "Vermelho";
      c3.fabricante = "Xiaomi"; 
      c3.modelo = "SU7";  
      
      c1.verCarro();
      c1.desligarCarro();
      
      c2.verCarro();
      c2.desligarCarro();
      
      c3.verCarro();
      c3.desligarCarro();
      
    }
    
}
