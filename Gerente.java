package banco;

import java.util.Scanner;

public class Gerente extends Pessoa{
    private String mat;
    private String senha;

    public Gerente() {
        super();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a matricula: ");
        this.mat = s.nextLine();

        System.out.println("Digite a senha: ");
        this.senha = s.nextLine();
    }

    Gerente(String nome, String cpf, Data d, char s,String mat, String p){
        super(nome,cpf,d,s);
        this.setMat(mat);
        this.senha = p;
    }

    boolean validarAcesso(String s){
        return s.equals(this.getSenha());
    }

    public String getMat() {
        return this.mat;
    }


    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String atual, String senha) {
        if (atual.equals(this.senha)){
        this.senha = senha;}
    }

    boolean validarAcesso(){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String pwd = s.nextLine();

        return this.validarAcesso(pwd);
    }
}
