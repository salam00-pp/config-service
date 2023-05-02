package com.bhn.configservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties
public class Component {
    private String compId;
    private String name;
    private String metaData;
    private Object additionalAttr;

    private List<Action> actionList;
    private String desc;

}
