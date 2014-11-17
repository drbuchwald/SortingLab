package lab1;

import java.util.Objects;

public class Song implements Comparable<Song> {
    
    private int songLength;
    private String songName;
    private String artist;
    private int yearReleased;
    private String album;

    public Song(String name, String artist, String album, int length, int year) {
        setSongName(name);
        setArtist(artist);
        setSongLength(length);
        setYearReleased(year);
        setAlbum(album);
    }

    @Override
    public String toString() {
        return "The song: '" + songName + "' by '" + artist +"' was released on the album '" + album + "' in the year "+ yearReleased +        
                " and is " + songLength + " minutes long (rounded down).";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (79 * hash + this.songLength);
        hash = 79 * hash + Objects.hashCode(this.songName);
        hash = 79 * hash + Objects.hashCode(this.artist);
        hash = 79 * hash + Objects.hashCode(this.album);
        hash = 79 * hash + this.yearReleased;
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.songName, other.songName)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!Objects.equals(this.album, other.album)) {
            return false;
        }
        return true;
    }
    
    public final double getSongLength() {
        return songLength;
    }

    public final void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public final String getSongName() {
        return songName;
    }

    public final void setSongName(String songName) {
        this.songName = songName;
    }

    public final String getArtist() {
        return artist;
    }

    public final void setArtist(String artist) {
        this.artist = artist;
    }

    public final int getYearReleased() {
        return yearReleased;
    }

    public final void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
    

    @Override
    public int compareTo(Song o) {
        
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        int result = EQUAL;
        
        if(this.getYearReleased() < o.getYearReleased()) {
            result = BEFORE;
        }
        if(this.getYearReleased() > o.getYearReleased()) {
            result = AFTER;
        }
        if(result == EQUAL) {
            result = this.getSongName().compareTo(o.getSongName());
        }
        if(result == EQUAL) {
            result = this.getArtist().compareTo(o.getArtist());
        }
        return result;
    }

}
