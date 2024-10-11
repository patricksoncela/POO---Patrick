public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto tv = new Eletronico("TV",2500.00);
        Produto camiseta = new Roupas("Camiseta", 65.00);

        estoque.adicionarProduto(tv);
        estoque.adicionarProduto(camiseta);

        estoque.exibirPrecosComDesconto(10);
        }
    }
