public class Roupas extends Produto{
    public Roupas(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem){
        double desconto = getPreco() * (porcentagem/100);
        return getPreco() - desconto;
    }

    @Override
    public String toString() {
        return super.toString() + " | Categoria: Roupa";
    }
}
