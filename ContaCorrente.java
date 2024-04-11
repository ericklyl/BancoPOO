package banco;

public class ContaCorrente extends  Conta{
    private double limite;

    public ContaCorrente(Pessoa t,Gerente g){
        super(t,g);
        this.limite = 200;
    }

    public ContaCorrente(Gerente g){
        super(g);
        this.limite = 200;
    }
    public ContaCorrente(String n, Pessoa t, Data c, Gerente g) {
        super(n, t, c, g);
        this.limite = 200;
    }

    public void extrato(){
        System.out.println("*** EXTRATO DA CONTA CORRENTE");
        super.extrato();
    }

    protected double disponivel(){
        return this.getSaldo() + this.getLimite();
    }

    public void setLimite(String pwd, double limite) {
        if(this.getGerente().validarAcesso(pwd)){
            this.limite = limite;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void chequeEspecial(double juro) {
        if (this.getSaldo() < 0){
            this.setSaldo(this.getSaldo() + (juro*this.getSaldo()));
        }
    }

}
