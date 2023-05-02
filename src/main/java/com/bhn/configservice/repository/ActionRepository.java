package com.bhn.configservice.repository;

import com.bhn.configservice.model.Action;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends MongoRepository<Action, String> {

}
