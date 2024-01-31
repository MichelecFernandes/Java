public class Conta {
    private double saldo;
    private int agenciaConta;
    private double numeroConta;
    Cliente titularConta;
    private static int totalConta;

    public Conta(double saldo, int agenciaConta, double numeroConta) {
        this.saldo = saldo;
        this.agenciaConta = agenciaConta;
        this.numeroConta = numeroConta;
        //this.titularConta = titularConta;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else{
            System.out.println("O saldo é insuficiente");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else{
            System.out.println("O saldo é insuficiente");
            return false;
        }
    }


    public double getSaldo(){
        return this.saldo;
    }

    public int getAgenciaConta(){
        return this.agenciaConta;
    }

    public void setAgenciaConta(int agenciaConta) {
        if (agenciaConta <= 0) {
            System.out.println("não pode valor <= 0");
            return;
        }
        this.agenciaConta = agenciaConta;
    }

    public void setTitularConta(Cliente titularConta) {
        this.titularConta = titularConta;
    }

    public Cliente getTitularConta(){
        return titularConta;
    }

    public static int getTotalConta(){
        return Conta.totalConta;
    }
}