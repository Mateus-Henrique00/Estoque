public class Produto {

    public double preco;
    public int quantidade;
    public String produto;

    public double TotalValorEstoque(){
        return quantidade * preco;
    }

    public void AddProduto(int quantidade){
       this.quantidade += quantidade;

    }
    public void RemoveProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
    @Override
    public String toString() {
        return produto + ", $ "
                + String.format("%.2f",preco) + ", " + quantidade
                + " quantidade, Total: "
                + String.format("%.2f",TotalValorEstoque());
    }
}
