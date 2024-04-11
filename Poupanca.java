package banco;

public class Poupanca extends Conta{

    public Poupanca(Gerente g){
        super(g);
    }

    public Poupanca(Pessoa t,Gerente g){
        super(t,g);
    }
    public Poupanca(String numero, Pessoa titular, Data c, Gerente g) {
        super(numero, titular, c, g);

    }


    public void extrato(){
        System.out.println("*** EXTRATO DA CONTA POUPANCA ***");
       super.extrato();
    }

   void rendimentos (double juro){
        this.saldo  = this.saldo + (juro*this.saldo)/100;
   }


}
