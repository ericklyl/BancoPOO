package banco;
import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Data nasc;
    protected char sexo;

    Pessoa(){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        this.setNome(s.nextLine());

        System.out.println("Digite o CPF: ");
        this.setCpf(s.nextLine());

        System.out.println("Digite a Data de Nascimento");
        this.setNasc(new Data());

        System.out.println("Informe o sexo: ");
        this.setSexo(s.nextLine().charAt(0));
    }

    Pessoa(String n,String c,  Data d, char s){
        this.setNome(n);
        this.setCpf(c);
        this.setSexo(s);
        this.setNasc(d);
    }

    int idade(Data hoje){
        int diff = hoje.getAno() - this.getNasc().getAno();

        if(this.getNasc().getMes() < hoje.getMes()){
            return diff;
        }

        if(this.getNasc().getMes() > hoje.getMes()){
            return diff-1;
        }
        if(this.getNasc().getMes() <= hoje.getDia()){
            return diff;
        }
        return diff-1;

    }

    public char getSexo() {
        return sexo;
    }

    public Data getNasc() {
        return nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNasc(Data nasc) {
        this.nasc = nasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
