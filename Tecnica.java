public class Tecnica {

    private String nome;
    private int difficolta;
    private String categoria;

    public static final String RNC = "0";
    public static final String Leva = "1";
    public static final String Americana = "2";
    public static final String Kimura = "3";
    public static final String Triangolo = "4";

    public enum NomeTecnica {
        RNC,
        Leva,
        Americana,
        Kimura,
        Triangolo
    }

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
