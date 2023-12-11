
public class Musica {
    private String titulo;
    private String artista;
    private String categoria;
    private double duracaoMusica;


    public Musica (String titulo, String artista, String categoria , double duracaoMusica) {
        this.titulo = titulo;
        this.artista = artista;
        this.categoria = categoria;
        this.duracaoMusica = duracaoMusica;
    }
    

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getArtista () {
        return artista;
    }

    public void setArtista (String artista) {
        this.artista = artista;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDuracaoMusica() {
        return duracaoMusica;
    }

    public void setDuracaoMusica(double duracaoMusica) {
        this.duracaoMusica = duracaoMusica;
    }

}