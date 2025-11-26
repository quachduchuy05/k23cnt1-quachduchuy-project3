package k23cnt1.qdh.lesson7.k23cnt1.qdh.lesson7.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Đổi từ AUTO
    private Long id;
    private String code;
    private String name;
    private String description;
    private String imgUrl;
    private Integer quantity;
    private Double price;
    private Boolean isActive;

    @ManyToMany
    @JoinTable(
            name = "book_author",  // Chữ thường
            joinColumns = @JoinColumn(name = "book_id"),  // snake_case
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authors = new ArrayList<>();
}
