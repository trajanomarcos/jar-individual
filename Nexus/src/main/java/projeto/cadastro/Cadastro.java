package projeto.cadastro;

import projeto.conexao.Conectar;
import projeto.print.Prints;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cadastro {
    private String email;
    private String password;
    private String confPass;
    private Integer fkFuncionario;

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        Prints prints = new Prints();
        prints.user();

        email = scanner.nextLine();

        prints.passwordUser();
        password = scanner.nextLine();

        prints.confPassUser();
        confPass = scanner.nextLine();

        if(password.equals(confPass)){
            System.out.println("\n Sua conta foi criada com sucesso.");
            Conectar conectar = new Conectar();
            conectar.realizarCadastro(email, password, fkFuncionario);
        } else {
            System.out.println("\n Suas senhas não sao identicas. Tente novamente.");
        }

    }
}
