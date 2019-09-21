package edu.fiu.ffqr.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import edu.fiu.ffqr.models.Result;

@Repository
public interface FFQResponsesRepository extends MongoRepository<Result, String> {

	Result findByQuestionnaireId(String id);
}
