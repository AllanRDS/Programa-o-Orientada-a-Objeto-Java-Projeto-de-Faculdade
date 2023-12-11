import java.util.ArrayList;

public class PlaylistFavoritas extends Playlist {

    ArrayList<Playlist> playlistFavoritas = new ArrayList<>();
    ArrayList<Musica> musicasFavoritas = new ArrayList<>();

    public void adicionarPlaylistFavoritas (Playlist playlist) {
        playlistFavoritas.add(playlist);
        System.out.println("A playlist " + playlist.getNome() + " Foi favoritada");
        System.out.println("");
    }

    public void adicionarMusicasFavoritas (Playlist playlist, Musica musica) {
        if (!playlist.getPlaylistMusicas().contains(musica)) {
            System.out.println("Essa música não está na playlist");
        }

        else {
            musicasFavoritas.add(musica);
            System.out.println("Música adicionada a Favoritos : " + "| Nome da Música : " + musica.getTitulo() + " | Playlist : " + playlist.getNome());
            System.out.println("");
        }
    }

    public void acessarPlaylistFavorita (Playlist playlist) {
        
        System.out.println("O nome da Playlist favorita é : " + playlist.getNome());
        System.out.println("");
        System.out.println("Musicas da Playlists");
        System.out.println("");

        acessarMusicasPlaylistFavorita(playlist);
    }
    
    public void acessarMusicasPlaylistFavorita(Playlist playlist) {

        ArrayList<Musica> musicas = playlist.getPlaylistMusicas();

        if (musicas != null) {
            for (Musica musica : musicas) {  
                System.out.println("Nome da Música : " + musica.getTitulo());
                System.out.println("Artista : " + musica.getArtista());
                System.out.println("Categoria da Música : " + musica.getCategoria());
                System.out.println("Duração da Música : " + musica.getDuracaoMusica());
                System.out.println("");
            }
        }
    }

    public void acessarMusicasFavoritas(Playlist playlist) {
        
    System.out.println("O nome da Playlist é : " + playlist.getNome());
    System.out.println("Musicas favoritas da Playlist  : ");
    System.out.println("_______");
    System.out.println("");
        
    for (Musica musicaFavorita : musicasFavoritas) {  
        if (playlist.getPlaylistMusicas().contains(musicaFavorita)) {
            System.out.println("Nome da Música : " + musicaFavorita.getTitulo());
            System.out.println("Artista : " + musicaFavorita.getArtista());
            System.out.println("Categoria da Música : " + musicaFavorita.getCategoria());
            System.out.println("Duração da Música : " + musicaFavorita.getDuracaoMusica());
            System.out.println("");
        }
    }
}
}