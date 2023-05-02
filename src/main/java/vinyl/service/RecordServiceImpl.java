package vinyl.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vinyl.dao.RecordDao;
import vinyl.model.Record;

@Service
public class RecordServiceImpl implements RecordService {
    private RecordDao recordDao;

    @Autowired
    public RecordServiceImpl(RecordDao recordDao) {
        this.recordDao = recordDao;
    }

    @Override
    public Record add(Record record) {
        return recordDao.add(record);
    }

    @Override
    public Record getById(Long id) {
        return recordDao.getById(id)
                .orElseThrow(() -> new RuntimeException("Can't get record by id " + id));
    }

    @Override
    public List<Record> getAll() {
        return recordDao.getAll();
    }
}
