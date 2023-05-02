package vinyl.service.mapper;

import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vinyl.dto.response.RecordDetailsResponseDto;
import vinyl.dto.response.RecordResponseDto;
import vinyl.model.Record;

@Component
public class RecordDtoMapper {
    private final SongDtoMapper songDtoMapper;

    @Autowired
    public RecordDtoMapper(SongDtoMapper songDtoMapper) {
        this.songDtoMapper = songDtoMapper;
    }

    public RecordResponseDto mapToDto(Record record) {
        RecordResponseDto recordResponseDto = new RecordResponseDto();
        recordResponseDto.setId(record.getId());
        recordResponseDto.setPerformer(record.getPerformer());
        recordResponseDto.setTitleAlbum(record.getTitleAlbum());
        recordResponseDto.setGenre(record.getGenre());
        recordResponseDto.setYear(record.getYear());
        recordResponseDto.setPrice(record.getPrice());
        recordResponseDto.setDiscount(record.getDiscount());
        recordResponseDto.setPictureUrl(record.getPictureUrl());
        recordResponseDto.setColor(record.getColor());
        return recordResponseDto;
    }

    public RecordDetailsResponseDto mapToDtoDetails(Record record) {
        RecordDetailsResponseDto recordResponseDto = new RecordDetailsResponseDto();
        recordResponseDto.setId(record.getId());
        recordResponseDto.setPerformer(record.getPerformer());
        recordResponseDto.setTitleAlbum(record.getTitleAlbum());
        recordResponseDto.setGenre(record.getGenre());
        recordResponseDto.setYear(record.getYear());
        recordResponseDto.setCountry(record.getCountry());
        recordResponseDto.setLabel(record.getLabel());
        recordResponseDto.setSongs(record.getSongList().stream()
                .map(s -> songDtoMapper.mapToDto(s))
                .collect(Collectors.toList()));
        recordResponseDto.setPrice(record.getPrice());
        recordResponseDto.setDiscount(record.getDiscount());
        recordResponseDto.setPictureUrl(record.getPictureUrl());
        recordResponseDto.setFormat(record.getFormat());
        recordResponseDto.setColor(record.getColor());
        return recordResponseDto;
    }
}
