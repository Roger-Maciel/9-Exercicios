package maciel.roger.ExemploGradleRepositoriCliente.model;
/*
    @author Roger Maciel
    @since 16/04/2020
    @version 1.0
 */
public class Cliente {

    private String nome;


    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome;
    }
}
