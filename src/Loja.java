import java.util.ArrayList;

public class Loja {
    private int numVendas;
    private int totalVendas;
    private float lucro;
    private  float despesas;
    private ArrayList<Produto> produtos;

    private ArrayList<Pedido> pedidos;

    private ArrayList<Usuario> usuarios;

    public Loja(int numVendas, int totalVendas, float lucro, float despesas, ArrayList<Produto> produtos, ArrayList<Pedido> pedidos, ArrayList<Usuario> usuarios) {
        this.numVendas = numVendas;
        this.totalVendas = totalVendas;
        this.lucro = lucro;
        this.despesas = despesas;
        this.produtos = produtos;
        this.pedidos = pedidos;
        this.usuarios = usuarios;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public float getDespesas() {
        return despesas;
    }

    public void setDespesas(float despesas) {
        this.despesas = despesas;
    }
}
