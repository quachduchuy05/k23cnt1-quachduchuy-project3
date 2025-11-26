package k23cnt1.qdh.lesson7.k23cnt1.qdh.lesson7.Service;

import k23cnt1.qdh.lesson7.k23cnt1.qdh.lesson7.Entity.Book;
import k23cnt1.qdh.lesson7.k23cnt1.qdh.lesson7.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
