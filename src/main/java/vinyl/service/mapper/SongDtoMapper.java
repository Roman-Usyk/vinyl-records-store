package vinyl.service.mapper;

import org.springframework.stereotype.Component;
import vinyl.model.Song;

@Component
public class SongDtoMapper {
    public vinyl.dto.response.SongResponseDto mapToDto(Song song) {
        vinyl.dto.response.SongResponseDto songResponseDto =
                new vinyl.dto.response.SongResponseDto();
        songResponseDto.setId(song.getId());
        songResponseDto.setTitle(song.getTitle());
        return songResponseDto;
    }
}
