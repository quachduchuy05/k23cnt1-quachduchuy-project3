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
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Đổi từ AUTO
    private Long id;
    private String code;
    private String name;
    private String description;
    private String imgUrl;
    private String email;
    private String phone;
    private String address;
    private boolean isActive;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books = new ArrayList<>();
}
