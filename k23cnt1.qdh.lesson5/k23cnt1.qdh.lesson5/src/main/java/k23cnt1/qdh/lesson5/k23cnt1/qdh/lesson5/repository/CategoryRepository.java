package k23cnt1.qdh.lesson5.k23cnt1.qdh.lesson5.repository;

import k23cnt1.qdh.lesson5.k23cnt1.qdh.lesson5.emtity.caretory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends
        JpaRepository<category, Long> {
}
