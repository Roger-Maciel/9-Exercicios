package maciel.roger.ExemploGradleRepositoriCliente.model;
/*
    @author Roger Maciel
    @since 16/04/2020
    @version 1.0
 */
public class Produto {

    private String nomeProduto;

    public Produto() {

    }
    public Produto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public String toString() {
        return "\nNome do produto: " + nomeProduto;
    }
}
