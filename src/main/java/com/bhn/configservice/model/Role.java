package com.bhn.configservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@JsonIgnoreProperties
public class Role {
    private String roleId;
    private String roleName;
    private String description;



}
