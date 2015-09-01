package test;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Justin Lewis Salmon
 */
public interface RequestRepository extends MongoRepository<Request, String> {
}
