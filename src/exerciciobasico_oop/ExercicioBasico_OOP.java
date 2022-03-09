package exerciciobasico_oop;

import package_customer.Cliente;
import package_bank.Banco;
/**
 *
 * @author Sérgio Felipe Starke
 */
public class ExercicioBasico_OOP {

    public static void main(String[] args) {
        
//Para criar objeto cliente: (nome,idade,cpf,fone).
        Cliente c1 = new Cliente("Sérgio Felipe Starke",47,001,999111111);
        Cliente c2 = new Cliente("Pricila Regina",31,002,999222222);
        Cliente c3 = new Cliente("Alexandra Mesquita",40,003,999333333);
        Cliente c4 = new Cliente("Arthur Starke",2,004,0);
        Cliente c5 = new Cliente("Titus Smith",21,005,999555555);
        
/*                         Criar objeto conta;
 *Primeiro: Criar vetor com a classe Cliente e implementar objeto cliente.
 *Segundo:  Criar objeto banco: (Cliente[], nº conta, tipo "CP ou CC", saldo)
 *
 */
        Cliente[] solo1 = {c1};
        Banco b1 = new Banco();
        b1.abrirConta(solo1, 1, "CP", 10);
        b1.deposito(10);
        b1.saque(20);
        b1.taxa();
        
        Cliente[] conjunta1 = {c2,c5};
        Banco b2 = new Banco();
        b2.abrirConta(conjunta1, 2, "CC", 50000);
        b2.saque(600);
        b2.taxa();
        
        Cliente solo2[] = {c3};//Objeto para teste de erro.
        Banco b3 = new Banco();
        //"b2" já criada. Confirmando mensagem de erro.
        b2.abrirConta(solo2, 3, "CC", 100000);
        
        Cliente conjunta2[] = {c1,c4};
        Banco b4 = new Banco();
        b4.abrirConta(conjunta2, 4, "CC", 37000);
        b4.fecharConta();//Teste. Tentativa para encerrar conta com crédito em saldo.
        b4.saque(36970);
        b4.taxa();
        b4.saque(24.7f);
        //b4.fecharConta();
        
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
        
    }
    
}
