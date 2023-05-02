package com.bhn.configservice.model.relationalmodel;

import com.bhn.configservice.model.MenuItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties
public class RoleMenuModel {


    private String roleMenuId;
    private String roleId;
    private List<MenuItem> menuList;
}
