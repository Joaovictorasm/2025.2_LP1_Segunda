import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno("nome",12,2,3,4);

        System.out.println("Nome do Aluno:");
        a1.setNome(sc.nextLine());

        System.out.println("Idade do Aluno");
        a1.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("matricula do Aluno");
        a1.setMatricula(sc.nextLine());

        System.out.println("n1:");
        a1.setN1(sc.nextInt());
        sc.nextLine();

        System.out.println("n2:");
        a1.setN2(sc.nextInt());
        sc.nextLine();

        System.out.println("n3");
        a1.setN3(sc.nextInt());
        sc.nextLine();

        a1.calcularMedia();

        System.out.println("Nome"+ a1.getNome() +
                "Idade "+ a1.getIdade() +
                "Nota1"+ a1.getN1() +
                "nota2 "+ a1.getN2()+
                "nota3 "+ a1.getN3()+
                "media "+ a1.getMedia());


        Professor p = new Professor("nome", 22,6000);

        System.out.println("Nome do Professor:");
        p.setNome(sc.nextLine());

        System.out.println("Idade do Professor");
        p.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("matricula do Professor");
        p.setSalario(sc.nextDouble());

        System.out.println("Nome"+ a1.getNome() +
                "Idade: "+ p.getIdade() +
                "Salario: "+ p.getSalario()+
                "Nome: "+ p.getNome());

       p.setCargo(Cargo.Professor);
        System.out.println(p.getCargo());

        sc.close();
    }
}

