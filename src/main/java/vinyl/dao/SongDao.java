package vinyl.dao;

import java.util.Optional;
import vinyl.model.Song;

public interface SongDao {
    Song add(Song song);

    Optional<Song> getById(Long id);
}
