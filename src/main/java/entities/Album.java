package entities;

import java.util.List;

public class Album {
    private String name;
    private Integer id;
    private List<Music> musics;

    public Album(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Album() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }
}
