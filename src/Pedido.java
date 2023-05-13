import java.util.ArrayList;
import java.util.stream.Collectors;



public class Pedido {
    private int id;
    private int idUsuario;
    private ArrayList<Produto> produtos;
    private float total;

    public Pedido(int id, int idUsuario, ArrayList<Produto> produtos, float total) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.produtos = produtos;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    private String printaProdutos(){
        String listString = getProdutos().stream().map(Object::toString)
                .collect(Collectors.joining(", "));
        return listString;
    }


    public String toString(String nome) {
        String s = "Pedido do " + nome + ": " + "\n" +
                "Indetificador: " + id + "\n" +
                "Produtos: {" + "\n" +
                printaProdutos() +
                "}" + "\n" +
                "Total: " + total + "\n" +
                '}';
        return s;
    }
}