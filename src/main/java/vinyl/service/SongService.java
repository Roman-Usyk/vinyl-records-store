package vinyl.service;

import vinyl.model.Song;

public interface SongService {
    Song add(Song song);

    Song getById(Long id);
}
