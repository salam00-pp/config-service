package com.bhn.configservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties
public class Action {
    private String actionId;
    private String actionName;
    private String desc;
}
