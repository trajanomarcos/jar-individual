package projeto.print;

public class Prints {
    
    public void inicial(){
        System.out.println("Seja Bem-Vindo a Plataforma NEXUS!\n");
        System.out.println("Lembre" +
                "m-se que para realizar o login na nossa aplicação é necessario fazer o cadastro no nosso site!");
    }
    
    public void menu() {
        System.out.println("\nPor Favor realize o Login para poder acessar \ntodas as areas da plataforma! \n");
        System.out.println("----------------------------------------------");
        System.out.println("| 1 - Login                                  |");
        System.out.println("| 0 - Sair                                   |");
        System.out.println("| 9 - Ver site                               |");
        System.out.println("----------------------------------------------");
    }

    public void site(){
        System.out.println("O link do nosso site é:");
        System.out.println("http://34.225.182.14:8080");
        System.out.println("Apos fazer o cadastro, execute novamente o nosso client.");
    }+

    
    public void username() {
        System.out.println("\nInsira seu email: ");
    }
    
    public void token() {
        System.out.println("\nInsira seu token:");
    }
    
    public void sair() {
        System.out.println("\nSessão Finalizada!");
    }
    
    public void menuMonitorar() {
        System.out.println("""
                Qual dos Monitoramentos deseja visualizar 
                
                *---------------------------------------*
                | 1 - Processador                       |
                | 2 - Memoria                           |
                | 3 - Disco                             |
                | 4 - Primeiro Plano                    |
                *---------------------------------------*
                """);
    }

    public void limparConsole(){
        for(int i = 0; i < 100; i++){
            System.out.println(" ");
        }
    }
}

// Realizado Pela Nexus Enterprises :)
