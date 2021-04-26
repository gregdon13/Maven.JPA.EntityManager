package services;

import entities.Artists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import repositories.ArtistsRepository;

@Service
public class ArtistService {
    private final ArtistsRepository artistsRepository;

    @Autowired
    public ArtistService(ArtistsRepository artistsRepository) {
        this.artistsRepository = artistsRepository;
    }

    public Artists findOne(@PathVariable Long id) {
        return artistsRepository.findOne(id);
    }

    public Iterable<Artists> findAll() {
        return artistsRepository.findAll();
    }

    public Artists update(@PathVariable Long id, Artists artists) {
        Artists temp = artistsRepository.findOne(id);
        temp.setName(artists.getName());
        temp.setInstrumentation(artists.getInstrumentation());
        return artistsRepository.save(temp);
    }

    public Artists create(Artists artists) {
        return artistsRepository.save(artists);
    }

    public Boolean delete(Artists artists) {
        artistsRepository.delete(artists);
        return true;
    }
}
