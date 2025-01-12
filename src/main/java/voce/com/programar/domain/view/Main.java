package voce.com.programar.domain.view;

public class Main {


    public static void main(String[] args) {


        LivrariaVirtual livrariaVirtual = new LivrariaVirtual();

        var opcao = livrariaVirtual.exibirMenu();

        livrariaVirtual.realizarTarefa(opcao);

    }
}