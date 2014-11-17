/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.*;
import lab1.Song;


/**
 * 
 * @author Dan
 */
public class Startup {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        Song s1 = new Song("Don't Stop Believin", "Journey", " Escape", 4, 1981);
        Song s2 = new Song("Hotel California", "Eagles", "Desperado", (int) 6, 1972);
        Song s3 = new Song("Leave the Night On", "Sam Hunt","Montevallo", 3, 2014);
        Song s4 = new Song("The Best Thing", "Anthem Lights","None", (int) 3, 2010);
        
        songs.add(s1);
        songs.add(s2);
        songs.add(s3);
        songs.add(s4);       
        
        Collections.sort(songs);
            
        for(Song s : songs) {
            System.out.println(s.toString());
        }
        
    }
}
