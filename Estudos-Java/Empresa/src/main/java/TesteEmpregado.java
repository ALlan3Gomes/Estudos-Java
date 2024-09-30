
public class TesteEmpregado {

    public static void main(String[] args) {
       
    Gerente a = new Gerente();
    a.setNome("Allan");
    a.setSalario(50000);
    a.setUsuario("Allan.programa");
    a.setSenha("12345");        
    
    Empregado b = new Empregado(); 
    b.setNome("Pedro");
    b.setSalario(1600);
    
    Telefonista c = new Telefonista();
    c.setNome("Lucas");
    c.setSalario(900);
    c.setEstacaoTrabalho(20);
    
    Secretaria d = new Secretaria();
    d.setNome("Maria");
    d.setSalario(2000);
    d.setRamal(125);
    }
    
}
