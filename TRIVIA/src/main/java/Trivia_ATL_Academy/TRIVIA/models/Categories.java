package Trivia_ATL_Academy.TRIVIA.models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "category")
@Data
public class Categories {
    @Id  // -> la anotacion ID hace referencia a la primary key de nuestra tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
}
