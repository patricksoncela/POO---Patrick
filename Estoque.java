import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " foi adicionnad ao estoque.");
    }
    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            System.out.println(produto.getNome() + " foi removido do estoque.");
        } else {
            System.out.println(produto.getNome() + " não foi enncontrado no estoque. ");
        }
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println("Produto: " + produto.getNome() + " | Preço com desconto: " + precoComDesconto);
        }
    }

}
