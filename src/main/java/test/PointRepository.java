package test;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jussy on 31/08/15.
 */
public interface PointRepository extends MongoRepository<Point, String> {
}
