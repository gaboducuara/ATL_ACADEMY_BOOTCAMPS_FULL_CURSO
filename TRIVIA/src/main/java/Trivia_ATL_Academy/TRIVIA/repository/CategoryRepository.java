package Trivia_ATL_Academy.TRIVIA.repository;

import Trivia_ATL_Academy.TRIVIA.models.Categories;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CategoryRepository {

    @PersistenceContext
    EntityManager conexionBaseDeDatos;

    public Categories findById(Long id) {
        return conexionBaseDeDatos.find(Categories.class, id);
    }
}
