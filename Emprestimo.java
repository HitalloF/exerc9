
import java.util.ArrayList;
import java.util.Scanner;

public class Emprestimo {


    Scanner sc = new Scanner(System.in);
    public void tirarEmprestimo(){
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        ArrayList<Livro> livro = new ArrayList<>();
        while(true){
            System.out.println("Para fazer emprestimo digite 1");
            System.out.println("Para consultar emprestimo digite 2");
            System.out.println("Para sair digite 0");
            int digitado = sc.nextInt();

            if(digitado == 1){
                System.out.println("Insira seu nome");
                String name = sc.next();
                System.out.println("Insira sua renda mensal");
                int renda = sc.nextInt();
                Pessoa a = new Pessoa(name, renda);
                pessoas.add(a);
                }
            else if(digitado == 2) {
                System.out.println("Consultar Pessoas");
                for(Pessoa a : pessoas){
                    String p = a.getName();
                    int renda = a.getSalario();

                    if(renda >= 800){
                        System.out.println(p+"Emprestimo concedido");
                    }
                    else{
                        System.out.println(p+"Emprestimo negado");
                    }

                }
            }
            else{
                System.out.println("Digite apenas 1 2 e 0");
            }

        }


    }


}
