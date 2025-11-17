package k23cnt1.qdh.lesson5.k23cnt1.qdh.lesson5.emtity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Primary;
@Entity
@Table (name = "products")
@Data
@Builder

Giới thiệu về spring core / SpringBoot

IT Research Department @Devmaster 2024 Page | 4
https://devmaster.edu.vn Học Cùng Doanh Nghiệp
Learn To Work – Học Để Làm Được Việc hotline: 0978.611.889
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String imageUrl;
    Integer quantity;
    Double price;
    String content;
    Boolean status;
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    Category category;
}
