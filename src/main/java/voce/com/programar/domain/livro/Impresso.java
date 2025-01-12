package voce.com.programar.domain.livro;

public class Impresso extends Livro{

    private double frete;
    private int estoque;

    public void atualizarEstoque(){
        //este método deve subtrair 1 do valor do atributo estoque
    }

    public Impresso(double frete, int estoque) {
        this.frete = frete;
        this.estoque = estoque;
    }

    public Impresso(String titulo, String autores, String editora, float preco, double frete, int estoque) {
        super(titulo, autores, editora, preco);
        this.frete = frete;
        this.estoque = estoque;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //Colocar toString


    @Override
    public String toString() {
        return String.format("Livro Impresso: %n" +
                        "Título: %s%n" +
                        "Autores: %s%n" +
                        "Editora: %s%n" +
                        "Preço: R$ %.2f%n" +
                        "Frete: R$ %.2f%n" +
                        "Estoque: %d",
                getTitulo(), getAutores(), getEditora(), getPreco(), frete, estoque);
    }

}
