public final class Professor extends Pessoa {
    public Cargo cargo;
    private double salario;

    public Professor(String nome,int idade,double salario){
        super(nome, idade);
        this.salario = salario;
    }

    public void calcularSalario() {
        salario = 300 * 40;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public void quemSouEu() {

    }

    @Override
    public void minhaAtividade() {

    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
