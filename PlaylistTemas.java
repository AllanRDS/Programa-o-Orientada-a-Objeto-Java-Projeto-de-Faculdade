
import java.util.Scanner;

public class PlaylistTemas extends Playlist {
    String tema;
    Scanner input = new Scanner(System.in);    

    public void adicionarPlaylistTema(Playlist playlist, String tema) {
        this.tema = tema;
        System.out.println("");
        
        playlist.setTematica(tema);
    }

    }
