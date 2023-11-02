package com.example.song;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
//import java.util.collection.Collection;
import java.util.*;
import com.example.song.Song;
import com.example.song.SongRepository;

// Don't modify the below code
public class SongService implements SongRepository {
    private static HashMap<Integer, Song> playlist = new HashMap<>();

    public SongService() {
        playlist.put(1, new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman S"));
        playlist.put(2, new Song(2, "Kathari Poovazhagi", "Vijay", "Benny Dayal, Swetha Mohan", "A.R. Rahman"));
        playlist.put(3, new Song(3, "Tum Hi Ho", "Mithoon", "Arijit Singh", "Mithoon"));
        playlist.put(4, new Song(4, "Vizhiyil", "Vairamuthu", "Unni Menon", "A.R. Rahman"));
        playlist.put(5, new Song(5, "Nenjame", "Panchu Arunachalam", "S.P.Balasubrahmanyam", "Ilaiyaraaja"));
    }

    int uniqueValue = 6;

    // Don't modify the above code

    // Write your code here
    @Override
    public ArrayList<Song> getPlayList() {
        Collection<Song> list = playlist.values();
        ArrayList<Song> arrList = new ArrayList<>(list);
        return arrList;
    }

    @Override
    public Song postSong(Song song) {
        
        song.setId(uniqueValue);
        playlist.put(uniqueValue, song);
        uniqueValue = uniqueValue + 1;
        return song;
    }

    @Override
    public Song getSongById(int id) {

        Song song = playlist.get(id);

        if (song == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return song;
        }

    }

    @Override
    public Song updateSong(int id, Song song) {

        Song currentSongObject = playlist.get(id);

        if (currentSongObject == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if (song.getSongName() != null) {
            currentSongObject.setSongName(song.getSongName());
        }

        if (song.getLyricist() != null) {
            currentSongObject.setLyricist(song.getLyricist());
        }

        if (song.getSinger() != null) {
            currentSongObject.setSinger(song.getSinger());
        }

        if (song.getMusicDirector() != null) {
            currentSongObject.setMusicDirector(song.getMusicDirector());
        }

        return currentSongObject;

    }

    @Override
    public void deleteSong(int id) {
        Song song = playlist.get(id);
        if (song == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {

            playlist.remove(id);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);

        }

    }
}

/*
 * ccbp submit JSBCPOPZ9A
 * private int id;
 * private String songName;
 * private String lyrics;
 * private String singer;
 * private String musicDirector;
 */
// https://github.com/Ravitheja5/mySpringBootRepository3ForSongsProject.git
