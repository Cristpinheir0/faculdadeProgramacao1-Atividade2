/**
 * 3.  Sabendo que a classe Conta não terá mais o método main proposto,
 * proponha uma classe App, na qual deve ficar apenas o método main proposto.
 * Faça os ajustes necessários para que a saída da execução da classe App continue igual ao item 1).
 */
public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        Conta c2 = new Conta();

        c1.setNumero(31);

        c2.setNumero(38);

        c1.depositar(500);

        c1.transferir(200, c2);

        System.out.printf("Saldo da conta %d: %.2f\n", c1.getNumero(), c1.getSaldo());

        System.out.printf("Saldo da conta %d: %.2f\n", c2.getNumero(), c2.getSaldo());

        //2) Qual a saída em tela da execução da classe?
        System.out.println("""
                No terminal irá exibir a seguinte mensagem:\s
                Saldo da conta 31: 300.00
                Saldo da conta 38: 200.00
                """);
    }
}