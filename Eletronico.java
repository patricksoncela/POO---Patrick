public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        double desconto = (getPreco() * (porcentagem / 100)) / 2;
        return getPreco() - desconto;
    }

    @Override
    public String toString() {
        return super.toString() + " | Categoria: Eletrônico";
    }
}
