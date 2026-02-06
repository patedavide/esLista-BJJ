public class Tecnica {
    private String nome;
    private int difficolta;
    private Categoria categoria;

    public enum Categoria {
        SOTTOMISSIONE,
        PROIEZIONE
    }

    public Tecnica(String nome, int difficolta, Categoria categoria) {
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
    public Categoria getCategoria() {
        return categoria;
    }
}
