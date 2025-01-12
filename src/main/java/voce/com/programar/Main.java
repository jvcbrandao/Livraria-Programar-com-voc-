package voce.com.programar;

import voce.com.programar.domain.livro.LivroRepositoryImp;
import voce.com.programar.domain.menu.Menu;

public class Main {


    public static void main(String[] args) {

        LivroRepositoryImp livroRepositoryImp = new LivroRepositoryImp();

        Menu menu = new Menu(livroRepositoryImp);

        var opcao = menu.exibirMenu();

        menu.realizarTarefa(opcao);

    }
}