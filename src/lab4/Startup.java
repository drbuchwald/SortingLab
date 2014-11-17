/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.*;
import lab1.Song;


/**
 * 
 * @author Dan
 */
public class Startup {
    public static void main(String[] args) {
        TreeSet<Song> songList = new TreeSet<>();
        Song s1 = new Song("Don't Stop Believin", "Journey", " Escape", 4, 1981);
        Song s2 = new Song("Hotel California", "Eagles", "Desperado", (int) 6, 1972);
        Song s3 = new Song("Leave the Night On", "Sam Hunt","Montevallo", 3, 2014);
        Song s4 = new Song("The Best Thing", "Anthem Lights","None", (int) 3, 2010);
        
        songList.add(s1);
        songList.add(s2);
        songList.add(s3);
        songList.add(s4);       
        
        
            
        Iterator<Song> i = songList.iterator();
        while(i.hasNext()) {
            System.out.println(i.next().toString());
        }
        
    }
}
