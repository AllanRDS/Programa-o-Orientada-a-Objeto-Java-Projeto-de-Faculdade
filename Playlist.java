import java.util.ArrayList;

public class Playlist {
    private String nome;
    private String tematica;
    public double duracaoTotal;
    int numeroCasasDecimais = 2;

    ArrayList<Musica> playlistMusicas = new ArrayList<>();
    
    public Playlist () {
    }

    public Playlist (String nome) {
        this.nome = nome;
        this.playlistMusicas = new ArrayList<>();
    }

    // Para passar o nome da Playlist para PlaylistFavoritas
    public String getNome() {
        return nome;
    }

    public void setTematica(String tema) {
        this.tematica = tema;
    }

    public void adicionarPlaylist (Musica musica) {
        playlistMusicas.add(musica);
    }

    public ArrayList<Musica> getPlaylistMusicas() {
        return playlistMusicas;
    }

    public void acessarPlaylist () {
        System.out.println("O titulo da Playlist : " + nome);
        System.out.println("O tema da playlist é : " + tematica);
        System.out.println("");
        System.out.println("Musicas da Playlists :");
        System.out.println("");


        for(Musica musica : playlistMusicas) {
            if (playlistMusicas != null) {
                
                System.out.println("Nome da Música : " + musica.getTitulo());
                System.out.println("Artista : " + musica.getArtista());
                System.out.println("Categoria da Música : " + musica.getCategoria());
                System.out.println("Duração da Música : " + musica.getDuracaoMusica());
                System.out.println("");
            }
        }
        
        System.out.println("");
    }

        public void duracaoPlaylist() {

            for(Musica musica : playlistMusicas) {
                duracaoTotal = duracaoTotal + musica.getDuracaoMusica();
            }

            System.out.printf("A duração total da playlist " + nome +  " é: %.2f minutos%n", duracaoTotal);
            System.out.println("");
            System.out.println("");

        }

        public Musica getMusica(int numMusica) {
            if (numMusica >= 1 && numMusica <= playlistMusicas.size()) {
                return playlistMusicas.get(numMusica - 1);
            } else {
                return null;
            }
        }
        

}