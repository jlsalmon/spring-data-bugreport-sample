package test;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Justin Lewis Salmon
 */
public interface PointRepository extends MongoRepository<Point, String> {
}
