package vinyl.dao;

import java.util.List;
import java.util.Optional;
import vinyl.model.Record;

public interface RecordDao {

    Record add(Record record);

    Optional<Record> getById(Long id);

    List<Record> getAll();
}
