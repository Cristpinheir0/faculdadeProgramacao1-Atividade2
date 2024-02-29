public class Conta {

    private int numero;

    private double saldo;

    public Conta(){

    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public double getSaldo() {

        return saldo;
    }

    //1) proponha o método para realizar a retirada de valor de uma conta:
    //método retirar
    public void retirar(double valor) {
        if(valor <= this.saldo) {
            saldo -= valor;
            System.out.println("Valor retirado com sucesso\n Novo saldo: R$" + this.saldo);
        }
        System.out.println("Saldo insuficiente para retirar o valor desejado!");
    }

    public void depositar(double valor){

        saldo = saldo + valor;
    }

    public void transferir(double valor, Conta destino){

        if(saldo>=valor){

            saldo = saldo - valor;

            destino.depositar(valor);

        }else System.out.printf("Valor indisponível!\n");}
}
