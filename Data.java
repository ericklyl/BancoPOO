package banco;

import java.util.Scanner;

public class Data {
    protected int dia;
    protected int mes;
    protected int ano;

    public Data() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        this.dia = s.nextInt();

        System.out.println("Digite o mes: ");
        this.mes = s.nextInt();

        System.out.println("Digite o ano: ");
        this.ano = s.nextInt();
    }

    Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;

    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprime(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
