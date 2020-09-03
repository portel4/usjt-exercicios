public class Empregado{
    public String nome;
    public String tipo;
    public int idade;
    private double salario;
    private double comissao;
    private double bonus;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this nome=nome;
    }

    public String getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this idade=idade;
    }

    public double calculoSalario(){
        switch (tipo) {
            case 1:     
                return salario;
            case 2:
                return salario + salario * comissao;
            case 3:
                return salario + bonus;
            default:
                return 0;
        }
    }
}