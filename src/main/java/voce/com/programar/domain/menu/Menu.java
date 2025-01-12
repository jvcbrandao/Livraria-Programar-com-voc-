package voce.com.programar.domain.menu;

import org.springframework.stereotype.Component;
import voce.com.programar.domain.livro.Livro;
import voce.com.programar.domain.livro.LivroRepositoryImp;

import java.util.Scanner;


public class Menu{

    public Menu(){}

    private LivroRepositoryImp livroRepositoryImp;

    public Menu(LivroRepositoryImp livroRepositoryImp) {
        this.livroRepositoryImp = livroRepositoryImp;
    }

    Scanner scanner = new Scanner(System.in);

    Livro livro = new Livro("Maria", "Maria", "Editora Maria", 10000000 );

    int opcao = -1;

    public int exibirMenu(){

        while ((opcao!=1)&&(opcao!=2)&&(opcao!=3)&&(opcao!=4)&&(opcao!=0)){
            System.out.println("""
            Informe a opção desejada!
            1 - Cadastrar livro
            2 - Realizar venda
            3 - Listar livros
            4 - Listar vendas
            0 - Sair
            """);
            opcao = scanner.nextInt();
            scanner.nextLine();
        }
        return opcao;
    }


    public void realizarTarefa(int opcao) {

        switch (opcao){
            case 1:
                System.out.println(livro.toString());;
                livroRepositoryImp.save(livro);
                break;
            case 2:
                //realizar venda;
                break;
            case 3:
                //listar livros
                break;
            case 4:
                //listar vendas
                break;
            case 0:
                System.out.println("Saindo...");
        }






    }
}
