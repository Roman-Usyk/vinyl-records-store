package vinyl.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinyl.dto.response.RecordDetailsResponseDto;
import vinyl.dto.response.RecordResponseDto;
import vinyl.service.RecordService;
import vinyl.service.mapper.RecordDtoMapper;

@RestController
@RequestMapping("/records")
public class RecordController {
    private final RecordService recordService;
    private final RecordDtoMapper recordDtoMapper;

    @Autowired
    public RecordController(RecordService recordService, RecordDtoMapper recordDtoMapper) {
        this.recordService = recordService;
        this.recordDtoMapper = recordDtoMapper;
    }

    @GetMapping("/{id}")
    public RecordDetailsResponseDto getById(@PathVariable Long id) {
        return recordDtoMapper.mapToDtoDetails(recordService.getById(id));
    }

    @GetMapping("/")
    public List<RecordResponseDto> getAll() {
        return recordService.getAll().stream()
                .map(recordDtoMapper::mapToDto)
                .collect(Collectors.toList());
    }
}
