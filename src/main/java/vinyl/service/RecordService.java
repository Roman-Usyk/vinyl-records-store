package vinyl.service;

import java.util.List;
import vinyl.model.Record;

public interface RecordService {
    Record add(Record record);

    Record getById(Long id);

    List<Record> getAll();
}
