package k23cnt1.qdh.lesson7.k23cnt1.qdh.lesson7.Repository;

import k23cnt1.qdh.lesson7.k23cnt1.qdh.lesson7.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuthorRepository extends
        JpaRepository<Author, Long> {
}
