package services;

import entities.Albums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import repositories.AlbumRepository;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository;

    @Autowired
    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public Albums findOne(Long id) {
        return albumRepository.findOne(id);
    }

    public Iterable<Albums> findAll() {
        return albumRepository.findAll();
    }

    public Albums update(@PathVariable Long id, Albums albums) {
        Albums temp = albumRepository.findOne(id);
        temp.setTitle(albums.getTitle());
        temp.setArtistId(albums.getArtistId());
        temp.setGenre(albums.getGenre());
        temp.setYear(albums.getYear());
        return albumRepository.save(temp);
    }

    public Albums create(Albums albums) {
        return albumRepository.save(albums);
    }

    public Boolean delete(Albums albums) {
        albumRepository.delete(albums);
        return true;
    }
}
