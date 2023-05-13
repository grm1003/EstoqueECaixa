import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LojaMain {
    public static void main(String[] args) {
        //variáveos auxiliares
        Scanner s = new Scanner(System.in);
        int pdt = 0;
        int us = 0;
        int pd = 0;
        //Criando lista de usuários
        ArrayList<Usuario> usuarios = new ArrayList<>();
        //Adicionando primiero usuário
        Usuario adm = new Usuario(us,"admin", "EusouoADM",true);
        usuarios.add(adm);
        us++;
        //Criando lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();
        //Criando lista de pedidos
        ArrayList<Pedido> pedidos = new ArrayList<>();

        //Adionando produtos ao estoque
        Produto chocolate = new Produto(pdt,"chocolate",5,15,3);
        produtos.add(chocolate);
        pdt++;
        Produto cafe = new Produto(pdt,"cafe", 4,25, 2);
        produtos.add(cafe);
        pdt++;
        Produto azul = new Produto(pdt,"cafe", 4,25, 2);
        produtos.add(cafe);
        pdt++;
        Produto paodequeijo = new Produto(pdt,"cafe", 4,25, 2);
        produtos.add(cafe);
        pdt++;
        Produto pao = new Produto(pdt,"cafe", 4,25, 2);
        produtos.add(cafe);
        pdt++;
        Produto leite = new Produto(pdt,"cafe", 4,25, 2);
        produtos.add(cafe);
        pdt++;
        Produto acucar = new Produto(pdt,"cafe", 4,25, 2);
        produtos.add(cafe);
        pdt++;
        Produto pipoca = new Produto(pdt,"cafe", 4,25, 2);
        produtos.add(cafe);
        pdt++;
        //Criando Loja
        Loja loja = new Loja(0,0,0,0, produtos,pedidos,usuarios);


        //Criando Frame para Telinha
        JFrame frame = new JFrame("JOptionPane Loja");
        //Card de Bem Vindo
        JOptionPane.showMessageDialog(frame, "Seja bem vindo a Loja");
        //Instaciando objetos para input dialogo
        Object[] login = {"Login","Cadastro"};
        Object[] continuar = {"Sim","Não"};
        //Perguntando se tem cadastro ou não
        String op = (String) JOptionPane.showInputDialog(frame, "Escolha a opcao",
                "Opcao", JOptionPane.INFORMATION_MESSAGE, null, login, null);

        String listString = produtos.stream().map(Object::toString)
                .collect(Collectors.joining(", "));


        JOptionPane.showMessageDialog(frame, listString);

        if(op.equals("Login")){
            HashMap<String, Usuario> usuarioHashMap = new HashMap<String,Usuario>();
            for (Usuario user : loja.getUsuarios()) {
                usuarioHashMap.put(user.getEmail(), user);
            }
        } else{
            String email = s.next();
            String senha = s.next();

            Usuario novo = new Usuario(us,email, senha, false);
        }
    }




}
