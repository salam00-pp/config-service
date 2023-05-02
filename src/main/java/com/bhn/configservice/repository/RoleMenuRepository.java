package com.bhn.configservice.repository;

import com.bhn.configservice.model.relationalmodel.RoleMenuModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleMenuRepository extends MongoRepository<RoleMenuModel, String> {

    List<RoleMenuModel> findAllByRoleIdIs(List<String> roleIds);
    Optional<RoleMenuModel> findRoleMenuModelByRoleId(String roleId);
}
