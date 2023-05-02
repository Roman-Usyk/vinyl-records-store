package vinyl.dao;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vinyl.exception.DataProcessingException;
import vinyl.model.Record;

@Repository
public class RecordDaoImpl implements RecordDao {
    private static final Logger logger = LogManager.getLogger(RecordDaoImpl.class);
    private SessionFactory sessionFactory;

    @Autowired
    public RecordDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Record add(Record record) {
        logger.info("Method add was called with record " + record);
        Transaction transaction = null;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(record);
            transaction.commit();
            return record;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            logger.error("Can`t insert record: " + record);
            throw new DataProcessingException("Can't insert record " + record, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Record> getById(Long id) {
        logger.info("Method get by id was called with id: " + id);
        try (Session session = sessionFactory.openSession()) {
            Query<Record> recordQuery = session.createQuery("FROM Record r "
                    + "LEFT JOIN FETCH r.songList "
                    + "WHERE r.id = :id", Record.class);
            recordQuery.setParameter("id", id);
            return recordQuery.uniqueResultOptional();
        } catch (Exception e) {
            logger.error("Can`t get record by id: " + id);
            throw new DataProcessingException("Can't get record by id " + id, e);
        }
    }

    @Override
    public List<Record> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Record> allRecordsQuery = session.createQuery("FROM Record r ", Record.class);
            return allRecordsQuery.getResultList();
        } catch (Exception e) {
            logger.error("Can't get all records!!!");
            throw new DataProcessingException("Can't get all records", e);
        }
    }
}

