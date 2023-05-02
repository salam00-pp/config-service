package com.bhn.configservice.repository;

import com.bhn.configservice.model.MenuItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MenuItemRepository extends MongoRepository<MenuItem, String>{

    Optional<MenuItem> findMenuItemByMenuItemId(String menuItem);

}
