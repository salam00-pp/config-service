package com.bhn.configservice.repository;

import com.bhn.configservice.model.Component;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends MongoRepository<Component ,String> {
}
