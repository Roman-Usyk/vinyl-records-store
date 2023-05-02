package vinyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinyl.dto.response.SongResponseDto;
import vinyl.service.SongService;
import vinyl.service.mapper.SongDtoMapper;

@RestController
@RequestMapping("/songs")
public class SongController {
    private final SongService service;
    private final SongDtoMapper songDtoMapper;

    @Autowired
    public SongController(SongService service, SongDtoMapper songDtoMapper) {
        this.service = service;
        this.songDtoMapper = songDtoMapper;
    }

    @GetMapping("/{id}")
    public SongResponseDto getById(@PathVariable Long id) {
        return songDtoMapper.mapToDto(service.getById(id));
    }
}
