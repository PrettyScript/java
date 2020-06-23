package udemy_exercises.songs;

import java.util.*;

class Album {
    private String artistName;
    private String albumName;
    private ArrayList<udemy_exercises.songs.Song> songs;

    public Album(String artistName, String albumName) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.songs = new ArrayList<>();
    }


    private int findSong(String songTitle) {
        for(int i=0; i<songs.size(); i++) {
            if(songs.get(i).getTitle().equals(songTitle)) {
                return i;
            }
        }
        return -1;
    }

    public void addSong(String songTitle, double duration) {
        if(findSong(songTitle) >= 0) {
            System.out.println("This song already exists...");
        } else {
            songs.add(new udemy_exercises.songs.Song(songTitle, duration));
        }
    }

    public static void main(String[] args) {

        Album album = new Album("Travis Scott", "Astroworld");
        album.addSong("Stargazing", 4.31);
        album.addSong("Sicko Mode", 5.13);
        album.addSong("No Bystanders", 3.38);
        album.addSong("Wake Up", 3.52);
        album.addSong("NC-17", 2.37);
        album.addSong("Astrothunder", 2.23);
        album.addSong("Butterfly Effect", 3.11);
        album.addSong("Yosemite", 2.30);
        album.addSong("Can't Say", 3.18);
        album.addSong("Who? What!", 2.57);

        Album album1 = new Album("Drake", "Dark Lane Demo Tapes");
        album1.addSong("Deep Pockets", 3.43);
        album1.addSong("Chicago Freestyle", 3.40);
        album1.addSong("Toosie Slide", 4.07);
        album1.addSong("Desires", 3.58);
        album1.addSong("Time Flies", 3.13);
        album1.addSong("Landed", 2.32);
        album1.addSong("D4L", 3.09);
        album1.addSong("From Florida With Love", 3.55);
        album1.addSong("War", 3.00);


        LinkedList<String> playlist = new LinkedList<>();

        addToPlaylist(playlist, "Butterfly Effect");
        addToPlaylist(playlist, "Desires");
        addToPlaylist(playlist, "Sicko Mode");
        addToPlaylist(playlist, "Time Flies");
        addToPlaylist(playlist, "Wake Up");
        addToPlaylist(playlist, "War");

        play(playlist);

    }

    private static void printOptions() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - play next song\n" +
                "2 - play previous song\n" +
                "3 - replay current song\n" +
                "4 - remove current song \n" +
                "5 - List songs in playlist\n" +
                "6 - Show available options");
    }

    private static void play(LinkedList<String> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        boolean changingSong = true;
        ListIterator<String> songListIterator = playlist.listIterator();

        if(playlist.isEmpty()) {
            System.out.println("You have no songs in this playlist");
        } else {
            System.out.println("Now playing " + playlist.iterator().next());
            printOptions();
        }

        while(!stop) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Music stopped playing");
                    stop = true;
                    break;
                case 1:
                    if(!changingSong) {
                        if(songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        changingSong = true;
                    }

                    if(songListIterator.hasNext()) {
                        System.out.println("Now playing " + songListIterator.next());
                    } else {
                        System.out.println("You've reached the end of the playlist");
                        changingSong = false;
                    }
                    break;
                case 2:
                    if(changingSong) {
                        if(songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        changingSong = false;
                    }

                    if(songListIterator.hasPrevious()) {
                        System.out.println("Now playing " + songListIterator.previous());
                    } else {
                        System.out.println("You have reached the beginning of the playlist");
                        changingSong = true;
                    }
                    break;
                case 3:
                    if(changingSong) {
                        if(songListIterator.hasPrevious()) {
                            System.out.println("Replaying " + songListIterator.previous());
                            changingSong = false;
                        } else {
                            System.out.println("You have reached the beginning of the playlist");
                        }
                    } else {
                        if(songListIterator.hasNext()) {
                            System.out.println("Replaying " + songListIterator.next());
                            changingSong = true;
                        } else {
                            System.out.println("You've reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    if(changingSong) {
                        if(songListIterator.hasPrevious()) {
                            System.out.println(songListIterator.previous() + " was removed.");
                            songListIterator.remove();
                            changingSong = true;
                        }
                    }
                case 5:
                    printPlaylist(playlist);
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }



    private static boolean addToPlaylist(LinkedList<String> playlist, String songTitle) {
        ListIterator<String> songListIterator = playlist.listIterator();

        while(songListIterator.hasNext()) {
            int contains = songListIterator.next().compareTo(songTitle);
            if(contains == 0) {
                System.out.println(songTitle + " is already in the playlist.");
                return false;
            } else if(contains > 0) {
                songListIterator.previous();
                songListIterator.add(songTitle);
                return true;
            }
        }
        songListIterator.add(songTitle);
        return true;
    }

    private static void printPlaylist(LinkedList<String> playlist) {
        Iterator<String> i = playlist.iterator();
        System.out.println("***********************");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("***********************");
    }
}
