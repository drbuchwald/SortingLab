/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.*;
import lab1.Song;

/**
 * 
 * @author Dan
 */
public class Startup {
    public static void main(String[] args) {
        Map<String, Song> songs = new LinkedHashMap<>();
        Song s1 = new Song("Don't Stop Believin", "Journey", " Escape", 4, 1981);
        Song s2 = new Song("Hotel California", "Eagles", "Desperado", (int) 6, 1972);
        Song s3 = new Song("Leave the Night On", "Sam Hunt","Montevallo", 3, 2014);
        Song s4 = new Song("The Best Thing", "Anthem Lights","None", (int) 3, 2010);
        
        songs.put(s1.getSongName(), s1);
        songs.put(s2.getSongName(), s2);
        songs.put(s3.getSongName(), s3);
        songs.put(s4.getSongName(), s4);
        
        for(String k : songs.keySet()) {
            System.out.println(songs.get(k).toString());
        }
        
    }
}
