import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMusica;
        String nomeBanda;
        String generoBanda;
        Float duracaoMusica;

        Musica musica1 = new Musica("Diz pra mim", "Malta", "Rock", 3.23);
        Musica musica2 = new Musica("Um minuto para o fim do mundo", "Cpm22", "Rock", 3.18);
        Musica musica3 = new Musica("Stay with me", "Miki Matsubara", "Pop", 5.12);

        Playlist playlist1 = new Playlist("Anos 2000");
        PlaylistTemas w = new PlaylistTemas();

        w.adicionarPlaylistTema(playlist1, "Rock");

        playlist1.adicionarPlaylist(musica1);
        playlist1.adicionarPlaylist(musica2);
        playlist1.adicionarPlaylist(musica3);

        Musica musica4 = new Musica("Eye of the tiger", "Survivor", "Rock", 4.03);
        Musica musica5 = new Musica("Flyday Chinatown", "Yasuha", "Jpop", 3.28);
        Musica musica6 = new Musica("You are the best", "Joe Esposito", "Pop", 2.59);

        Playlist playlist2 = new Playlist("Anos 80");

        w.adicionarPlaylistTema(playlist2, "Rock-Pop");

        playlist2.adicionarPlaylist(musica4);
        playlist2.adicionarPlaylist(musica5);
        playlist2.adicionarPlaylist(musica6);

        PlaylistFavoritas playlistFav = new PlaylistFavoritas();

        int opcao;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Acessar Playlist 1");
            System.out.println("2. Acessar Playlist 2");
            System.out.println("3. Adicionar Playlist 1 às Favoritas");
            System.out.println("4. Adicionar Música favorita à Playlist 1");
            System.out.println("5. Adicionar Nova Música à Playlist 1");
            System.out.println("6. Adicionar Música favorita à Playlist 2");
            System.out.println("7. Adicionar Nova Música à Playlist 2");
            System.out.println("8. Acessar Músicas Favoritas da Playlist 1");
            System.out.println("9. Acessar Músicas Favoritas da Playlist 2");
            System.out.println("10. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("");
                    playlist1.acessarPlaylist();
                    playlist1.duracaoPlaylist();
                    break;
                case 2:
                    System.out.println("");
                    playlist2.acessarPlaylist();
                    playlist2.duracaoPlaylist();
                    break;
                case 3:
                    playlistFav.adicionarPlaylistFavoritas(playlist1);
                    break;
                case 4:
                    System.out.print("Digite o número da música que deseja adicionar à Playlist Favorita 1: ");
                    int numMusica = scanner.nextInt();
                    if (numMusica >= 1 && numMusica < 4) {
                        Musica musicaSelecionada = playlist1.getMusica(numMusica);
                        playlistFav.adicionarMusicasFavoritas(playlist1, musicaSelecionada);
                        System.out.println("Música adicionada à Playlist Favorita 1!");
                    } else {
                        System.out.println("Número de música inválido. Tente novamente.");
                    }
                    break;
                case 5:
                    System.out.println("");
                    System.out.print("Digite o nome da nova música: ");
                    nomeMusica = scanner.next();
                    scanner.nextLine();
                    System.out.print("Digite o nome do artista: ");
                    nomeBanda = scanner.nextLine();
                    System.out.print("Digite o genêro da música: ");
                    generoBanda = scanner.next();
                    System.out.print("Digite a duração da música: ");
                    duracaoMusica = scanner.nextFloat();

                    Musica novaMusica1 = new Musica(nomeMusica, nomeBanda, generoBanda, duracaoMusica);
                    playlist1.adicionarPlaylist(novaMusica1);
                    System.out.println("Nova música adicionada à Playlist 1!");
                    break;
                case 6:
                    System.out.print("Digite o número da música que deseja adicionar à Playlist Favorita 2: ");
                    int numMusica2 = scanner.nextInt();

                if (numMusica2 >= 1 && numMusica2 < 4) {
                        Musica musicaSelecionada = playlist1.getMusica(numMusica2);
                        playlistFav.adicionarMusicasFavoritas(playlist2, musicaSelecionada);
                        System.out.println("Música adicionada à Playlist Favorita 2!");
                    } else {
                        System.out.println("Número de música inválido. Tente novamente.");
                    }
                    break;
                case 7:
                    System.out.println("");
                    System.out.print("Digite o nome da nova música: ");
                    nomeMusica = scanner.next();
                    scanner.nextLine();
                    System.out.print("Digite o nome do artista: ");
                    nomeBanda = scanner.nextLine();
                    System.out.print("Digite o gênero da música : ");
                    generoBanda = scanner.next();
                    System.out.print("Digite a duração da música: ");
                    duracaoMusica = scanner.nextFloat();

                    Musica novaMusica2 = new Musica(nomeMusica, nomeBanda, generoBanda, duracaoMusica);
                    playlist2.adicionarPlaylist(novaMusica2);
                    System.out.println("Nova música adicionada à Playlist 2!");
                    break;
                case 8:
                    System.out.println("");
                    playlistFav.acessarMusicasFavoritas(playlist1);
                    break;
                case 9:
                    System.out.println("");
                    playlistFav.acessarMusicasFavoritas(playlist2);
                    break;
                case 10:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 10);
        scanner.close();
    }
}