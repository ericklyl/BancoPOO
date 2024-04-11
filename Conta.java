package banco;

import java.util.Scanner;

public class Conta {
    protected String numero;
    protected Pessoa titular;
    protected double saldo;
    protected Data criacao;
    protected Gerente gerente;

    public Conta(Pessoa t,Gerente g){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        this.setNumero(s.nextLine());

        this.setTitular(t);

        this.setSaldo(0);

        System.out.println("Digite a data de criacao");
        this.setCriacao(new Data());

        this.setGerente(g);
    }

    public Conta(Gerente g){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        this.setNumero(s.nextLine());

        System.out.println("Digite os dados do titular: ");
        this.setTitular(new Pessoa());

        this.setSaldo(0);

        System.out.println("Digite a data de criacao");
        this.setCriacao(new Data());

        this.gerente = g;
    }

    Conta(String numero, Pessoa titular, Data c, Gerente g){
        this.setNumero(numero);
        this.setTitular(titular);
        this.setCriacao(c);
        this.setGerente(g);
        this.setSaldo(0);
    }

    public void depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Deposito realizado com sucesso.");
        System.out.println("Novo saldo: R$" + this.getSaldo());
    }

    public void depositar(){
        Scanner s = new Scanner(System.in);

        System.out.println("Qual valor sera depositado?");
        double v = s.nextDouble();

        this.depositar(v);

    }

    public boolean sacar(double valor){
        if(valor <= this.disponivel()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque na conta " + this.getSaldo());
            return true;
        }
        else {
            System.out.println("ERRO: Saque na conta " + this.getNumero());
            return false;
        }
    }

    public boolean sacar(){
        Scanner s = new Scanner(System.in);

        System.out.println("Qual valor sera sacado?");
        double v = s.nextDouble();

        return this.sacar(v);

    }



    public void extrato(){
        System.out.println("Numero da conta: " + this.getNumero());
        System.out.println("Titular: " + this.getTitular().getNome());
        System.out.println("Valor disponivel para saque: " + this.getSaldo() + "\n");
    }

    public Data getCriacao() {
        return this.criacao;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Gerente getGerente() {
        return this.gerente;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setCriacao(Data criacao) {
        this.criacao = criacao;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    protected double disponivel(){
        return this.getSaldo();
    }
    public boolean transferir(double valor, Conta destino){
        if (this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Transferencia de R$" + valor + " realizada com sucesso!" );
            System.out.println("Origem: " + this.getNumero() + " Destino: " + destino.getNumero());
            return true;
        }
        else {
            System.out.println("Erro: não foi possivel transferir " + valor);
            System.out.println("Valor disponivel para transferencia: " + this.disponivel());
            return false;
        }
    }

    public boolean transferir(Conta destino){
        Scanner s = new Scanner(System.in);

        System.out.println("Qual valor sera transferido?");
        double v = s.nextDouble();

        return this.transferir(v,destino);

    }


}
