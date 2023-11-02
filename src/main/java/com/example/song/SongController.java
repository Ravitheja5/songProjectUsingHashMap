package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;
import com.example.song.Song;

// Write your code here
@RestController
public class SongController {
    SongService serviceObject = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getList() {

        return serviceObject.getPlayList();
    }

    @PostMapping("/songs")
    public Song postASong(@RequestBody Song song) {
        return serviceObject.postSong(song);
    }

    @GetMapping("/songs/{songId}")

    public Song getSongByIdMethod(@PathVariable("songId") int id) {
        return serviceObject.getSongById(id);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSongMethod(@PathVariable("songId") int id, @RequestBody Song song) {

        return serviceObject.updateSong(id, song);

    }

    @DeleteMapping("/songs/{songId}")

    public void deleteSongMethod(@PathVariable("songId") int id) {
        serviceObject.deleteSong(id);

    }
}