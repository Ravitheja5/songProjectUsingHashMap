package com.example.song;

public class Song {
     private int songId;
     private String songName;
     private String lyricist;
     private String singer;
     private String musicDirector;

     public Song(int id, String songName, String lyricist, String singer, String musicDirector) {
          this.songId = id;
          this.songName = songName;
          this.lyricist = lyricist;
          this.singer = singer;
          this.musicDirector = musicDirector;

     }

     public int getId() {
          return this.songId;
     }

     public void setId(int newId) {
          this.songId = newId;
     }

     public String getSongName() {
          return this.songName;
     }

     public void setSongName(String newSongName) {
          this.songName = newSongName;
     }

     public String getLyricist() {
          return this.lyricist;
     }

     public void setLyricist(String newLyricist) {
          this.lyricist = newLyricist;
     }

     public String getSinger() {
          return this.singer;
     }

     public void setSinger(String newSinger) {
          this.singer = newSinger;
     }

     public String getMusicDirector() {
          return this.musicDirector;
     }

     public void setMusicDirector(String newMusicDirector) {
          this.musicDirector = newMusicDirector;
     }

}