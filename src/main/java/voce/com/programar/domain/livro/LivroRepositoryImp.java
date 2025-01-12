package voce.com.programar.domain.livro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


// livrariaPU


public class LivroRepositoryImp implements LivroRepository{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("livrariaPU");
    private EntityManager em = emf.createEntityManager();


    @Override
    public Optional<Livro> findById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            return Optional.ofNullable(em.find(Livro.class, id));
        } finally {
            em.close();
        }
    }

    @Override
    public Livro save(Livro livro) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(livro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
        return livro;
    }

    @Override
    public List<Livro> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT l FROM Livro l", Livro.class).getResultList();
        } finally {
            em.close();
        }
    }

    public void close() {
        if (emf.isOpen()) {
            emf.close();
        }
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Livro> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Livro> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Livro> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Livro getOne(Long aLong) {
        return null;
    }

    @Override
    public Livro getById(Long aLong) {
        return null;
    }

    @Override
    public Livro getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Livro> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Livro> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Livro> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Livro> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Livro> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Livro> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Livro, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }


    @Override
    public <S extends Livro> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }


    @Override
    public boolean existsById(Long aLong) {
        return false;
    }


    @Override
    public List<Livro> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Livro entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Livro> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Livro> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Livro> findAll(Pageable pageable) {
        return null;
    }
}
