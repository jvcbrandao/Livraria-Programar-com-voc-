package voce.com.programar.domain.view;

import java.util.Scanner;

public class LivrariaVirtual {

    private int MAX_IMPRESSOS;
    private int MAX_ELETRONICOS;
    private int MAX_VENDAS;
    //impressos, eletronicos, vendas, num impressos, num Eletronicos, num vendas


    Scanner scanner = new Scanner(System.in);

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
                cadastrarLivro();
                break;
            case 2:
                realizarVenda();
                break;
            case 3:
                listarLivros();
                break;
            case 4:
                listarVendas();
                break;
            case 0:
                System.out.println("Saindo...");
        }

    }




    private void cadastrarLivro() {




    }

    private void realizarVenda() {
    }

    private void listarLivrosImpressos(){}

    private void listarLivrosEletronicos(){}

    private void listarLivros() {
    }

    private void listarVendas(){}
}
