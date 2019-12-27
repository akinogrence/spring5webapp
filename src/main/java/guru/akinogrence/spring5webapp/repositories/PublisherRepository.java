package guru.akinogrence.spring5webapp.repositories;

import guru.akinogrence.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
