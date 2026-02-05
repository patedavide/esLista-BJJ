public class Tecnica {

    private String nome;
    private int difficolta;
    private String categoria;

    public static final String RNC = "RNC";
    public static final String Leva = "Leva al braccio";
    public static final String Americana = "Americana";
    public static final String Kimura = "Kimura";
    public static final String Triangolo = "Triangolo";

    public Tecnica(String nome, int difficolta, String categoria){
        this.nome = nome;
        this.difficolta = difficolta;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getDifficolta() {
        return difficolta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDifficolta(int difficolta) {
        this.difficolta = difficolta;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
