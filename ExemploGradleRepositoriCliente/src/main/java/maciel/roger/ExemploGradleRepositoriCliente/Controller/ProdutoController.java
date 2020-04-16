package maciel.roger.ExemploGradleRepositoriCliente.Controller;

import maciel.roger.ExemploGradleRepositoriCliente.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
    @author Roger Maciel
    @since 16/04/2020
    @version 1.0
 */
@RestController
public class ProdutoController {
    @GetMapping("/produtos")
    public String getProducts() {
        return "Area do produto!";
    }

    @GetMapping("/produto")
    public Produto getProduct() {
        Produto produto = new Produto();
        produto.setNomeProduto("Nescau");
        return produto;
    }
}
