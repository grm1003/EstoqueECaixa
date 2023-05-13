public class Usuario {
    private int id;
    private String email;
    private String senha;
    private boolean isAdm;

    public Usuario(int id, String email, String senha, boolean adm) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.isAdm = adm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdm() {
        return isAdm;
    }


    public void logarUsuario(String senha) throws Exception {
        Usuario a = new Usuario(01,email,senha,false);
        if (a.getSenha() != this.senha) throw new Exception("Erro ao logar");
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", adm=" + isAdm +
                '}';
    }
}
