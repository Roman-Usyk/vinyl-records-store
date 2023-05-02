package vinyl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vinyl.dao.SongDao;
import vinyl.model.Song;

@Service
public class SongServiceImpl implements SongService {
    private SongDao songDao;

    @Autowired
    public SongServiceImpl(SongDao songDao) {
        this.songDao = songDao;
    }

    @Override
    public Song add(Song song) {
        return songDao.add(song);
    }

    @Override
    public Song getById(Long id) {
        return songDao.getById(id)
                .orElseThrow(() -> new RuntimeException("Can't get song by id " + id));
    }
}
