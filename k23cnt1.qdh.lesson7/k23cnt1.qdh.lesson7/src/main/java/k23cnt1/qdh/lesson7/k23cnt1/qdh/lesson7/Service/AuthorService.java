package k23cnt1.qdh.lesson7.k23cnt1.qdh.lesson7.Service;

import k23cnt1.qdh.lesson7.k23cnt1.qdh.lesson7.Entity.Book;
import k23cnt1.qdh.lesson7.k23cnt1.qdh.lesson7.Entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
    public List<Author> findAllById(List<Long> ids) {
        return authorRepository.findAllById(ids);
    }
}
