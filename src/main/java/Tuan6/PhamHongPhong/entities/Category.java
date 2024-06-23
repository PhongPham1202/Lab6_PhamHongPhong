package Tuan6.PhamHongPhong.entities;



import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@Table(name="category")

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Book> books;


}
