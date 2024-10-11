public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido.");
        }
    }

    public double calcularDesconto(double porcentagem) {
        double desconto = preco * (porcentagem / 100);
        return preco -= desconto;

    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Preço: R$ " + preco;
    }
}
