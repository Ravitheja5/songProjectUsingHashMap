package com.example.song;

import java.util.*;
import com.example.song.Song;

interface SongRepository {

     ArrayList<Song> getPlayList();

     Song postSong(Song song);

     Song getSongById(int id);

     Song updateSong(int id, Song song);

     void deleteSong(int id);

}