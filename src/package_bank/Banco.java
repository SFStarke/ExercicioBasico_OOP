package package_bank;

import package_customer.Cliente;

/**
 *
 * @author Sérgio Felipe Starke
 */
public class Banco {
//Atributo tipo "Cliente" | Uso vetor, pois pode haver mais de um e mesmas conta.
    private Cliente[] titular;
    private int nConta;
    private String tipo;
    private float saldo;
    private boolean status;

    public Banco() {
        this.setStatus(false); //Status da conta falso.
    }

    public void abrirConta(Cliente[] informe, int nConta, String tipo, float saldo) {
        if (this.isStatus() == false) {
            this.setTitular(informe);
            this.setnConta(nConta);
            this.setTipo(tipo);
            this.setSaldo(saldo);
            this.setStatus(true);//Tornar status da conta verdadeio.
        } else {
            System.out.println("             A T E N Ç Ã O:\n"
                    + "Tratamento de abertura de conta já efetuada");
 //   System.out.println("¨¨     ¨¨     ¨¨     ¨¨     ¨¨\nERRO-> Alerta para nº "
 //           + "de conta já existente...\n¨¨     ¨¨     ¨¨     ¨¨     ¨¨");
        }
    }

    public void fecharConta() {
        if ((this.isStatus() == true) && (this.getSaldo() == 0)) {
            this.setStatus(false);
            System.out.println("Conta nº" + this.nConta + " encerrada com sucesso...\n"
                    + "#################################################");
        } else {
            System.out.println("Conta nº " + this.getnConta() + ", ainda com saldo disponível.\n"
                    + "Para encerrar, primeiro faça o resgate de todo o valor.\n"
                    + "#################################################\n");
        }
    }

    public void deposito(float deposito) {
        if (this.status == true) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("\nDepósito confirmado. Conta nº " + this.getnConta() + " Valor: R$"
                    + deposito + ".\n--------------------------");
        } else {
            System.out.println("\nConta Inexistente...\n--------------------------");
        }
    }

    public void taxa() {
        float cc = 5.3f;
        float cp = 1.7f;

        if ("CC".equals(this.getTipo())) {
            if (this.getSaldo() >= cc) {
                this.saque(cc);
                System.out.println("Cobrança de tarifa da conta nº " + this.nConta
                        + ", Valor: R$" + cc + ".\n--------------------------");
            } else {
                System.out.println("Conta corrente nº " + this.nConta + 
                        " com saldo indisponíve para cobrança de taxa."
                                + ".\n--------------------------");
            }
        } else if ("CP".equals(this.getTipo())) {
            if (this.getSaldo() >= cp) {
                this.saque(cp);
                System.out.println("Cobrança de tarifa da conta nº " + this.nConta
                        + ", Valor: R$" + cp + ".\n--------------------------");
            } else {
                System.out.println("Conta poupança nº " + this.nConta + 
                        " com saldo indisponível para cobrança de taxa."
                                + ".\n--------------------------");
            }
        }
    }

    public void saque(float saque) {
        if (saque <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("\nSaque confirmado. Conta nº " + this.nConta
                    + " Valor: S$" + saque + ".\n--------------------------");
        } else {
            System.out.println("\nSaldo insuficiente para saque e ou conta inexistente...\n");
        }
    }

    @Override //Método de sobreposição toString.
    public String toString() {
        DataConsulta data = new DataConsulta();
        if (this.status == true) {
            String statusConta = "";

            if (this.status == true) {
                statusConta = "[ Conta Ativa ]";
            } else {
                statusConta = "[ Conta Inativa ]";
            }

            String inform = "\n" + data.Data() + " Titular(es);";

            for (Cliente resultado : this.titular) {
                inform += resultado;
            }

            inform += "\nStatus operacional: " + statusConta + " nº " + this.getnConta()
                    + ".\nTipo de conta: " + this.getTipo() + ". Saldo de R$" + this.getSaldo()
                    + "\n************************************************\n";
            return inform;
        } else {

            return "ERRO-> Status Incógnita...\n"
                    + "// IMPORTANTE: Conta já ativa em outro Titular(es) e ou excluida.//\n"
                    + "Confime a correspondência dos dados informados ao gerar objeto."
                    + "\n************************************************\n";
        }
    }

    public Cliente[] getTitular() {
        return titular;
    }

    public void setTitular(Cliente[] titular) {
        this.titular = titular;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
