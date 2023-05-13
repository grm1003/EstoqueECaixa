public class Produto {
    private int id;
    private String nome;
    private float preco_unitario;
    private int QuantStock;

    private int custoProd;


    public Produto(int id, String nome, float preco_unitario, int quantStock, int custoProd) {
        this.id = id;
        this.nome = nome;
        this.preco_unitario = preco_unitario;
        QuantStock = quantStock;
        this.custoProd = custoProd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(float preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public int getQuantStock() {
        return QuantStock;
    }

    public int getCustoProd() {
        return custoProd;
    }

    public void setCustoProd(int custoProd) {
        this.custoProd = custoProd;
    }

    public void setQuantStock(int quantStock) {
        QuantStock = quantStock;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco_unitario=" + preco_unitario +
                ", QuantStock=" + QuantStock +
                '}';
    }
}
