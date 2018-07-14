package example.springdata.multistore.web;

import example.springdata.multistore.domain.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HttpExecutor {

    @GetMapping("/songs")
    public List<Song> getSongs(){
        Song s1 = new Song("http://localhost/resources/m1.mp3","m1");
        Song s2 = new Song("http://localhost/resources/m1.mp3","m1");
        s1.setId(1L);
        s2.setId(2L);
        List<Song> songs = new ArrayList<>();
        songs.add(s1);
        songs.add(s2);

        return songs;
    }
}
