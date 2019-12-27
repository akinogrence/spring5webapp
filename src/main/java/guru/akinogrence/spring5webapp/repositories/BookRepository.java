package guru.akinogrence.spring5webapp.repositories;

import guru.akinogrence.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
