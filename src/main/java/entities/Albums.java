package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Albums {
    private @Id @GeneratedValue Long albumId;
    private String title;
    private Integer year;
    private Long artistId;
    private String genre;

    public Albums() {}

    public Albums(String title, Integer year, Long artistId, String genre) {
        this.title = title;
        this.year = year;
        this.artistId = artistId;
        this.genre = genre;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
