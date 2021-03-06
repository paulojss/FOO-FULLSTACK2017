package GwMarket;

public class Funcionario extends Pessoa {

    private String matricula;
    private Cargo cargo;

    public Funcionario(String matricula, String nome, Data nascimento, String cpf, String rg, Cargo cargo) {
        super(nome, nascimento, cpf, rg);
        this.matricula = matricula;
        this.cargo = cargo;
    }
   
  
    public String getMatricula() {
        return (this.matricula);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return (this.cargo);
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {

        return ( this.getMatricula() + " - " + this.getNome() );

    }

}
